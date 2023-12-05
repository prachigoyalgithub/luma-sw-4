package com.softwaretestingboard.magento;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    // All Related Pages Object

    HomePage homePage = new HomePage();
    JacketsPage womenJacketsPage = new JacketsPage();

    // All Test Methods As Per Requirements

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTopsSubMenuOfWomen();
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnJacketsSubMenuOfTops();


        List<WebElement> list = womenJacketsPage.getAllProductTitleOnPage();
        ArrayList originalList = new ArrayList();
        for (WebElement l: list) {
            originalList.add(l.getText());
        }
        Collections.sort(originalList);
        System.out.println(originalList);

        womenJacketsPage.sortByFilter("Product Name");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = womenJacketsPage.getAllProductTitleOnPage();
        for (WebElement l: list) {
            sortedList.add(l.getText());
        }
        System.out.println(sortedList);
        Assert.assertEquals(originalList, sortedList);
    }

    @Test
    public void verifyTheSortByPriceFilter () throws InterruptedException {
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTopsSubMenuOfWomen();
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnJacketsSubMenuOfTops();

        List<WebElement> list = womenJacketsPage.getAllProductPriceOnPage();
        ArrayList originalPriceList = new ArrayList();
        for (WebElement l: list) {
            originalPriceList.add(l.getText());
        }
        Collections.sort(originalPriceList);
        System.out.println(originalPriceList);

        womenJacketsPage.sortByFilter("Price");
        Thread.sleep(2000);
        ArrayList sortedPriceList = new ArrayList();
        list = womenJacketsPage.getAllProductPriceOnPage();
        for (WebElement l: list) {
            sortedPriceList.add(l.getText());
        }
        System.out.println(sortedPriceList);
        Assert.assertEquals(originalPriceList, sortedPriceList);
    }
}


