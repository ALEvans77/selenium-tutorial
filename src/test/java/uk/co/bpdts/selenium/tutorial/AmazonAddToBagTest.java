package uk.co.bpdts.selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.co.bpdts.selenium.tutorial.pageObjects.AmazonHomePageObject;
import uk.co.bpdts.selenium.tutorial.pageObjects.SearchResultPageObject;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

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


        AmazonHomePageObject amazonHomePageObject = new AmazonHomePageObject(driver); // New instance of an Object
        SearchResultPageObject searchResultPageObject = amazonHomePageObject.searchForItem("Jo Nesbo");
        searchResultPageObject.findSpecificItemFromSearchResultsByTitle("Macbeth (Hogarth Shakespeare)");

        assertThat("Not on book product page", driver.getTitle(), containsString("Macbeth"));

        /*driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
        //assertThat("url is correct", driver.getCurrentUrl(), is("https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_gb&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D0%26oldCustomerId%3D%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_gb&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.0"));
        assertThat("url is correct", driver.getTitle(), containsString("Sign In"));
        */
    }

    @After
    public void tearDown() {
        driver.quit();

    }
}
