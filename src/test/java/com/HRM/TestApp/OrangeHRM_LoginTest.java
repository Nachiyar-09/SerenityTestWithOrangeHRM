package com.HRM.TestApp;

import com.HRM.Pages.AddEmployeePage;
import com.HRM.Steps.AddEmployeeSteps;
import com.HRM.Steps.HRMLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class OrangeHRM_LoginTest extends BaseClass{

    @Steps
    HRMLoginSteps hrmloginsteps;


    @Test
    public void LoginPage_underTest(){
        hrmloginsteps.LaunchURL();
        hrmloginsteps.VerifyWithValidCredentials("Admin","admin123");
        hrmloginsteps.CheckForProperLogin();
    }
}
