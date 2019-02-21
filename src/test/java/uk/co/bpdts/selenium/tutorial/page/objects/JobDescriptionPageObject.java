package uk.co.bpdts.selenium.tutorial.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobDescriptionPageObject {

    private WebDriver driver;

    public JobDescriptionPageObject(WebDriver driver){

        this.driver = driver;
    }

    public ApplyForRole clickApply(){

        driver.findElement(By.id("apply-button")).click();
        return new ApplyForRole(driver);

    }
}
