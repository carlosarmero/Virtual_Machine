package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Search {
    private WebDriver driver;
    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCalculator() {
        //esperar al enlace a calculadora
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Google Cloud Pricing Calculator")));
        driver.findElement(By.linkText("Google Cloud Pricing Calculator")).click();
    }
}
