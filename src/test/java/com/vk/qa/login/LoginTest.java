package com.vk.qa.login;

import com.vk.qa.BaseTest;
import com.vk.qa.pages.authorized.FeedPage;
import com.vk.qa.pages.unauthorized.MainPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginCredentials", parallel = true)
    public Object[][] loginCredentials() {
        return new Object[][]{
                {"qwe@qwe.com", "123456"},
                {"asd@asd.zxc", "654321"}
        };
    }

    @Test(dataProvider = "loginCredentials")
    public void checkWeCanLoginViaEmail(String email, String password) {
        MainPage mainPage = open("https://vk.com", MainPage.class);
        FeedPage feedPage = mainPage.login(email, password);
        feedPage.checkFeedPage();
    }

}
