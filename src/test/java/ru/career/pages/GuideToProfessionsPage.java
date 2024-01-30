package ru.career.pages;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GuideToProfessionsPage {

    public GuideToProfessionsPage openPage(String url) {
        open("https://career.ru/professions/");
        return this;
    }

    public GuideToProfessionsPage checkPageTitle() {
        $(".Y44XY9m___title-secondary_size-1").shouldHave(text("Путеводитель по профессиям"));
        return this;
    }

    public GuideToProfessionsPage checkBlocksOfProfessions() {
        $$("[data-qa='title']").shouldHave(texts("Графический дизайнер", "Маркетолог", "Системный администратор", "Инженер данных", "родуктовый аналитик",
                "Бизнес-аналитик", "Тестировщик-автоматизатор", "HR-аналитик", "Менеджер по кадровому делопроизводству", "Менеджер по компенсациям и льготам", "Ресёчер",
                "IT-рекрутер", "Системный аналитик", "2D-художник", "3D-художник", "Unity-разработчик"));
        return this;
    }
}
