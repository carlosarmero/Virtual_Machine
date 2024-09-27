package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    private WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCalculator() {
        driver.findElement(By.linkText("Google Cloud Pricing Calculator")).click();
    }
}
