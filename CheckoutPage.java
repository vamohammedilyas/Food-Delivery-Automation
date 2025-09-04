package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
//checking by tagName
    By checkoutHeader = By.tagName("h1");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCheckoutHeader() {
        return driver.findElement(checkoutHeader).getText();
    }
}
