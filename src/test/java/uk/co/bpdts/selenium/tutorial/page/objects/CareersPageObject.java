package uk.co.bpdts.selenium.tutorial.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPageObject {

    private WebDriver driver;

    public CareersPageObject(WebDriver driver){

        this.driver = driver;
    }

    public JobResultsPageObject findJobsByLocation(String location){

        driver.findElements(By.cssSelector("#location-typeahead")).get(1).sendKeys(location);
        // do click on search button
        driver.findElement(By.id("search-button")).click();
        // return a new page object called JobResultsPageObject (you also need to create a class called the same)
        return new JobResultsPageObject(driver);

    }



}
