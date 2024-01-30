package ru.career.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.career.BaseTest;
import ru.career.pages.GuideToProfessionsPage;

public class GuideToProfessionsTests extends BaseTest {

    GuideToProfessionsPage guideToProfessionsPage = new GuideToProfessionsPage();

    @Test
    @DisplayName("Проверка страницы 'Путеводитель по профессиям'")
    void checkButtonGuideToProfessionsTest() {
        guideToProfessionsPage.openPage("")
                .checkPageTitle()
                .checkBlocksOfProfessions();
    }
}
