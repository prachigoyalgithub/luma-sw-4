package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    // All Elements' Path on Homepage

    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By topsSubMenuOfWomen = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsSubMenuOfTops = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottomSubMenuOfMen = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pantsSubMenuOfBottom = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagsSubMenuOfGear = By.xpath("//span[normalize-space()='Bags']");

    // All Elements' Action Methods on Homepage

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTopsSubMenuOfWomen() {
        mouseHoverToElement(topsSubMenuOfWomen);
    }

    public void mouseHoverAndClickOnJacketsSubMenuOfTops() {
        mouseHoverToElementAndClick(jacketsSubMenuOfTops);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomSubMenuOfMen() {
        mouseHoverToElement(bottomSubMenuOfMen);
    }

    public void mouseHoverAndClickOnPantsSubMenuOfBottoms() {
        mouseHoverToElementAndClick(pantsSubMenuOfBottom);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBagsSubMenuOfGear() {
        mouseHoverToElementAndClick(bagsSubMenuOfGear);
    }
}


