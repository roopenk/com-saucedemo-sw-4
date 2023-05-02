package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class Products extends Utility {
    // Storing Products Text into "productsTextElement" WebElement
    By productsTextElement = By.xpath("//span[text()='Products']");

    // Method to Verify Products text is displayed
    public void verifyThatProductsTextIsDisplayed() {
        getTextFromElement(productsTextElement);
    }
}
