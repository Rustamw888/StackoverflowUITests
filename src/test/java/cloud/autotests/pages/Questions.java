package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class Questions {

    public SelenideElement newestBtn = $("[data-nav-value='Newest']");
    public SelenideElement activeBtn = $("[data-nav-value='Active']");
    public SelenideElement unansweredBtn = $("[data-nav-value='Unanswered']");
    public SelenideElement moreBtn = $("button[data-controller='s-popover']");
    public SelenideElement filterBtn = $("[data-controller='s-expandable-control']");
}
