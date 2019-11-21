package com.vk.qa.pages.authorized;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.vk.qa.pages.BasePage;
import org.openqa.selenium.support.FindBy;

public class FeedPage extends BasePage {
    public static final String URL = "/feed";

    @FindBy(xpath = "//*[@id=\"feed_wall\"]")
    private SelenideElement feedWall;

    public void checkFeedPage() {
        feedWall.should(Condition.exist);
    }
}
