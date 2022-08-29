package com.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class StepLoginPage extends PageObject {

    @FindBy(name = "username")
    WebElementFacade username;

    @FindBy(name = "password")
    WebElementFacade password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElementFacade submitButton;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElementFacade errorMessage;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElementFacade forgotPasswordLink;

    @FindBy(xpath = "//button[normalize-space()='Reset Password']")
    WebElementFacade resetPasswordButton;

    @Step("Enter Username")
    public void inputUserName(String userName) {
        username.sendKeys((userName));
    }

    @Step("Enter Password")
    public void inputPassword(String passWord) {
        password.sendKeys((passWord));
    }

    @Step("Click Submit Button")
    public void clickLogin() {
        submitButton.click();
    }

    @Step("Error Message on unsuccessful login")
    public String errorMessage() {
        String actualErrorMessage = errorMessage.getText();
        return actualErrorMessage;
    }

    @Step("forgot password link")
    public void user_clicks_on_forgot_your_password_link() {
        forgotPasswordLink.click();
    }

    @Step("Reset Password Button")
    public void user_should_be_able_to_see_new_page_which_contains_reset_password_button() {
        resetPasswordButton.isDisabled();
    }

}
