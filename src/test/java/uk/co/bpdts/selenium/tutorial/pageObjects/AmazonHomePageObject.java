package uk.co.bpdts.selenium.tutorial.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePageObject {

    private WebDriver driver;

    public AmazonHomePageObject(WebDriver driver) {

        this.driver = driver;
    }

    public void searchForItem(String searchTerm) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
    }
}
