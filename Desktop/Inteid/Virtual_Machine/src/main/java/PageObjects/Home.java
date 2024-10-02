package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Home {
    private WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String query) {
        driver.findElement(By.cssSelector("#kO001e > div.WPN7R > div.TDbJKc > div > div.a7K4Uc > div.ND91id > div.p1o4Hf > form > div > input")).click();
        driver.findElement(By.name("q")).sendKeys(query);
        driver.findElement(By.name("q")).submit();
    }
}