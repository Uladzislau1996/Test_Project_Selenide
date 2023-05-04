package ru.market.evotor.test.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class BasketPage {

    private SelenideElement productTitle = $x("//basket-list-item/div/div[2]/div/div");
    private SelenideElement productAmount = $x("//*[@class='basket-item__info-row']/div[2]");
    private SelenideElement toPay = $x("//*[@class='basket-total__summ']");
    private SelenideElement product = $x("//*[@class='basket__list']");

    public String getProductAmount() {
        return step("get product amount in basket", () -> {
            return productAmount.getText();
        });
    }

    public String getToPay() {
        return step("get amount for pay", () -> {
            return toPay.getText();
        });
    }

    public boolean productIsDisplayed() {
        return step("get amount for pay", () -> {
            product.shouldBe(Condition.visible, Duration.ofSeconds(30));
            return product.isDisplayed();
        });
    }

    public boolean checkProductTitle() {
        return step("check product title", () -> productTitle.is(Condition.text("Премиум поддержка Эвотор")));
    }

    public boolean checkProductAmount() {
        return step("check product amount", () -> productAmount.is(Condition.text("2 500 ₽/кв")));
    }


}
