package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import cloud.autotests.selectors.MainPageSelectors;
import cloud.autotests.selectors.TagsPageSelectors;
import cloud.autotests.selectors.QuestionsPageSelectors;
import cloud.autotests.selectors.UnansweredPageSelectors;
import cloud.autotests.selectors.UsersPageSelectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElementsVisibleTests extends TestBase implements
        MainPageSelectors, QuestionsPageSelectors, TagsPageSelectors, UsersPageSelectors, UnansweredPageSelectors {

    @Test
    @DisplayName("Check the presence of the main elements on the home page")
    void mainPageTest() {
        step("main page open", () -> {
            open("/");
        });

        step("pages head", () -> {
            search.shouldBe(visible);
            logo.shouldHave(text("Stack Overflow на русском"));
            loginBtn.shouldBe(visible);
            registrationBtn.shouldBe(visible);
        });

        step("left menu", () -> {
            mainTab.shouldBe(visible);
            questionsTab.shouldBe(visible);
            marksTab.shouldBe(visible);
            usersTab.shouldBe(visible);
            unansweredTab.shouldBe(visible);
        });

        step("mainbar", () -> {
            pageDescription.shouldHave(text("Исследуйте вопросы сообщества"));
            askBtn.shouldBe(visible);
            interestingBtn.shouldBe(visible);
            bountiesBtn.shouldBe(visible);
            hotBtn.shouldBe(visible);
            weekBtn.shouldBe(visible);
            monthBtn.shouldBe(visible);
            assertTrue(tiles.size() > 0);
        });
    }

    @Test
    @DisplayName("Check the presence of the main elements on the questions page")
    void questionsPageTest() {
        step("questions page open", () -> {
            open("/questions");
        });

        step("mainbar", () -> {
            pageDescription.shouldHave(text("Все вопросы"));
            newestBtn.shouldBe(visible);
            activeBtn.shouldBe(visible);
            unansweredBtn.shouldBe(visible);
            moreBtn.shouldBe(visible);
            filterBtn.shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Check the presence of the main elements on the tags page")
    void tagsPageTest() {
        step("tags page open", () -> {
            open("/tags");
        });

        step("mainbar", () -> {
            pageDescription.shouldHave(text("Метки"));
            popularBtn.shouldBe(visible);
            nameBtn.shouldBe(visible);
            newBtn.shouldBe(visible);
            assertTrue(cards.size() > 0);
            otherTagsLink.shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Check the presence of the main elements on the users page")
    void usersPageTest() {
        step("users page open", () -> {
            open("/users");
        });

        step("mainbar", () -> {
            pageDescription.shouldHave(text("Участники"));
            reputationBtn.shouldBe(visible);
            newusersBtn.shouldBe(visible);
            votersBtn.shouldBe(visible);
            editorsBtn.shouldBe(visible);
            moderatorsBtn.shouldBe(visible);
            searchUsers.shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Check the presence of the main elements on the unanswered page")
    void unansweredPageTest() {
        step("users page open", () -> {
            open("/unanswered");
        });

        step("mainbar", () -> {
            pageDescription.shouldHave(text("Неотвеченные вопросы"));
            mytagsBtn.shouldBe(visible);
            newestUnansweredBtn.shouldBe(visible);
            votesBtn.shouldBe(visible);
            noanswersBtn.shouldBe(visible);
            assertTrue(questionBlock.size() > 0);
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("main page open", () -> {
            open("/");
        });

        step("Page title should have text 'Stack Overflow на русском'", () -> {
            String expectedTitle = "Stack Overflow на русском";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("main page open", () -> {
            open("/");
        });

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
