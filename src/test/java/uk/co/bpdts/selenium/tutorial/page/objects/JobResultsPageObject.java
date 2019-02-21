package uk.co.bpdts.selenium.tutorial.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobResultsPageObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public JobResultsPageObject(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void selectSoftwareDeveloper() {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("search-content-cover")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/content/div/div/div[1]/div/div[5]" +
                "/div/div/fieldset/div/button[2]/p"))).click();
    }

    public void selectFiveMileDistance() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("search-content-cover")));
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/content/div/div/div[1]/div/div[6]" +
                "/div/fieldset/div[2]/button[1]")).click();
    }

    public void selectPrimeVideo() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("search-content-cover")));
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/content/div/div/div[1]/div/div[8]" +
                "/div/div/fieldset/div/button[2]/div")).click();
    }

    public JobDescriptionPageObject selectFourthjobinList() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("search-content-cover")));
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/content/div/div/div[2]/div[2]" +
                "/div/div[4]/a/div/div[1]/div[1]/h3")).click();
        return new JobDescriptionPageObject(driver);
    }




}




