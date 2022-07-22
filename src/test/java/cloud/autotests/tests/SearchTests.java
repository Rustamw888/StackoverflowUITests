package cloud.autotests.tests;

import cloud.autotests.selectors.MainPageSelectors;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("sof")
public class SearchTests extends TestBase implements
        MainPageSelectors {

    ElementsCollection content = $$(".s-post-summary--content h3");
    SelenideElement searchResult = $(".js-search-results .ta-center b");

    @ValueSource(strings = {
            "Allure",
            "Java",
            "Junit5"
    })
    @DisplayName("Search with valid value")
    @ParameterizedTest(name = "find all elements containing the query phrase: {0}")
    void positiveTest1(String valueName) {
        step("Search request sending", () -> {
            open("");
            search.setValue(valueName).pressEnter();
        });

        step("Tile should have text '{0}'", () -> {
            content.filterBy(text(valueName)).shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @DisplayName("Search with invalid value")
    void noResultsTest() {
        Faker faker = new Faker();
        String value = faker.chuckNorris().fact();
        step("main page open", () -> {
            open("/");
            search.setValue(value).pressEnter();
        });

        step("Search result equal 0", () -> {
            searchResult.parent().shouldHave(text("Нам не удалось ничего найти по фразе"));
            searchResult.shouldHave(text(value));
        });
    }
}
