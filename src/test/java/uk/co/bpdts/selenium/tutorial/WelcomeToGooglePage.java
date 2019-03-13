package uk.co.bpdts.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WelcomeToGooglePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public WelcomeToGooglePage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver,20);
    }

    public VerifyPhoneNumberPage enterPhoneNumber(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNumberId")));
        driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("07912567217");
        driver.findElement(By.xpath("//*[@id=\"gradsIdvPhoneNext\"]/content/span")).click();

        return new VerifyPhoneNumberPage(driver);

    }





}




