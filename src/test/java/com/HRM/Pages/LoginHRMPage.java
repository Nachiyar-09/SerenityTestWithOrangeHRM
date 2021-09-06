package com.HRM.Pages;

import net.serenitybdd.core.pages.PageObject;

//@DefaultUrl("https://opensource-demo.orangehrmlive.com")
public class LoginHRMPage extends PageObject {

    public void LoginWithCredentials(String Username , String Password){
        $("#txtUsername").sendKeys(Username);
        $("#txtPassword").sendKeys(Password);
        $("#btnLogin").click();
    }
    public boolean CheckForProperLogin() {
       boolean Title = $("//*[@id=\"branding\"]/a[1]/img").equals("OrangeHRM");
        return Title;
    }

}
