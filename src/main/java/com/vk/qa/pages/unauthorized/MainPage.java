package com.vk.qa.pages.unauthorized;

import com.codeborne.selenide.SelenideElement;
import com.vk.qa.pages.BasePage;
import com.vk.qa.pages.authorized.FeedPage;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static com.vk.qa.system.PageUtils.waitTillUrlContains;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@id='index_email']")
    private SelenideElement emailInput;
    @FindBy(xpath = "//*[@id='index_pass']")
    private SelenideElement passwordInput;
    @FindBy(xpath = "//*[@id='index_login_button']")
    private SelenideElement loginBtn;

    public FeedPage login(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginBtn.click();
        waitTillUrlContains(FeedPage.URL);
        return page(FeedPage.class);
    }
}
