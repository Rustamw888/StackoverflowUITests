package cloud.autotests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Search {

    public ElementsCollection content = $$(".s-post-summary--content h3");
    public SelenideElement searchResult = $(".js-search-results .ta-center b");
}
