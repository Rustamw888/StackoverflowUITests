package cloud.autotests.selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public interface TagsPageSelectors {

    // mainbar
    SelenideElement popularBtn = $("[data-value='popular']");
    SelenideElement nameBtn = $("[data-value='name']");
    SelenideElement newBtn = $("[data-value='new']");
    ElementsCollection cards = $$("#tags-browser .s-card");
    SelenideElement otherTagsLink = $("[href='/tags/synonyms']");
}
