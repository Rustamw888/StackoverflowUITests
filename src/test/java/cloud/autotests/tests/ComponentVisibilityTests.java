package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import cloud.autotests.pages.Main;
import cloud.autotests.pages.Tags;
import cloud.autotests.pages.Questions;
import cloud.autotests.pages.Unanswered;
import cloud.autotests.pages.Users;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentVisibilityTests extends TestBase {

    Main mainPageElements = new Main();
    Questions questionsPageSelectors = new Questions();
    Tags tagsPageSelectors = new Tags();
    Users usersPageSelectors = new Users();
    Unanswered unansweredPageSelectors = new Unanswered();

    @Test
    @AllureId("11528")
    @DisplayName("Check the presence of the main elements on the home page")
    void mainPageTest() {
        step("main page open", () -> {
            open("/");
        });

        step("Checking for the display of pages head elements", () -> {
            mainPageElements.search.shouldBe(visible);
            mainPageElements.logo.shouldHave(text("Stack Overflow на русском"));
            mainPageElements.loginBtn.shouldBe(visible);
            mainPageElements.registrationBtn.shouldBe(visible);
        });

        step("Checking for the display of left menu elements", () -> {
            mainPageElements.mainTab.shouldBe(visible);
            mainPageElements.questionsTab.shouldBe(visible);
            mainPageElements.marksTab.shouldBe(visible);
            mainPageElements.usersTab.shouldBe(visible);
            mainPageElements.unansweredTab.shouldBe(visible);
        });

        step("Checking for the display of mainbar elements", () -> {
            mainPageElements.pageDescription.shouldHave(text("Исследуйте вопросы сообщества"));
            mainPageElements.askBtn.shouldBe(visible);
            mainPageElements.interestingBtn.shouldBe(visible);
            mainPageElements.bountiesBtn.shouldBe(visible);
            mainPageElements.hotBtn.shouldBe(visible);
            mainPageElements.weekBtn.shouldBe(visible);
            mainPageElements.monthBtn.shouldBe(visible);
            mainPageElements.tiles.shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @AllureId("11533")
    @DisplayName("Check the presence of the main elements on the questions page")
    void questionsPageTest() {
        step("Questions page open", () -> {
            open("/questions");
        });

        step("Checking for the display of mainbar elements", () -> {
            mainPageElements.pageDescription.shouldHave(text("Все вопросы"));
            questionsPageSelectors.newestBtn.shouldBe(visible);
            questionsPageSelectors.activeBtn.shouldBe(visible);
            questionsPageSelectors.unansweredBtn.shouldBe(visible);
            questionsPageSelectors.moreBtn.shouldBe(visible);
            questionsPageSelectors.filterBtn.shouldBe(visible);
        });
    }

    @Test
    @AllureId("11529")
    @DisplayName("Check the presence of the main elements on the tags page")
    void tagsPageTest() {
        step("Tags page open", () -> {
            open("/tags");
        });

        step("Checking for the display of mainbar elements", () -> {
            mainPageElements.pageDescription.shouldHave(text("Метки"));
            tagsPageSelectors.popularBtn.shouldBe(visible);
            tagsPageSelectors.nameBtn.shouldBe(visible);
            tagsPageSelectors.newBtn.shouldBe(visible);
            tagsPageSelectors.otherTagsLink.shouldBe(visible);
            tagsPageSelectors.cards.shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @AllureId("11534")
    @DisplayName("Check the presence of the main elements on the users page")
    void usersPageTest() {
        step("Users page open", () -> {
            open("/users");
        });

        step("Checking for the display of mainbar elements", () -> {
            mainPageElements.pageDescription.shouldHave(text("Участники"));
            usersPageSelectors.reputationBtn.shouldBe(visible);
            usersPageSelectors.newusersBtn.shouldBe(visible);
            usersPageSelectors.votersBtn.shouldBe(visible);
            usersPageSelectors.editorsBtn.shouldBe(visible);
            usersPageSelectors.moderatorsBtn.shouldBe(visible);
            usersPageSelectors.searchUsers.shouldBe(visible);
        });
    }

    @Test
    @AllureId("11532")
    @DisplayName("Check the presence of the main elements on the unanswered page")
    void unansweredPageTest() {
        step("Users page open", () -> {
            open("/unanswered");
        });

        step("Checking for the display of mainbar elements", () -> {
            mainPageElements.pageDescription.shouldHave(text("Неотвеченные вопросы"));
            unansweredPageSelectors.mytagsBtn.shouldBe(visible);
            unansweredPageSelectors.newestUnansweredBtn.shouldBe(visible);
            unansweredPageSelectors.votesBtn.shouldBe(visible);
            unansweredPageSelectors.noanswersBtn.shouldBe(visible);
            unansweredPageSelectors.questionBlock.shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @AllureId("11530")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Main page open", () -> {
            open("/");
        });

        step("Page title should have text 'Stack Overflow на русском'", () -> {
            String expectedTitle = "Stack Overflow на русском";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @AllureId("11527")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Main page open", () -> {
            open("/");
        });

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";
            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
