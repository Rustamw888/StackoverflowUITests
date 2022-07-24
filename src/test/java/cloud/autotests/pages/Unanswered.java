package cloud.autotests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Unanswered {

    public SelenideElement mytagsBtn = $("[data-value='mytags']");
    public SelenideElement newestUnansweredBtn = $("[data-value='newest']");
    public SelenideElement votesBtn = $("[data-value='votes']");
    public SelenideElement noanswersBtn = $("[data-value='noanswers']");
    public ElementsCollection questionBlock = $$("#questions .s-post-summary");
}
