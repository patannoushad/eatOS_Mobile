package com.qa.pages;

import com.qa.utils.CommonUtils;
import com.qa.utils.TestData;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;

public class LoginScreen extends BasePage  {

    CommonUtils utils = new CommonUtils();

    @AndroidFindBy(xpath ="//android.widget.EditText[@hint='Enter email or mobile']")
    //  @AndroidFindBy(xpath = "//android.widget.EditText[@hint='jhon@email.com']")
    private WebElement usernameTxtFld;

    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Password']")
    //  @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Password']")
    private WebElement passwordTxtFld;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"LOG IN\"]")
    //  @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"SIGN IN\"]")
    private WebElement loginBtn;



    public LoginScreen() {
    }
    public void enterLoginDetails(String testcaseID) throws FileNotFoundException {
        TestData.readTestData(testcaseID);
        typeTextIntoElement(usernameTxtFld,TestData.get("username"));
        passwordTxtFld.sendKeys(TestData.get("password"));
        clickOnElement(loginBtn);
    }



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Email and Password cannot be empty.\"]")
    private WebElement errTxt;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Point Of Purchase\"]")
    private WebElement Title;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='1']")
    private WebElement Pin1;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='2']")
    private WebElement Pin2;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='3']")
    private WebElement Pin3;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='4']")
    private WebElement Pin4;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='5']")
    private WebElement Pin5;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='6']")
    private WebElement Pin6;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='7']")
    private WebElement Pin7;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='8']")
    private WebElement Pin8;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='9']")
    private WebElement Pin9;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='0']")
    private WebElement Pin0;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc='ENTER']")
    private WebElement enter;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.eatos.pos:id/ib_core_tv_title\"]")
    private WebElement instaBug;
    @AndroidFindBy(accessibility = "Custom Item Tab 2 of 2")
    private WebElement customItem;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Forgot Your Password?\"]")
    private WebElement creatAnAccountButton;

    public void createAnAccount(){
        clickOnElement(creatAnAccountButton);
    }


    @AndroidFindBy(xpath = "//android.widget.Toast[@text=\"Email and Password cannot be empty.\"]")
    private WebElement erroMsg;
    public WebElement instaBug(){
        return instaBug;
    }

  //  String toastMsg = erroMsg.getText();
    public String getErrTxt() {
        return erroMsg.getText();
    }
    public void enterLoginPin(){
        longwaitForVisibility(Pin1);
        clickOnElement(Pin1);
        clickOnElement(Pin1);
        clickOnElement(Pin1);
        clickOnElement(Pin1);
        clickOnElement(enter);
    }

    public void verifyErrorMsg(String testcaseID)  {
        Assert.assertEquals(getErrTxt(),TestData.get("errorMsg"));
    }

    public void enterUserName(String username)  {
        waitForVisibilityOfElement(instaBug);
        clickOnElement(usernameTxtFld);
        clearText(usernameTxtFld);
        typeTextIntoElement(usernameTxtFld, username, "login with " + username);
    }
    public void enterPassword(String password) {
        clickOnElement(passwordTxtFld);
        clearText(passwordTxtFld);
        typeTextIntoElement(passwordTxtFld, password, "password is " + password);
    }
    public void pressLoginBtn() {
        clickOnElement(loginBtn, "press login button");
        new ProductsScreen();
    }
    public void login(String username, String password) {
        if (instaBug().isDisplayed()){
            waitForVisibility(instaBug);
        }
        clickOnElement(usernameTxtFld);
        typeTextIntoElement(usernameTxtFld,username);
        clickOnElement(passwordTxtFld);
        typeTextIntoElement(passwordTxtFld,password);
        pressLoginBtn();
    }
}
