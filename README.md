# Проект по автоматизации тестирования для Stackoverflow
## <a target="_blank" href="https://ru.stackoverflow.com/">Веб сайт Stackoverflow</a>

![This is an image](https://i.imgur.com/8gS1I5L.png)

## :rocket: Содержание:

- [x] <a href="#rocket-технологии-и-инструменты">Технологии и инструменты</a>
- [x] <a href="#rocket-реализованные-проверки">Реализованные проверки</a>
- [x] <a href="#rocket-сборка-в-Jenkins">Сборка в Jenkins</a>
- [x] <a href="#rocket-запуск-из-терминала">Запуск из терминала</a>
- [x] <a href="#rocket-allure-отчет">Allure отчет</a>
- [x] <a href="#rocket-интеграция-с-allure-testops">Интеграция с Allure TestOps</a>
- [x] <a href="#rocket-интеграция-с-jira">Интеграция с Jira</a>
- [x] <a href="#rocket-отчет-в-telegram">Отчет в Telegram</a>
- [x] <a href="#rocket-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :rocket: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="AllureTestOps" src="images/logo/AllureTestOps.svg">
<img width="6%" title="Git" src="images/logo/Git.svg">
<img width="6%" title="RestAssured" src="images/logo/RestAssured.svg">
<img width="6%" title="Jira" src="images/logo/Jira.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :rocket: Реализованные проверки это UI тесты
![This is an image](https://i.imgur.com/Dd62Cq5.png)
- Наличие основных элементов главной страницы
- Наличие основных элементов страницы вопросов
- Наличие основных элементов страницы меток
- Наличие основных элементов страницы участников
- Наличие основных элементов страницы неотвеченные
- Результаты работы поиска с валидными данными
- Результаты работы поиска с невалидными данными

## :rocket: Сборка в Jenkins
### <a target="_blank" href="https://jenkins.autotests.cloud/job/StackoverflowUITests/">Сборка в Jenkins</a>
<p align="center">
<img title="Jenkins Dashboard" src="images/screenshots/jenkins_dashboard.png">
</p>

### Параметры сборки в Jenkins:
Сборка в Jenkins

- browser (браузер, по умолчанию chrome)
- version (версия браузера, по умолчанию 100.0)
- size (размер окна браузера, по умолчанию 1920x1080)
- threads (количество потоков)

## :rocket: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${REMOTE_LOGIN}:${REMOTE_PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

## :rocket: Allure отчет
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/report_main_page.png">
</p>

- ### Проведенные тесты (suites)
<p align="center">
<img title="Allure Test Page" src="images/screenshots/allure_suites_1.png">
<img title="Allure Test Page" src="images/screenshots/allure_suites_2.png">
</p>

- ### Пакетами тестов
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_packages.png">
</p>

- ### График прохождения тестов
<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_schedule.png">
</p>

## :rocket: Интеграция с Allure TestOps
- ### Результаты запуска тестов
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/test_results_ATO.png">
</p>

- ### Launches после интеграции с IDE + график
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/launches_ATO.png">
</p>

- ### Дашборды с ручными и авто тестами
<p align="center">
<img title="TestOps Launch Page" src="images/screenshots/dashboards_ATO.png">
</p>

- ### Тест кейсы
<p align="center">
<img title="TestOps tests page" src="images/screenshots/test_cases_ATO.png">
</p>

- ### Запуски с ручными и авто тестами
<p align="center">
<img title="TestOps tests page" src="images/screenshots/test_runs_ATO.png">
</p>

## :rocket: Интеграция с Jira
- ### Задачей в Jira
<p align="center">
<img title="Jira issue" src="images/screenshots/jira_issue.png">
</p>

## :rocket: Отчет в Telegram
<p align="center">
<img title="Telegram notification message" src="images/screenshots/telegram_report.png">
</p>

## :rocket: Видео примеры прохождения тестов
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
> На данный момент школьный ресурс оптимизируется, я предоставил результаты своей работы невзирая на преграды.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test_result.gif">
</p>



