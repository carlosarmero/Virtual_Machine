package Tests;

import PageObjects.Add;
import PageObjects.CalculatorPage;
import PageObjects.Home;
import PageObjects.Search;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CalculatorTest {
    private WebDriver driver;
    private Home homePage;
    private Search searchResultsPage;
    private CalculatorPage calculatorPage;
    private Add AddOne;
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cloud.google.com/");
        homePage = new Home(driver);
        searchResultsPage = new Search(driver);
        calculatorPage = new CalculatorPage(driver);
        AddOne = new Add(driver);
    }

    @Test
    public void testCalculateEstimate() throws InterruptedException {
        //buscar palabras
        homePage.searchFor("Google Cloud Platform Pricing Calculator");
        //establecer espera
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //esperar al enlace a calculadora
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Google Cloud Pricing Calculator")));
        //click link
        searchResultsPage.selectCalculator();
        //wait 1st add to estimate
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/button")));
        AddOne.AddOne();
        //esperar cuadro boton que dice compute engine
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]/div[5]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/button")));
        AddOne.AddTwo();
        //esperar que cargue el form
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("zv7tnb")));
        //llenar form
        calculatorPage.fillComputeEngineForm();
        //obtener cantidad
        String cant1 = driver.findElement(By.className("fbc2ib")).getText();
        System.out.println(cant1);
        //intento copiar enlace
        String clipboardText = CalculatorPage.getClipboardText();

        //cierro ventana actual
        //driver.close();
        driver.get(clipboardText);//<-abro cotizaciotn
        //obtrngo  cantiddad de nueva ventana
        String cant2 = driver.findElement(By.className("fbc2ib")).getText();
        //verifico que sean igual
        Assertions.assertEquals(cant1, cant2);
    }

    @AfterEach

    public void takeScreenshot() throws AWTException, IOException {
        // Create a Robot instance
        Robot robot = new Robot();

        // Define the screen size for capture
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

        // Capture the screen
        BufferedImage screenImage = robot.createScreenCapture(screenRect);

        // Define the file path
        String path = "C:\\Users\\carlos herrerra\\Downloads\\" + "fileName" + ".jpg";

        // Save the screenshot
        ImageIO.write(screenImage, "jpg", new File(path));
    }
    @AfterEach

    public void tearDown() {
        driver.quit();
    }
}