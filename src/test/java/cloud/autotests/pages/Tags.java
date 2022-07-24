package cloud.autotests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Tags {

    public SelenideElement popularBtn = $("[data-value='popular']");
    public SelenideElement nameBtn = $("[data-value='name']");
    public SelenideElement newBtn = $("[data-value='new']");
    public SelenideElement otherTagsLink = $("[href='/tags/synonyms']");
    public ElementsCollection cards = $$("#tags-browser .s-card");
}
