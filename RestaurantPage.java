package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestaurantPage {
    WebDriver driver;

    By firstFoodAddButton = By.xpath("(//div[contains(text(),'ADD')])[1]");
//constructor
    public RestaurantPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFoodToCart() throws InterruptedException {
        driver.findElement(firstFoodAddButton).click();
        Thread.sleep(2000);
    }
}
