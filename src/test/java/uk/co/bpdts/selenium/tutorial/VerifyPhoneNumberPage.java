package uk.co.bpdts.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyPhoneNumberPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public VerifyPhoneNumberPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver,20);

    }

    public VerifyCodeEnteredPage codeEnteredPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#code")));
        driver.findElement(By.xpath("//*[@id=\"code\"]")).sendKeys("901724");

        return new VerifyCodeEnteredPage(driver);
    }






}
