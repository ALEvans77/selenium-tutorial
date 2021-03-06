package uk.co.bpdts.selenium.tutorial.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePageObject {

    private WebDriver driver;

    public AmazonHomePageObject(WebDriver driver) {

        this.driver = driver;
    }

    /*public SearchResultPageObject searchForItem(String searchTerm) {

        // This code is for the original amazon book search and clicking on the search button when author is entered
        //into search box

        *//*driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();

        return new SearchResultPageObject(driver);*//*


    }*/

    public CareersPageObject clickCareersLink(){

        driver.get("https://www.amazon.jobs/en-gb");

        return new CareersPageObject(driver);
    }
}
