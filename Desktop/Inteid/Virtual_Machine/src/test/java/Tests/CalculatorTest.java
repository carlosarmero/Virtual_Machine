package Tests;

import PageObjects.Add;
import PageObjects.CalculatorPage;
import PageObjects.Home;
import PageObjects.Search;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@ExtendWith(ScreenshotOnFailureWatcher.class)
public class CalculatorTest implements TestWatcher {
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
    public void testCalculateEstimate(){
        //buscar palabras
        homePage.searchFor("Google Cloud Platform Pricing Calculator");
        //click link
        searchResultsPage.selectCalculator();
        //1er add
        AddOne.AddOne();
        //esperar cuadro boton que dice compute engine
        AddOne.AddTwo();
        //llenar form
        calculatorPage.fillComputeEngineForm();
        //obtener cantidad
        String cant1 = driver.findElement(By.className("fbc2ib")).getText();
        System.out.println(cant1);
        //intento copiar enlace
        String clipboardText = CalculatorPage.getClipboardText();
        //cierro ventana actual
        //driver.close();
        //<-abro cotizaciotn
        driver.get(clipboardText);
        //obtrngo  cantiddad de nueva ventana
        String cant2 = driver.findElement(By.className("fbc2ib")).getText();
        //verifico que sean igual
        Assertions.assertEquals(cant1, cant2);
    }
    @AfterEach

    public void tearDown() {
        driver.quit();
    }
}