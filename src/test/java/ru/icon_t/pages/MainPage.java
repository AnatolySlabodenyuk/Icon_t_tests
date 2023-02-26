package ru.icon_t.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final String TITLE_TEXT = "Решаем задачи различной сложности в сфере стратегического развития и повышения операционной эффективности";

    private SelenideElement
            mainPage = $("[field=\"tn_text_1661424626227\"]");

    public MainPage openPage() {
        open(baseUrl);
        return  this;
    }

    public MainPage pageShouldText() {
        mainPage.shouldHave(text(TITLE_TEXT));
        return this;
    }
}
