package uk.co.bpdts.selenium.tutorial.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPageObject {

    private WebDriver driver;

    public SearchResultPageObject(WebDriver driver) {

        this.driver = driver;
    }

    public void findSpecificItemFromSearchResultsByTitle(String specificItemTitle){
        WebDriverWait driverWait = new WebDriverWait(driver, 20);
        List<WebElement>searchResults = driverWait
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("* > div > div > div > div.a-fixed-left-grid-col.a-col-right > " +
                                "div.a-row.a-spacing-small > div > a > h2")));
        try {
            for (WebElement element : searchResults) {
                if (element.getText().equals(specificItemTitle)) {
                    element.click();
                }

            }
        } catch (StaleElementReferenceException e) {
            // do nothing
        }
    }
}
