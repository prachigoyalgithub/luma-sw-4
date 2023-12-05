package com.softwaretestingboard.magento;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    // All Related Pages Object

    HomePage homePage = new HomePage();
    MenPage menPantsPage = new MenPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    // All Test Methods As Per Requirements

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        Thread.sleep(2000);
        homePage.mouseHoverOnMenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnBottomSubMenuOfMen();
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnPantsSubMenuOfBottoms();

        menPantsPage.mouseHoverOnCronusYodaPant();
        menPantsPage.mouseHoverAndClickOnCronusYogaPantSize32();
        menPantsPage.mouseHoverAndClickCronusYogaPantColourBlack();
        menPantsPage.mouseHoverAndClickOnCronusYogaPantAddToCartButton();

        String expectedProductAddMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualProductAddMessage = menPantsPage.getProductAddedMessage().substring(0, expectedProductAddMessage.length());
        Assert.assertEquals(actualProductAddMessage, expectedProductAddMessage);

        menPantsPage.clickOnShoppingCartLinkInProductAddMessage();

        String expectedShoppingCartWelcomeMessage = "Shopping Cart";
        String actualShoppingCartWelcomeMessage = shoppingCartPage.getWelcomeText().substring(0, expectedShoppingCartWelcomeMessage.length());
        Assert.assertEquals(actualShoppingCartWelcomeMessage, expectedShoppingCartWelcomeMessage);

        String expectedProductName = "Cronus Yoga Pan";
        String actualProductName = shoppingCartPage.getProductName().substring(0, expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);

        String expectedProductSize = "32";
        String actualProductSize = shoppingCartPage.getProductSize().substring(0, expectedProductSize.length());
        Assert.assertEquals(actualProductSize, expectedProductSize);

        String expectedProductColour = "Black";
        String actualProductColour = shoppingCartPage.getProductColour().substring(0, expectedProductColour.length());
        Assert.assertEquals(actualProductColour, expectedProductColour);
    }
}


