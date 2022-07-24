package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Users {

    public SelenideElement reputationBtn = $("[data-value='reputation']");
    public SelenideElement newusersBtn = $("[data-value='newusers']");
    public SelenideElement votersBtn = $("[data-value='voters']");
    public SelenideElement editorsBtn = $("[data-value='editors']");
    public SelenideElement moderatorsBtn = $("[data-value='moderators']");
    public SelenideElement searchUsers = $("input#userfilter");
}
