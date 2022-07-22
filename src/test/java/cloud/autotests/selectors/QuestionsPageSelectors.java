package cloud.autotests.selectors;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public interface QuestionsPageSelectors {

    // mainbar
    SelenideElement newestBtn = $("[data-nav-value='Newest']");
    SelenideElement activeBtn = $("[data-nav-value='Active']");
    SelenideElement unansweredBtn = $("[data-nav-value='Unanswered']");
    SelenideElement moreBtn = $("button[data-controller='s-popover']");
    SelenideElement filterBtn = $("[data-controller='s-expandable-control']");
}
