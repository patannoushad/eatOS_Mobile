package com.qa.stepdef;

import com.qa.pages.LoginScreen;
import com.qa.pages.ProductsScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDef {

    LoginScreen loginScreen =new LoginScreen();
    @When("User enter username as {string}")
    public void userEnterUsernameAs(String username){
        new LoginScreen().enterUserName(username);
    }
    @When("User enter password as {string}")
    public void userEnterPasswordAs(String password) {
        new LoginScreen().enterPassword(password);
    }
    @When("User Tap on Login Button")
    public void userTapOnLoginButton() {
        new LoginScreen().pressLoginBtn();
    }
    @When("User enter valid Pin")
    public void userEnterValidPin(){
        new LoginScreen().enterLoginPin();
    }
    @Then("User should get successfully loggedin")
    public void userShouldGetSuccessfullyLoggedin(){
        String Expect = "Settings Tab 4 of 4";
        //      Assert.assertEquals(Expect, new ProductsPage().getIdText());
//        Assert.assertTrue(new NewOrderPage().empName.isDisplayed());

    }
    @Then("login should fail with an error {string}")
    public void loginShouldFailWithAnError(String errMsg) {
        //      Assert.assertEquals(errMsg,new LoginPage().getErrTxt());
    }
    @Then("User enter Pin Invalid PIN {string}{string}{string}{string}")
    public void userEnterPinInvalidPIN(String P1,String P2,String P3) {
    }
    @Then("I should see Products page with title {string}")
    public void iShouldSeeProductsPageWithTitle(String title) {
        Assert.assertEquals(new ProductsScreen().getTitle(), title);
    }



    @When("User enter {string} Credentials")
    public void userEnter_Condition_Credentials(String val) {
        new LoginScreen().enterCred(val);
    }

    @Then("User gets {string} errorMsg")
    public void userGets_Condition_ErrMsg(String val) {
        new LoginScreen().loginErrorMsg(val);
    }
}
