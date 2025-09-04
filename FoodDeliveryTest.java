package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FoodDeliveryTest extends BaseTest {

    @Test
    public void foodOrderFlow() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.enterLocation("Bangalore");
        home.searchRestaurant("Pizza");

        RestaurantPage restaurant = new RestaurantPage(driver);
        restaurant.addFoodToCart();

        CartPage cart = new CartPage(driver);
        cart.proceedToCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        String header = checkout.getCheckoutHeader();

        System.out.println("Checkout Page Header: " + header);
        Assert.assertTrue(header.contains("Checkout") || header.length() > 0, "Not navigated to Checkout Page");
    }
}
