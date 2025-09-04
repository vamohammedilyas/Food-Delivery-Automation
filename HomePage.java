package com.automation.pages;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By locationBox = By.id("location");
    By firstLocation = By.xpath("//span[contains(text(),'Bangalore')]");
    By searchBox = By.xpath("//input[@placeholder='Search for restaurants or dishes']");
    By firstRestaurant = By.xpath("(//div[contains(@class,'_3XX_A')])[1]");
//constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLocation(String city) throws InterruptedException {
        driver.findElement(locationBox).sendKeys(city);
        Thread.sleep(2000);
        driver.findElement(firstLocation).click();
    }

    public void searchRestaurant(String food) throws InterruptedException {
        driver.findElement(searchBox).sendKeys(food);
        Thread.sleep(2000);
        driver.findElement(firstRestaurant).click();
    }
}
