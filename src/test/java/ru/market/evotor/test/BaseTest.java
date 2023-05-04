package ru.market.evotor.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import ru.market.evotor.test.Pages.MainPage;
import ru.market.evotor.test.Pages.ProductPage;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static ru.market.evotor.test.config.SelenideConfig.config;

public class BaseTest {

    MainPage mainPage;
    ProductPage productPage = new ProductPage();

    @BeforeClass(description = "Применить конфигурации")
    public void setUp() {
        config();
    }

    @BeforeMethod(description = "Выбрать событие и коэффициент")
    public void clickProduct() {
        mainPage = MainPage.openPage();
        mainPage.scrollToProduct();
        mainPage.clickProduct();
        productPage.scrollToProduct();
        productPage.clickAddToBasket();
        productPage.goToBasket();
    }

    @AfterMethod(description = "Очистить кэш и куки")
    public void tearDown() {
        clearBrowserCookies();
        closeWebDriver();
    }
}
