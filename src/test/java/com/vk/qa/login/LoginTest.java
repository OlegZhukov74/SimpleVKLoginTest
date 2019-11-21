package com.vk.qa.login;

import com.vk.qa.BaseTest;
import com.vk.qa.pages.authorized.FeedPage;
import com.vk.qa.pages.unauthorized.MainPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginCredentialsEmail", parallel = true)
    public Object[][] loginCredentialsEmail() {
        return new Object[][]{
                {"umacte@gmail.com", "xxxxxxxxxxx"},
                {"asd@asd.zxc", "654321"}
        };
    }

    @DataProvider(name = "loginCredentialsPhone", parallel = true)
    public Object[][] loginCredentialsPhone() {
        return new Object[][]{
                {"89995847975", "xxxxxxxxxx"},
                {"89995847971", "654321"}
        };
    }

    @Test(dataProvider = "loginCredentialsEmail")
    public void checkWeCanLoginViaEmail(String email, String password) {
        MainPage mainPage = open( System.getProperty("baseUrl"), MainPage.class);
        FeedPage feedPage = mainPage.login(email, password);
        feedPage.checkFeedPage();
    }

    @Test(dataProvider = "loginCredentialsPhone")
    public void checkWeCanLoginViaPhone(String email, String password) {
        MainPage mainPage = open( System.getProperty("baseUrl"), MainPage.class);
        FeedPage feedPage = mainPage.login(email, password);
        feedPage.checkFeedPage();
    }

}
