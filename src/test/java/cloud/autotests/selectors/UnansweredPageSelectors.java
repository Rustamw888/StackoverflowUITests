package cloud.autotests.selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public interface UnansweredPageSelectors {

    // mainbar
    SelenideElement mytagsBtn = $("[data-value='mytags']");
    SelenideElement newestUnansweredBtn = $("[data-value='newest']");
    SelenideElement votesBtn = $("[data-value='votes']");
    SelenideElement noanswersBtn = $("[data-value='noanswers']");
    ElementsCollection questionBlock = $$("#questions .s-post-summary");
}
