package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JacketsPage extends Utility {
    // All Elements' Path on WomenJackets page

    By sortByFilterPath = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By allProductTitle = By.xpath("//strong[@class = 'product name product-item-name']");
    By allProductPrice = By.xpath("//span[@class = 'normal-price']//span[@class = 'price']");

    // All Elements' Action Methods on WomenJackets page

    public void sortByFilter(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByFilterPath, sortByOption);
    }

    public List<WebElement> getAllProductTitleOnPage() {
        List<WebElement> products = driver.findElements(allProductTitle);
        return products;
    }

    public List<WebElement> getAllProductPriceOnPage() {
        List<WebElement> products = driver.findElements(allProductPrice);
        return products;
    }
}
