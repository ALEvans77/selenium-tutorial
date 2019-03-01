package uk.co.bpdts.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecoveryInfoPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RecoveryInfoPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver,20);
    }

    public void EnterDateOfBirth() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("22");
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("4");
        driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1977");
        Select gender = new Select(driver.findElement(By.id("gender")));
        gender.selectByValue("1");

        driver.findElement(By.xpath("//*[@id=\"personalDetailsNext\"]/content/span")).click();
    }

}



