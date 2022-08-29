package com.example.stepDefinitions;

import com.example.pages.StepDashboardPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class DashboardPageDefinitions {
	
	@Steps
    StepDashboardPage dashPage;
 
    @Step
    public void verifyAdminLogin() {
        dashPage.loginVerify();
    }

}
