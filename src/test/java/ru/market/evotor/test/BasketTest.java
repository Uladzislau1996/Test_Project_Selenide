package ru.market.evotor.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.market.evotor.test.Pages.BasketPage;


public class BasketTest extends BaseTest {

    BasketPage basketPage = new BasketPage();

    @Test(description = "There is available add product to cart")
    public void productAppearsInBasket() {
        Assert.assertTrue(basketPage.productIsDisplayed());
    }

    @Test(description = "There is correct data in basket")
    public void correctProductDataInBasket() {
        Assert.assertTrue(basketPage.checkProductTitle(), "Incorrect product title");
        Assert.assertTrue(basketPage.checkProductAmount(), "Incorrect product price");
    }

}
