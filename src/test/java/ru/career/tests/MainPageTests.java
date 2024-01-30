package ru.career.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.career.BaseTest;
import ru.career.pages.MainPage;

public class MainPageTests extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка отображения кнопок в хедере")
    void checkButtonGuideToProfessionsTest() {
        mainPage.openPage("")
                .checkButtonGuideToProfessions()
                .checkButtonCoursesOnSkillsProfessions()
                .checkButtonEnter();
    }
}