package com.HRM.Steps;

import com.HRM.Pages.LoginHRMPage;
import net.thucydides.core.annotations.Step;

public class HRMLoginSteps {
    private LoginHRMPage loginhrmpage;

    @Step
    public void LaunchURL(){
        loginhrmpage.open();
    }
    @Step
    public void VerifyWithValidCredentials(String Username, String Password){
        loginhrmpage.LoginWithCredentials(Username,Password);
        loginhrmpage.CheckForProperLogin();
    }

    public void CheckForProperLogin() {
        loginhrmpage.CheckForProperLogin();
    }
}
