package cloud.autotests.selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public interface MainPageSelectors {

    // main page
    SelenideElement mainTab = $(".ps-relative.youarehere");
    SelenideElement questionsTab = $("[href='/'] .flex--item");
    SelenideElement marksTab = $("#nav-tags .flex--item");
    SelenideElement usersTab = $("#nav-users .flex--item");
    SelenideElement unansweredTab = $("#nav-unanswered .flex--item");
    // left menu
    SelenideElement search = $("[name='q']");
    SelenideElement logo = $(".-img._glyph");
    SelenideElement loginBtn = $("[data-gps-track='login.click']");
    SelenideElement registrationBtn = $(".s-topbar--item__unset:not([data-gps-track='login.click'])");
    // mainbar
    SelenideElement pageDescription = $("h1.fs-headline1");
    SelenideElement askBtn = $("[href='/questions/ask']");
    SelenideElement interestingBtn = $("[data-value='interesting']");
    SelenideElement bountiesBtn = $("[data-value='bounties']");
    SelenideElement hotBtn = $("[data-value='hot']");
    SelenideElement weekBtn = $("[data-value='week']");
    SelenideElement monthBtn = $("[data-value='month']");
    ElementsCollection tiles = $$("#question-mini-list .s-post-summary");
}
