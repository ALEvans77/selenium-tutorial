package uk.co.bpdts.selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.co.bpdts.selenium.tutorial.page.objects.AmazonHomePageObject;
import uk.co.bpdts.selenium.tutorial.page.objects.CareersPageObject;
import uk.co.bpdts.selenium.tutorial.page.objects.JobDescriptionPageObject;
import uk.co.bpdts.selenium.tutorial.page.objects.JobResultsPageObject;


public class AmazonAddToBagTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                this.getClass().getClassLoader().getResource("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");
        driver.manage().window().fullscreen();
    }

//    @Test
    /*public void testSearchForProductAndAddToBasket() {

        AmazonHomePageObject amazonHomePageObject = new AmazonHomePageObject(driver);
        SearchResultPageObject searchResultPageObject = amazonHomePageObject.searchForItem("Jo Nesbo");
        searchResultPageObject.findSpecificItemFromSearchResultsByTitle("The Bat: Harry Hole 1");
        ProductPage addToBasketPageObject = searchResultPageObject.addToBasket();

    }*/

    @Test
    public void testSearchForCareerAndApply(){
        AmazonHomePageObject amazonHomePageObject = new AmazonHomePageObject(driver);
        CareersPageObject careersPageObject = amazonHomePageObject.clickCareersLink();
        JobResultsPageObject jobResultsPageObject = careersPageObject.findJobsByLocation("london");
        jobResultsPageObject.selectSoftwareDeveloper();
        jobResultsPageObject.selectFiveMileDistance();
        jobResultsPageObject.selectPrimeVideo();
        JobDescriptionPageObject jobDescriptionPageObject = jobResultsPageObject.selectFourthjobinList();
        jobDescriptionPageObject.clickApply();
    }

    @After
    public void tearDown() {
        //driver.quit();

    }
}
