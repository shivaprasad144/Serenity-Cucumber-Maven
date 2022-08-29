package com.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class StepForgetPasswordPage extends PageObject {
	
	@FindBy(id = "forgotPasswordLink")
    WebElementFacade forgetLink;
 
    @Step("Verify Forget Password Page ")
    public boolean ForgetPasswordPage() {
        Boolean resetPasswordButton = forgetLink.isDisplayed();
 
        return resetPasswordButton;
    }

}
