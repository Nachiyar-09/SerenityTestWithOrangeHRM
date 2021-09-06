package com.HRM.Steps;

import com.HRM.Pages.AddEmployeePage;
import net.thucydides.core.annotations.Step;

public class AddEmployeeSteps
{
    private AddEmployeePage addEmployeePage;

    @Step
    public void AddEmployeeActions(String Fname,String Lname,String UName,String Pass,String RePass){
        addEmployeePage.ClickPIMHeaderOption();
        addEmployeePage.clickAddEmployee();
        addEmployeePage.EnterEmployeeDetails(Fname, Lname);
        addEmployeePage.VerifyUserCredentialsAppears(UName,Pass,RePass);
    }
}
