package com.vk.qa;

import com.codeborne.selenide.WebDriverRunner;
import com.vk.qa.system.DriverUtils;
import org.testng.annotations.*;

import static com.vk.qa.system.DriverUtils.closeDriver;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        closeDriver();
    }

    @BeforeMethod
    public void beforeMethod() {
        if (WebDriverRunner.hasWebDriverStarted()) closeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        closeDriver();
    }

    @AfterSuite
    public void afterSuite() {}
}
