package cloud.autotests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Main {

    public SelenideElement mainTab = $(".ps-relative.youarehere");
    public SelenideElement questionsTab = $("[href='/'] .flex--item");
    public SelenideElement marksTab = $("#nav-tags .flex--item");
    public SelenideElement usersTab = $("#nav-users .flex--item");
    public SelenideElement unansweredTab = $("#nav-unanswered .flex--item");
    public SelenideElement search = $("[name='q']");
    public SelenideElement logo = $(".-img._glyph");
    public SelenideElement loginBtn = $("[data-gps-track='login.click']");
    public SelenideElement registrationBtn = $(".s-topbar--item__unset:not([data-gps-track='login.click'])");
    public SelenideElement pageDescription = $("h1.fs-headline1");
    public SelenideElement askBtn = $("[href='/questions/ask']");
    public SelenideElement interestingBtn = $("[data-value='interesting']");
    public SelenideElement bountiesBtn = $("[data-value='bounties']");
    public SelenideElement hotBtn = $("[data-value='hot']");
    public SelenideElement weekBtn = $("[data-value='week']");
    public SelenideElement monthBtn = $("[data-value='month']");
    public ElementsCollection tiles = $$("#question-mini-list .s-post-summary");
}
