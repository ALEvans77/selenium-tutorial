package uk.co.bpdts.selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.co.bpdts.selenium.tutorial.page.objects.AmazonHomePageObject;
import uk.co.bpdts.selenium.tutorial.page.objects.ProductPage;
import uk.co.bpdts.selenium.tutorial.page.objects.SearchResultPageObject;


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

    @Test
    public void testSearchForProductAndAddToBasket() {

        AmazonHomePageObject amazonHomePageObject = new AmazonHomePageObject(driver);
        SearchResultPageObject searchResultPageObject = amazonHomePageObject.searchForItem("Jo Nesbo");
        searchResultPageObject.findSpecificItemFromSearchResultsByTitle("The Bat: Harry Hole 1");
        ProductPage addToBasketPageObject = searchResultPageObject.addToBasket();


    }

    @After
    public void tearDown() {
        driver.quit();

    }
}
