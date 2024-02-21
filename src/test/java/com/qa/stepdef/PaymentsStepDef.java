package com.qa.stepdef;

import com.qa.pages.PaymentsScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentsStepDef {



    @When("User is on Payments Screen")
    public void userIsOnPaymentsScreen(){
        new PaymentsScreen().onPayments();

    }

    //---> Taxes

    @When("User adds {string} Tax details")
    public void userAddsMenuDetails(String val){
        new PaymentsScreen().addTaxDetails(val);
    }
    @Then("User gets errorMsg for {string} Tax Details" )
    public void userGetsErrorMsgOnMenuDetails(String val){
        new PaymentsScreen().taxesErrMsg(val);
    }

    //---> Discounts

    @When("User adds {string} Discount details")
    public void userAddsDiscountDetails(String val){
        new PaymentsScreen().addDiscountDetails(val);
    }
    @Then("User gets errorMsg for {string} Discount Details" )
    public void userGetsErrorMsgOnDiscountDetails(String val){
        new PaymentsScreen().discountsErrMsg(val);
    }


    //---> Service Charge

    @When("User adds {string} Service Charge details")
    public void userAddsServiceChargeDetails(String val){
        new PaymentsScreen().addServiceChargeDetails(val);
    }
    @Then("User gets errorMsg for {string} Service Charge Details" )
    public void userGetsErrorMsgOnServiceChargeDetails(String val){
        new PaymentsScreen().serviceChargeErrMsg(val);
    }

}
