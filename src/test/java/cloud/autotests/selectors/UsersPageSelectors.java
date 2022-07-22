package cloud.autotests.selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public interface UsersPageSelectors {

    // mainbar
    SelenideElement reputationBtn = $("[data-value='reputation']");
    SelenideElement newusersBtn = $("[data-value='newusers']");
    SelenideElement votersBtn = $("[data-value='voters']");
    SelenideElement editorsBtn = $("[data-value='editors']");
    SelenideElement moderatorsBtn = $("[data-value='moderators']");
    SelenideElement searchUsers = $("input#userfilter");
}
