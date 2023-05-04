package ru.market.evotor.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.market.evotor.test.Pages.BasketPage;


public class BasketTest extends BaseTest {

    BasketPage basketPage = new BasketPage();

    @Test(description = "There is correct data in basket")
    public void correctProductDataInBasket() {
        Assert.assertTrue(basketPage.productIsDisplayed(), "There is no product in basket");
        Assert.assertTrue(basketPage.checkProductTitle(), "Incorrect product title");
        Assert.assertTrue(basketPage.checkProductAmount(), "Incorrect product price");
    }

}
