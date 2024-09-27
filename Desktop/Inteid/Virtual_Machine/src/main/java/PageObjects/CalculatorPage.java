package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        Thread.sleep(10000);
        driver.findElement(By. xpath("//*[@id=\"c44\"]"));//baja---machine type
        Thread.sleep(10000);
        driver.findElement(By.className("VfPpkd-aPP78e"));
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/ul/li[7]")).click();

        // add cpus
        //driver.findElement(By.id("c46")).sendKeys("8");

        //amopunt of memory
        //List<WebElement> options = driver.findElements(By.className("VfPpkd-YCNiv"));
        // options.get(0).sendKeys("30");
        //driver.findElement(By.id("c47")).sendKeys("30");
        Thread.sleep(5000);

        //add gpus
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[21]/div/div/div[1]/div/div/span/div/button")).click();
        Thread.sleep(10000);
        //gpu model
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div")).click();
        Thread.sleep(5000);//*[@id="ow6"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div/div[1]/div/div/div/div[2]/ul/li[4]
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[23]/div/div[1]/div/div/div/div[2]/ul/li[4]")).click();
        Thread.sleep(5000);

        //region
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[28]/div/div[1]/div/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[28]/div/div[1]/div/div/div/div[2]/ul/li[7]")).click();
        Thread.sleep(5000);
        /*years
        driver.findElement(By.className("E7Widc")).click();
        List<WebElement> radio = driver.findElements(By.className("E7Widc"));
        radio.get(1).sendKeys("1 year");
        Thread.sleep(10000);*/
        // copar link
        driver.findElement(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/button")).click();
        Thread.sleep(5000); //link2
        driver.findElement(By.cssSelector("#yDmH0d > div.uW2Fw-Sx9Kwc.uW2Fw-Sx9Kwc-OWXEXe-vOE8Lb.uW2Fw-Sx9Kwc-OWXEXe-di8rgd-bN97Pc-QFlW2.no1KDb.uW2Fw-Sx9Kwc-OWXEXe-FNFY6c > div.uW2Fw-wzTsW > div > div > div > div.SfvQgf > div.n2q0Vd > div:nth-child(2) > button")).click();
        //obtener link
        WebElement link = driver.findElement(By.cssSelector("#yDmH0d > div.uW2Fw-Sx9Kwc.uW2Fw-Sx9Kwc-OWXEXe-vOE8Lb.uW2Fw-Sx9Kwc-OWXEXe-di8rgd-bN97Pc-QFlW2.no1KDb.uW2Fw-Sx9Kwc-OWXEXe-FNFY6c > div.uW2Fw-wzTsW > div > div > div > div.SfvQgf > div.n2q0Vd > div:nth-child(2) > button"));
        linkS = link.getAttribute("href");
        Thread.sleep(5000);

    }

    public void emailEstimate(String email) {
        driver.findElement(By.id("emailEstimate")).sendKeys(email);
        driver.findElement(By.id("sendEmail")).click();
    }

    public String getTotalEstimatedCost() {
        return driver.findElement(By.cssSelector(".total-cost")).getText(); // Adjust selector as needed
    }
}