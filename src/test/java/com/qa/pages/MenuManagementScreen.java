package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class MenuManagementScreen extends BasePage{

    LoginScreen loginScreen = new LoginScreen();

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    private WebElement topDropDown;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Menu Management')]")
    private WebElement menuManagement;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc='Categories'])[1]")
    private WebElement categories;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='+ ADD']")
    private WebElement ADD;

    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Category Name']")
    private WebElement categoryName;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    private WebElement closeDialog;

    @AndroidFindBy(accessibility = "1.  Category Name cannot be empty")
    public WebElement categoryErrMsg;

    public void emptyCategoryDetails(){
        clickOnElement(topDropDown);
        clickOnElement(menuManagement);
        clickOnElement(categories);
        clickOnElement(ADD);
        clickOnElement(categoryName);
        clickOnElement(closeDialog);
    }
    public void onMenuManagement(){
        loginScreen.enterLoginPin();
        clickOnElement(topDropDown);
        clickOnElement(menuManagement);
    }
    public void addCategoryDetails(String val){
        clickOnElement(categories);
        clickOnElement(ADD);

        if(val.equals("ValidDetails")){
            clickOnElement(categoryName);
            typeTextIntoElement(categoryName,"AbcdCat","CategoryName");
        }
        else if (val.equals("EmptyCategoryName")) {
            clickOnElement(categoryName);
        }
        else if (val.equals("InvalidCategoryName")) {
            clickOnElement(categoryName);
            typeTextIntoElement(categoryName,"1234","CategoryName");
        }
        clickOnElement(closeDialog);
    }
    public void getCategoryErrorMsg(String val){
        if(val.equals("ValidDetails")){
            Assert.assertTrue(categories.isDisplayed());
        }
        else if (val.equals("EmptyCategoryName")) {
            clickOnElement(categoryName);
        }
        else if (val.equals("InvalidCategoryName")) {
            clickOnElement(categoryName);
        }
    }

}
