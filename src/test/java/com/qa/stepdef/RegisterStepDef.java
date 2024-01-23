package com.qa.stepdef;

import com.qa.pages.LoginScreen;
import com.qa.utils.TestData;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileNotFoundException;

public class RegisterStepDef {


    @When("^User enter (.*) in field$")
    public void User_enter_Condition_in_field(String testcaseID) throws FileNotFoundException {
        new LoginScreen().enterLoginDetails(testcaseID);
    }
    @Then("^User should get a warning message about credential mismatch (.*)$")
    public void user_should_get_a_warning_message_about_credential_mismatch(String testcaseID) throws FileNotFoundException {
       TestData.readTestData(testcaseID);
    }
}
