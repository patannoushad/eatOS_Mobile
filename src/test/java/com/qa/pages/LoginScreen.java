package com.qa.pages;


import com.qa.utils.TestData;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.FileNotFoundException;

public class LoginScreen extends BasePage  {

    //Create An Account

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='CREATE AN ACCOUNT']")
    private WebElement CreateAnAccount;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='CREATE AN ACCOUNT']")
    public WebElement creatAnAccountButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CREATE AN ACCOUNT']")
    private WebElement CreateAnAccountButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Create An Account']")
    private WebElement createAnActTitle;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter First Name']")
    private WebElement firstNameField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Last Name']")
    private WebElement lastNameField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Email Address']")
    private WebElement emailAddressField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='(123) 456 7890']")
    private WebElement phoneNumField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Restaurant Name']")
    private WebElement restaurantNameField;
    @AndroidFindBy(xpath = "(//android.widget.Button)[2]")
    private WebElement restaurantTypeField;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Seller Agreement ']")
    private WebElement sellerAgreement;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='e-Sign Consent ']")
    private WebElement eSignConsent;

    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Please enter your First Name!']")
    private WebElement emptyFirstnameErrMsg;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Please enter your Last Name!']")
    private WebElement emptyLastErrMsg;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Please enter your Email!']")
    private WebElement emptyEmailErrMsg;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Please make sure to fill out all necessary information']")
    private WebElement allNecessaryInfoErrMsg;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Please enter your Email!']")
    private WebElement allEmptyErrMsg;


    public void tapOnCreateAnAccount(){
        clickOnElement(CreateAnAccount);
    }

    public void enterCreateAnAccountDetails(String val){

        if(val.equals("emptyFirstName")){

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            clickOnElement(lastNameField);
            typeTextIntoElement(lastNameField,"Manager");
            clickOnElement(emailAddressField);
            typeTextIntoElement(emailAddressField,"abc@gmail.com");
            clickOnElement(phoneNumField);
            typeTextIntoElement(phoneNumField,"1234567899");
            clickOnElement(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld,"@Password1");
            clickOnElement(restaurantNameField);
            typeTextIntoElement(restaurantNameField,"Yonox");
            clickOnElement(CreateAnAccountButton);

        }else if (val.equals("emptyLastName")){

            clickOnElement(firstNameField);
            typeTextIntoElement(firstNameField,"Login");
            clickOnElement(emailAddressField);
            typeTextIntoElement(emailAddressField,"abc@gmail.com");
            clickOnElement(phoneNumField);
            typeTextIntoElement(phoneNumField,"1234567899");
            clickOnElement(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld,"@Password1");
            clickOnElement(restaurantNameField);
            typeTextIntoElement(restaurantNameField,"Yonex");
            clickOnElement(CreateAnAccountButton);

        } else if (val.equalsIgnoreCase("emptyEmail")) {

            clickOnElement(firstNameField);
            typeTextIntoElement(firstNameField,"Login");
            clickOnElement(lastNameField);
            typeTextIntoElement(lastNameField,"Manager");
            clickOnElement(emailAddressField);
            typeTextIntoElement(emailAddressField,"abc@gmail.com");
            clickOnElement(phoneNumField);
            typeTextIntoElement(phoneNumField,"1234567899");
            clickOnElement(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld,"@Password1");
            clickOnElement(restaurantNameField);
            typeTextIntoElement(restaurantNameField,"Yonox");
            clickOnElement(CreateAnAccountButton);

        } else if (val.equalsIgnoreCase("emptyPhoneNum")) {

            clickOnElement(firstNameField);
            typeTextIntoElement(firstNameField,"Login");
            clickOnElement(lastNameField);
            typeTextIntoElement(lastNameField,"Manager");
            clickOnElement(emailAddressField);
            typeTextIntoElement(emailAddressField,"abc@gmail.com");
            clickOnElement(phoneNumField);
            typeTextIntoElement(phoneNumField,"1234567899");
            clickOnElement(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld,"@Password1");
            clickOnElement(restaurantNameField);
            typeTextIntoElement(restaurantNameField,"Yonox");
            clickOnElement(CreateAnAccountButton);

        } else if (val.equalsIgnoreCase("emptyPassword")) {

            clickOnElement(firstNameField);
            typeTextIntoElement(firstNameField,"Login");
            clickOnElement(lastNameField);
            typeTextIntoElement(lastNameField,"Manager");
            clickOnElement(emailAddressField);
            typeTextIntoElement(emailAddressField,"abc@gmail.com");
            clickOnElement(phoneNumField);
            typeTextIntoElement(phoneNumField,"1234567899");
            clickOnElement(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld,"@Password1");
            clickOnElement(restaurantNameField);
            typeTextIntoElement(restaurantNameField,"Yonox");
            clickOnElement(CreateAnAccountButton);

        } else if (val.equalsIgnoreCase("restaurantName")) {

            clickOnElement(firstNameField);
            typeTextIntoElement(firstNameField,"Login");
            clickOnElement(lastNameField);
            typeTextIntoElement(lastNameField,"Manager");
            clickOnElement(emailAddressField);
            typeTextIntoElement(emailAddressField,"abc@gmail.com");
            clickOnElement(phoneNumField);
            typeTextIntoElement(phoneNumField,"1234567899");
            clickOnElement(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld,"@Password1");
            clickOnElement(restaurantNameField);
            typeTextIntoElement(restaurantNameField,"Yonox");
            clickOnElement(CreateAnAccountButton);
        }else if (val.equalsIgnoreCase("allEmptyFields")) {

            clickOnElement(CreateAnAccountButton);
        }
    }

    public void createAnAccountErrMsg(String val){
        if(val.equalsIgnoreCase("VerifyTitle")){
            Assert.assertTrue( createAnActTitle.isDisplayed());
        } else if (val.equalsIgnoreCase("emptyFirstName")){

            Assert.assertTrue(emptyFirstnameErrMsg.isDisplayed());
        } else if (val.equalsIgnoreCase("emptyLastName")) {

            Assert.assertTrue(emptyLastErrMsg.isDisplayed());
        } else if (val.equalsIgnoreCase("emptyEmail")) {

            Assert.assertTrue(emptyEmailErrMsg.isDisplayed());
        } else if (val.equalsIgnoreCase("emptyPhoneNum")) {

            Assert.assertTrue(allNecessaryInfoErrMsg.isDisplayed());
        }else if (val.equalsIgnoreCase("emptyPassword")) {

            Assert.assertTrue(allNecessaryInfoErrMsg.isDisplayed());
        } else if (val.equalsIgnoreCase("restaurantName")) {

            Assert.assertTrue(allNecessaryInfoErrMsg.isDisplayed());
        }else if (val.equalsIgnoreCase("allEmptyFields")) {

            Assert.assertTrue(allEmptyErrMsg.isDisplayed());
        }
    }

    //login

    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='jhon@email.com']")
    public WebElement usernameTxtFld;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Password']")
    private WebElement passwordTxtFld;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='SIGN IN']")
    public WebElement loginBtn;


    public LoginScreen() {
    }
    public void enterLoginDetails(String testcaseID) throws FileNotFoundException {
        TestData.readTestData(testcaseID);
        typeTextIntoElement(usernameTxtFld,TestData.get("username"));
        passwordTxtFld.sendKeys(TestData.get("password"));
        clickOnElement(loginBtn);
    }



    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Email and Password cannot be empty.']")
    private WebElement errTxt;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Point Of Purchase']")
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
    public WebElement Pin0;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc='ENTER']")
    private WebElement enter;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.eatos.pos:id/ib_core_tv_title']")
    private WebElement instaBug;
    @AndroidFindBy(accessibility = "Custom Item Tab 2 of 2")
    private WebElement customItem;


    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Login Failed, Please Check your Email and Password']")
    private WebElement invalidUsername;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Login Failed, Please Check your Email and Password']")
    private WebElement invalidPassword;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Email Or Password can not be empty']")
    private WebElement emptyUsername;
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Email Or Password can not be empty']")
    private WebElement emptyPassword;
    @AndroidFindBy (xpath = "//android.widget.Toast[@text='Email Or Password can not be empty']")
    private WebElement emptyFields;
    @AndroidFindBy (xpath = "//android.widget.Toast[@text='Email Or Password can not be empty']")
    private WebElement validCredentials;

    public void createAnAccount(){
        clickOnElement(creatAnAccountButton);
    }


    @AndroidFindBy(xpath = "//android.widget.Toast[@text=\"Email and Password cannot be empty.\"]")
    private WebElement erroMsg;
    public WebElement instaBug(){
        return instaBug;
    }

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

        if (username.equals("np3@eigital.com")){
            clickOnElement(usernameTxtFld);
            //waitForVisibilityOfElement(instaBug);
            waitForVisibility(instaBug);
            clearText(usernameTxtFld);
            typeTextIntoElement(usernameTxtFld, username, "login with " + username);
        } else if (username.equals("Invalid@gmail.com")) {
            clickOnElement(usernameTxtFld);
            clearText(usernameTxtFld);
            typeTextIntoElement(usernameTxtFld, username, "login with " + username);
        }
    }
    public void enterPassword(String password) {
        if (password.equalsIgnoreCase("@Password123")){
            clickOnElement(passwordTxtFld);
            clearText(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld, password, "password is " + password);
        } else if (password.equalsIgnoreCase("InvalidPawd")) {
            clickOnElement(passwordTxtFld);
            clearText(passwordTxtFld);
            typeTextIntoElement(passwordTxtFld, password, "password is " + password);

        }

    }
    public void pressLoginBtn() {
        clickOnElement(loginBtn, "press login button");
    }
    public void login(String username, String password) {

        clickOnElement(usernameTxtFld);
       // waitForVisibility(instaBug);
        clearText(usernameTxtFld);
        typeTextIntoElement(usernameTxtFld, username, "login with " + username);
        clickOnElement(passwordTxtFld);
        clearText(passwordTxtFld);
        typeTextIntoElement(passwordTxtFld, password, "password is " + password);
    }
    public void enterCred(@NotNull String val) {

        switch (val) {
            case "InvalidUsername" -> {
                clickOnElement(usernameTxtFld);
                waitForVisibility(instaBug);
                clearText(usernameTxtFld);
                typeTextIntoElement(usernameTxtFld, "np33@eigital.com");
                clickOnElement(passwordTxtFld);
                clearText(passwordTxtFld);
                typeTextIntoElement(passwordTxtFld, "@Password123");
            }
            case "InvalidPassword" -> {
                waitForVisibility(usernameTxtFld);
                clickOnElement(usernameTxtFld);
                clearText(usernameTxtFld);
                typeTextIntoElement(usernameTxtFld, "np3@eigital.com");
                clickOnElement(passwordTxtFld);
                clearText(passwordTxtFld);
                typeTextIntoElement(passwordTxtFld, "@Password1234");
            }
            case "EmptyUsername" -> {
                clickOnElement(usernameTxtFld);
                clearText(usernameTxtFld);
                clickOnElement(passwordTxtFld);
                clearText(passwordTxtFld);
                typeTextIntoElement(passwordTxtFld, "@Password123");
            }
            case "EmptyPassword" -> {
                clickOnElement(usernameTxtFld);
                clearText(usernameTxtFld);
                typeTextIntoElement(usernameTxtFld, "np33@eigital.com");
                clickOnElement(passwordTxtFld);
                clearText(passwordTxtFld);
            }
            case "EmptyFields" -> {
                clickOnElement(usernameTxtFld);
                clearText(usernameTxtFld);
                clickOnElement(passwordTxtFld);
                clearText(passwordTxtFld);
            }
            case "ValidCredentials" -> {
                clickOnElement(usernameTxtFld);
                clearText(usernameTxtFld);
                typeTextIntoElement(usernameTxtFld, "np3@eigital.com");
                clickOnElement(passwordTxtFld);
                clearText(passwordTxtFld);
                typeTextIntoElement(passwordTxtFld, "@Password123");
                clickOnElement(loginBtn);
                longwaitForVisibility(Pin1);
                clickOnElement(Pin1);
                clickOnElement(Pin1);
                clickOnElement(Pin1);
                clickOnElement(Pin1);
                clickOnElement(enter);
            }
        }if(!val.equalsIgnoreCase("ValidCredentials")){
            clickOnElement(loginBtn);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void loginErrorMsg(String val){

        if(val.equalsIgnoreCase("InvalidUsername")){
            String Expected = "Login Failed, Please Check your Email and Password";
            Assert.assertEquals(Expected,invalidUsername.getText());
        }
        else if (val.equalsIgnoreCase("InvalidPassword")) {
            String Expected = "Login Failed, Please Check your Email and Password";
            Assert.assertEquals(Expected,invalidPassword.getText());
        }
        else if (val.equalsIgnoreCase("EmptyUsername")) {
            String Expected = "Email Or Password can not be empty";
            Assert.assertEquals(Expected,emptyUsername.getText());
        }
        else if (val.equalsIgnoreCase("EmptyPassword")) {
            String Expected = "Email Or Password can not be empty";
            Assert.assertEquals(Expected,emptyPassword.getText());
        }
        else if (val.equalsIgnoreCase("EmptyFields")) {
            String errTest = emptyFields.getText();
            String Expected = "Email Or Password can not be empty";
            Assert.assertEquals(Expected,errTest);
        }
        else if (val.equalsIgnoreCase("ValidCredentials")) {
//            String Expected = "PRODUCTS";
//            Assert.assertEquals(Expected,new ProductsScreen().getTitle());
            Assert.assertTrue(new NewOrderScreen().newOrderModule.isDisplayed());
        }
    }
}
