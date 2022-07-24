package cloud.autotests.tests;

import cloud.autotests.pages.Main;
import cloud.autotests.pages.Search;
import com.github.javafaker.Faker;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    Main mainPageElements = new Main();
    Search searchPage = new Search();

    @ValueSource(strings = {
            "Allure",
            "Java",
            "Junit5"
    })
    @DisplayName("Search with valid value")
    @ParameterizedTest(name = "find all elements containing the query phrase: {0}")
    @AllureId("11531")
    void positiveTest1(String valueName) {
        step("Search request sending", () -> {
            open("");
            mainPageElements.search.setValue(valueName).pressEnter();
        });

        step("Tile should have text '{0}'", () -> {
            searchPage.content.filterBy(text(valueName)).shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @AllureId("11535")
    @DisplayName("Search with invalid value")
    void noResultsTest() {
        Faker faker = new Faker();
        String value = faker.chuckNorris().fact();
        step("Main page open", () -> {
            open("/");
            mainPageElements.search.setValue(value).pressEnter();
        });

        step("Search result equal 0", () -> {
            searchPage.searchResult.parent().shouldHave(text("Нам не удалось ничего найти по фразе"));
            searchPage.searchResult.shouldHave(text(value));
        });
    }
}
