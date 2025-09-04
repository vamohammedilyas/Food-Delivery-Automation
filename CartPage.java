package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By checkoutButton = By.xpath("//span[contains(text(),'Checkout')]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() throws InterruptedException {
        driver.findElement(checkoutButton).click();
        Thread.sleep(2000);
    }
}
