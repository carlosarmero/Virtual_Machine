import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add {
    private WebDriver driver;

    public Add(WebDriver driver) {
        this.driver = driver;
    }

    public void AddOne() {
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/button")).click();
    }

    public void AddTwo() {
        driver.findElement(By.cssSelector("#yDmH0d > div.uW2Fw-Sx9Kwc.uW2Fw-Sx9Kwc-OWXEXe-vOE8Lb.uW2Fw-Sx9Kwc-OWXEXe-di8rgd-bN97Pc-QFlW2.mDH3Wc.uW2Fw-Sx9Kwc-OWXEXe-FNFY6c > div.uW2Fw-wzTsW > div > div > div > div.wrzENe > div > div > div:nth-child(1) > div > div > div")).click();
    }

}