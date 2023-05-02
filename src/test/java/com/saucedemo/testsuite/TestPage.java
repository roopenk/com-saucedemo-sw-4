package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.Products;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage extends BaseTest {
    LoginPage loginPage = new LoginPage(); // Creating Login Page Object
    Products products = new Products(); // Creating Products Page Object

    @Test
    // Verifying that User can Log in with valid credentials and the Products text is displayed
    public void verifyThatUserShouldLoginSuccessfully() {
        loginPage.sendEmailToEmailField(); // Sending Email
        loginPage.sendPasswordToPasswordField(); // Sending Password
        loginPage.clickOnTheLoginButton(); // Clicking on Log in button
        products.verifyThatProductsTextIsDisplayed(); // Verifying Products Text
    }

    @Test
    // Verifying that Six products are displayed on products page
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.sendEmailToEmailField(); // Sending Email
        loginPage.sendPasswordToPasswordField(); // Sending Password
        loginPage.clickOnTheLoginButton(); // Clicking on Log in button
        // Verifying that Six products are displayed
        int expectedNumberOfProducts = 6;
        int actualNumberOfProducts = driver.findElements(By.className("inventory_item")).size();
        Assert.assertEquals(actualNumberOfProducts, expectedNumberOfProducts, "Number Of Products MisMatched...!!!");
    }
}
