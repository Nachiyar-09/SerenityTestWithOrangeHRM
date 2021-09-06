package com.HRM.Pages;

import net.serenitybdd.core.pages.PageObject;

public class AddEmployeePage extends PageObject {

    public void ClickPIMHeaderOption(){
        $("#menu_pim_viewPimModule").click();
    }
    public void clickAddEmployee(){
        $("#menu_pim_addEmployee").click();
    }
    public void EnterEmployeeDetails(String Fname, String Lname){
        $("#firstName").sendKeys(Fname);
        $("#lastName").sendKeys(Lname);
        $("#chkLogin").click();}
        
    public void VerifyUserCredentialsAppears(String UName,String Pass, String RePass) {

        $("#user_name").sendKeys(UName);
        $("#user_password").sendKeys(Pass);
        $("#re_password").sendKeys(RePass);
        $("#btnSave").click();
        }

    }

