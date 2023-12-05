package com.softwaretestingboard.magento;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import junit.framework.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
public  class GearTest extends BaseTest {
    // All Related Pages Object

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    // All Test Methods As Per Requirements

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        Thread.sleep(2000);
        homePage.mouseHoverOnGearMenu();
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnBagsSubMenuOfGear();

        bagsPage.mouseHoverAndClickOnOvernightDuffleProduct();

        String expectedMessage = "Overnight Duffle";
        String actualMessage = overnightDufflePage.getWelcomeText().substring(0, expectedMessage.length());
        Assert.assertEquals(actualMessage, expectedMessage);

        overnightDufflePage.sendDataToQuantityField(Keys.CONTROL + "a");
        overnightDufflePage.sendDataToQuantityField("3");
        Thread.sleep(2000);
        overnightDufflePage.clickOnAddToCartButton();

        String expectedCartSuccessMessage = "You added Overnight Duffle to your shopping cart.";
        String actualCartSuccessMessage = overnightDufflePage.getTextFromProductAddedToCartSuccessMessage().substring(0, expectedCartSuccessMessage.length());
        Assert.assertEquals(actualCartSuccessMessage, expectedCartSuccessMessage);

        overnightDufflePage.clickOnShoppingCartLinkInSuccessMessage();

        String expectedShoppingCartWelcomeMessage = "Shopping Cart";
        String actualShoppingCartWelcomeMessage = shoppingCartPage.getWelcomeText().substring(0, expectedShoppingCartWelcomeMessage.length());
        Assert.assertEquals(actualShoppingCartWelcomeMessage, expectedShoppingCartWelcomeMessage);

        String expectedProductName = "Overnight Duffle";
        String actualProductName = shoppingCartPage.getProductName().substring(0, expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);

        String expectedQuantity = "3";
        String actualQuantity = shoppingCartPage.getQuantity().substring(0, expectedQuantity.length());
        Assert.assertEquals(actualQuantity, expectedQuantity);

        String expectedSubTotal = "$135.00";
        String actualSubTotal = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal.length());
        Assert.assertEquals(actualSubTotal, expectedSubTotal);

        shoppingCartPage.sendDataToQuantityField(Keys.CONTROL + "a");
        shoppingCartPage.sendDataToQuantityField("5");

        shoppingCartPage.clickOnUpdateShoppingCart();

        Thread.sleep(2000);
        String expectedSubTotal1 = "$225.00";
        String actualSubTotal1 = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal1.length());
        Assert.assertEquals(actualSubTotal1, expectedSubTotal1);
    }
}


