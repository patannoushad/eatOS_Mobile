package com.qa.stepdef;


import com.qa.pages.MenuManagementScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class MenuManagementStepDef {

    @Given("User is on Menu management Screen")
    public void UserIsOnMenuManagementScreen(){
        new MenuManagementScreen().onMenuManagement();
    }

    @When("User adds new Category details")
    public void userAddsNewCategoryDetails(){

    }
    @When("User adds (.*) Category details")
    public void userAdds_condition_CategoryDetail(String val){
        new MenuManagementScreen().addCategoryDetails(val);
    }
    @When("User Enter (.*) in field")
    public void userEnterField(String val){
        new MenuManagementScreen().emptyCategoryDetails();
    }
    @Then("User get (.*) on Screen")
    public void userGetErrMsgonScreen(String val){
        Assert.assertTrue(new MenuManagementScreen().categoryErrMsg.isDisplayed());
    }
    @Then("User created Category successfully")
    public void userCreatedCategorySuccessfully(){

    }
    @Then("User gets errorMsg for (.*) Category")
    public void userGetsErrorMsgOnCategory(String val){
        new MenuManagementScreen().getCategoryErrorMsg(val);
    }
}
