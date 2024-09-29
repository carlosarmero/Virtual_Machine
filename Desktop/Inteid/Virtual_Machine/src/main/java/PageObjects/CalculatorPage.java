package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CalculatorPage {
    private WebDriver driver;
    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String linkS;
    public void fillComputeEngineForm() {
        //esperar que cargue el form
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("zv7tnb")));
        //instances
        //driver.findElement(By.cssSelector("#c22")).sendKeys("4");ok pero 14
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[3]/button")).click();
        //baja---machine type
        driver.findElement(By. xpath("//*[@id=\"c44\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("VfPpkd-aPP78e")));
        driver.findElement(By.className("VfPpkd-aPP78e"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[1]")).click();
        //Thread.sleep(10000);//<--si es nece¿sario el wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/ul/li[7]")).click();
        //add gpus
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[21]/div/div/div[1]/div/div/span/div/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//<--si es nece¿sario el wait
        //gpu model
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div/div[1]/div/div/div/div[2]/ul/li[4]")).click();
        //region
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[28]/div/div[1]/div/div")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//<--si es nece¿sario el wait
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[28]/div/div[1]/div/div/div/div[2]/ul/li[7]")).click();
        // copar link
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);; //link2 //*[@id="yDmH0d"]/div[6]/div[2]/div/div/div/div[2]/div[2]/div[2]/button
        driver.findElement(By.cssSelector("#yDmH0d > div.uW2Fw-Sx9Kwc.uW2Fw-Sx9Kwc-OWXEXe-vOE8Lb.uW2Fw-Sx9Kwc-OWXEXe-di8rgd-bN97Pc-QFlW2.no1KDb.uW2Fw-Sx9Kwc-OWXEXe-FNFY6c > div.uW2Fw-wzTsW > div > div > div > div.SfvQgf > div.n2q0Vd > div:nth-child(2) > button")).click();
        //obtener link
        String clipboardText = getClipboardText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static String getClipboardText() {
        try {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable contents = clipboard.getContents(null);
            if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String) contents.getTransferData(DataFlavor.stringFlavor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}