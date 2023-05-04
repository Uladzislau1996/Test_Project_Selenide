package ru.market.evotor.test.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {

    private SelenideElement product = $x("//div/store-intro-problem[7]/div/store-intro-product[2]");

    public static MainPage openPage() {
        open("store/apps/");
        return new MainPage();
    }

    public void clickProduct() {
        step("Click on product", () -> {
            product.click();
        });
    }

    public void scrollToProduct() {
        step("scroll to product", () -> {
            product.scrollIntoView(false);
        });
    }

}
