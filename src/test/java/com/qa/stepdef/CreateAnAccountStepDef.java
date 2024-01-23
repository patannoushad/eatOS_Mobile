package com.qa.stepdef;

import com.qa.pages.CreateAnAccountScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAnAccountStepDef {

    @Given("User opens the Applications")
    public void   GivenUserOpensTheApplications(){
    }
    @And("Tap on Create an Account")
    public void tapOnCreateAnAccount(){
        //new CreateAnAccountStepDef().tapOnCreateAnAccount();
    }
    @When("User enter (.*) in Create An Account screen")
    public void userEnter_condition_CreateAnAccountScreen(String val){
        new CreateAnAccountScreen().enterCreatAnAccountDetails(val);
    }
    @Then("User should get a warning message (.*)")
    public void userShouldGetWarningMessage_condition(){
    }
}
