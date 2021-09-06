package com.HRM.TestApp;

import com.HRM.Pages.LoginHRMPage;
import com.HRM.Steps.AddEmployeeSteps;
import com.HRM.Steps.HRMLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class OrangeHRM_AddEmployeeTest extends BaseClass{

    @Steps
    HRMLoginSteps hrmloginsteps;

    @Steps
    AddEmployeeSteps addEmployeeSteps;

    @Before
    public void setup(){
        hrmloginsteps.LaunchURL();
        hrmloginsteps.VerifyWithValidCredentials("Admin","admin123");
    }

    @Test
    public void AddEmployeePage_UnderTest(){
        addEmployeeSteps.AddEmployeeActions("Preeti","Kumar","TestLogin","Welcome123","Welcome123");
    }
}
