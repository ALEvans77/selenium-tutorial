package uk.co.bpdts.selenium.tutorial.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToBasketPageObject {

    private WebDriver driver;

    public AddToBasketPageObject(){

        this.driver = driver;
    }

    public void addItemToBasket(){

        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
    }


}
