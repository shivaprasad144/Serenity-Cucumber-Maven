package com.example.stepDefinitions;

import com.example.pages.StepDashboardPage;
import com.example.pages.StepForgetPasswordPage;
import com.example.pages.StepLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginPageDefinitions {
	
	@Steps
    StepLoginPage loginPage;
 
    @Steps
    StepDashboardPage dashPage;
 
    @Steps
    StepForgetPasswordPage forgetpasswordPage;
 
    @Given("User is on Home page")
    public void openApplication() {
        loginPage.open();
    }
 
    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        loginPage.inputUserName(userName);
    }
 
    @When("User enters password as {string}")
    public void enterPassword(String passWord) {
        loginPage.inputPassword(passWord);
 
        loginPage.clickLogin();
    }
 
    @Then("User should be able to login successfully")
    public void clickOnLoginButton() {
        dashPage.loginVerify();
    }
 
    @Then("User should be able to see error message {string}")
    public void unsucessfulLogin(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage();
//        assertEquals(expectedErrorMessage, actualErrorMessage);
        
    }

    @When("User clicks on Forgot your password link")
    public void user_clicks_on_forgot_your_password_link() {
        loginPage.user_clicks_on_forgot_your_password_link();
    }


    @Then("User should be able to see new page which contains Reset Password button")
    public void user_should_be_able_to_see_new_page_which_contains_reset_password_button() {
         loginPage.user_should_be_able_to_see_new_page_which_contains_reset_password_button();
    }

	
 
}
