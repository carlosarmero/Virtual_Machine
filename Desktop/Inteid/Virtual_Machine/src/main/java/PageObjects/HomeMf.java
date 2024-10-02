package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeMf {
    private WebDriver driver;

    public HomeMf(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String query) {
        driver.findElement(By.className("YSM5S")).click();
        driver.findElement(By.className("qdOxv-fmcmS-wGMbrd")).sendKeys(query);
        driver.findElement(By.className("qdOxv-fmcmS-wGMbrd")).submit();
    }
}