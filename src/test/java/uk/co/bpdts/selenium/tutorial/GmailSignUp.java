package uk.co.bpdts.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailSignUp {

    private WebDriver driver;

    public GmailSignUp(WebDriver driver) {

        this.driver = driver;
    }

    //Enter first name method
    public void enterFirstName() {
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Barry");

    }

    //Enter surname method
    public void enterSurName() {
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Flanders");

    }

    //Enter username method
    public void enterUserName(){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("FredDavies7788");

    }

    //enter password method
    public void enterPassWordAndConfirm(){
        driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("L1verp00l77");
        driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("L1verp00l77");

    }

    // Click next and create next page
    public WelcomeToGooglePage clickNext(){
        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/content/span")).click();
        return new WelcomeToGooglePage(driver);

    }


}
