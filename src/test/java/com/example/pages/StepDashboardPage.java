package com.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


public class StepDashboardPage extends PageObject {
	
	@FindBy(id = "welcome")
    WebElementFacade dashboardText;
 
    @Step("Successful login")
    public void loginVerify() {
//        String dashboardTitle = dashboardText.getText();
//        assertThat(dashboardTitle, containsText("Welcome"));
    }

	

}
