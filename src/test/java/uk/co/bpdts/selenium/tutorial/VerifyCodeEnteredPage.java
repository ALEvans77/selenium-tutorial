package uk.co.bpdts.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VerifyCodeEnteredPage {

    private WebDriver driver;


    public VerifyCodeEnteredPage(WebDriver driver){

        this.driver = driver;

    }

    public VerifyCodePage clickVerify(){
        driver.findElement(By.xpath("//*[@id=\"gradsIdvVerifyNext\"]/content/span")).click();
        return new VerifyCodePage(driver);


    }






}
