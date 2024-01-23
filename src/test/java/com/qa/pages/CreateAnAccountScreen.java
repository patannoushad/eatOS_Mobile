package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CreateAnAccountScreen extends BasePage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Create An Account\"]")
    private WebElement createAnActTitle;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter First Name']")
    private WebElement firstNameField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Last Name']")
    private WebElement lastNameField;
    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Email Address']")
    private WebElement emailAddressField;


    @AndroidFindBy(xpath = "//android.widget.EditText[@hint='Enter Restaurant Name']")
    private WebElement restaurantNameField;

    public void enterCreatAnAccountDetails(String val){
        if(val.equals("emptyFirstName")){
            clickOnElement(lastNameField);
            typeTextIntoElement(lastNameField,"Manager");
            clickOnElement(emailAddressField);
            typeTextIntoElement(emailAddressField,"abc@gmail.com");
            clickOnElement(restaurantNameField);
            typeTextIntoElement(restaurantNameField,"Yonox");
        }else if (val.equals("emptyLastName")){
            if(val.equals("emptyFirstName")){
                clickOnElement(firstNameField);
                typeTextIntoElement(firstNameField,"Login");
                clickOnElement(emailAddressField);
                typeTextIntoElement(emailAddressField,"abc@gmail.com");
                clickOnElement(restaurantNameField);
                typeTextIntoElement(restaurantNameField,"Yonox");
            }
        }
    }


}
