package ru.icon_t.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class IconTechTests extends TestBase {
    @Test
    @Tag("Icon_t_tests")
    @DisplayName("Главная страница содержит текст: Решаем задачи различной сложности в сфере стратегического развития и повышения операционной эффективности")
    void nameRegistrationFormTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });

        step("Проверить, что она содержит нужный текст", () -> {
            mainPage.pageShouldText();
        });
    }
}
