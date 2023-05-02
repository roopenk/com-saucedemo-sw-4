package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    // Storing Email element into "emailElement" WebElement
    By emailElement = By.id("user-name");
    // Storing Password element into "passwordElement" WebElement
    By passwordElement = By.id("password");
    // Storing Login button element into "loginElement"
    By loginElement = By.id("login-button");

    String emailValue = "standard_user"; // Variable to store email value

    // Method to send Email to Email filed
    public void sendEmailToEmailField() {
        sendTextToElement(emailElement, emailValue);
    }

    String passwordValue = "secret_sauce"; // Variable to store password value

    // Method to send Password to password field
    public void sendPasswordToPasswordField() {
        sendTextToElement(passwordElement, passwordValue);
    }

    // Method to click on the Login button
    public void clickOnTheLoginButton() {
        clickOnTheElement(loginElement);
    }
}
