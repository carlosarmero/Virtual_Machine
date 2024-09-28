package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class CalculatorPage {
    private WebDriver driver;
    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String linkS;
    public void fillComputeEngineForm() throws InterruptedException {
        //instances
        //driver.findElement(By.cssSelector("#c22")).sendKeys("4");ok pero 14
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[3]/button")).click();

        driver.findElement(By. xpath("//*[@id=\"c44\"]"));//baja---machine type
        driver.findElement(By.className("VfPpkd-aPP78e"));
        Thread.sleep(10000);//<--si es nece¿sario el wait
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[1]")).click();
        Thread.sleep(10000);//<--si es nece¿sario el wait
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/ul/li[7]")).click();

        //add gpus
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[21]/div/div/div[1]/div/div/span/div/button")).click();
        Thread.sleep(10000);//<--si es nece¿sario el wait
        //gpu model
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div/div[1]/div/div/div/div[2]/ul/li[4]")).click();

        //region
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[28]/div/div[1]/div/div")).click();
        Thread.sleep(10000);//<--si es nece¿sario el wait
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[28]/div/div[1]/div/div/div/div[2]/ul/li[7]")).click();

        // copar link
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/button")).click();
        Thread.sleep(10000); //link2 //*[@id="yDmH0d"]/div[6]/div[2]/div/div/div/div[2]/div[2]/div[2]/button
        driver.findElement(By.cssSelector("#yDmH0d > div.uW2Fw-Sx9Kwc.uW2Fw-Sx9Kwc-OWXEXe-vOE8Lb.uW2Fw-Sx9Kwc-OWXEXe-di8rgd-bN97Pc-QFlW2.no1KDb.uW2Fw-Sx9Kwc-OWXEXe-FNFY6c > div.uW2Fw-wzTsW > div > div > div > div.SfvQgf > div.n2q0Vd > div:nth-child(2) > button")).click();
        //obtener link
        String clipboardText = getClipboardText();
        System.out.println("Text copied to clipboard: " + clipboardText);
        Thread.sleep(5000);
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