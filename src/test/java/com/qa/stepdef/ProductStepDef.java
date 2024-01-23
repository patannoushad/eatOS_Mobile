package com.qa.stepdef;

import com.qa.pages.LoginScreen;
import com.qa.pages.NewOrderScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef {

    @Given("User logged in with Valid Credential")
    public void userLoggedInWithValidCredential(){
        new LoginScreen().login("np3@eigital.com", "@Password123");
    }

    @And("User add menu on Menu Management")
    public void userAddMenuonMenuManagement(){
    }
    @And("User Enter Valid PIN")
    public void userEnterValidPIN(){
        new LoginScreen().enterLoginPin();
    }
    @Then("the product is listed with title {string} and price {string}")
    public void theProductIsListedWithTitleAndPrice(String title, String price) throws Exception {
    }

    @When("I click product title {string}")
    public void iClickProductTitle(String title) throws Exception {
 //       new ProductsPage().pressProductTitle(title);
    }
    @When("User Added GuestDetails")
    public void userAddedGuestDetails(){
        new NewOrderScreen().enterGuestDetails();
    }

    @Then("Validate GuestDetails in Tickets Module")
    public void validateGuestDetailsTicketsModule(){
    }

}
