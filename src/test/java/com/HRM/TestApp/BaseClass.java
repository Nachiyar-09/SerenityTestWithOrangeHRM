package com.HRM.TestApp;

import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseClass {

        @Managed(uniqueSession = true)
                WebDriver browser;
}
