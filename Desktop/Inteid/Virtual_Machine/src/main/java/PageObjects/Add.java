package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Add {
    private WebDriver driver;
    public Add(WebDriver driver) {
        this.driver = driver;
    }
    public void AddOne() {
        //wait 1st add to estimate
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/button")));
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/button")).click();
    }

    public void AddTwo() {
        //esperar cuadro boton que dice compute engine
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]/div[5]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/button")));
        driver.findElement(By.cssSelector("#yDmH0d > div.uW2Fw-Sx9Kwc.uW2Fw-Sx9Kwc-OWXEXe-vOE8Lb.uW2Fw-Sx9Kwc-OWXEXe-di8rgd-bN97Pc-QFlW2.mDH3Wc.uW2Fw-Sx9Kwc-OWXEXe-FNFY6c > div.uW2Fw-wzTsW > div > div > div > div.wrzENe > div > div > div:nth-child(1) > div > div > div")).click();
    }

}