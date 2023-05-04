package ru.market.evotor.test.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ProductPage {

    private SelenideElement product = $x("//*[@class='plans-list']");
    private SelenideElement productInfo = product.$x("div[2]/div/div/plan-item/div/div");
    private SelenideElement addToBasket = productInfo.$x("plan-item-controls/div/button[1]/div");
    private SelenideElement goToBasket = $x("//evo-header/div/div[2]/evo-header-basket-button");

    public void clickAddToBasket() {
        step("Click add to basket button", () -> {
            addToBasket.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
        });
    }

    public void goToBasket() {
        step("Click add to basket button", () -> {
            goToBasket.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
        });
    }

    public void scrollToProduct() {
        step("scroll to the product", () -> {
            product.scrollIntoView(false);
        });
    }
}
