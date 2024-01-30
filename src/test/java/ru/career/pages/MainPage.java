package ru.career.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public MainPage openPage(String url) {

        open();
        $(byText("Выбрать карьерную цель")).should(appear);
        return this;
    }

    public MainPage checkButtonGuideToProfessions() {
        $("a[href=\"/professions?hhtmFrom=Index\"]").shouldHave(text("Путеводитель по профессиям"));
        return this;
    }

    public MainPage checkButtonCoursesOnSkillsProfessions() {
        $("a[href=\"/courses?hhtmFrom=Index\"]").shouldHave(text("Курсы по навыкам и профессиям"));
        return this;
    }

    public MainPage checkButtonEnter() {
        $(byText("Войти")).shouldBe(visible);
        return this;
    }
}
