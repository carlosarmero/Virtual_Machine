import PageObjects.Add;
import PageObjects.CalculatorPage;
import PageObjects.Home;
import PageObjects.Search;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorTest {
    private WebDriver driver;
    private Home homePage;
    private Search searchResultsPage;
    private CalculatorPage calculatorPage;
    private Add AddOne;
    public static String linkToShare;
    @BeforeEach
    public void setUp() {
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update path
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
        homePage.searchFor("Google Cloud Platform Pricing Calculator");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Google Cloud Pricing Calculator")));
        searchResultsPage.selectCalculator();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ucj-1\"]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/button")));
        AddOne.AddOne();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]/div[5]/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/div/button")));
        AddOne.AddTwo();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("zv7tnb")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ow6\"]/div/div/div/div/div/div/div[1]/div/div[2]/div[3]/div[11]/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[1]")));
        calculatorPage.fillComputeEngineForm();

        WebElement link = driver.findElement(By.cssSelector("#yDmH0d > div.uW2Fw-Sx9Kwc.uW2Fw-Sx9Kwc-OWXEXe-vOE8Lb.uW2Fw-Sx9Kwc-OWXEXe-di8rgd-bN97Pc-QFlW2.no1KDb.uW2Fw-Sx9Kwc-OWXEXe-FNFY6c > div.uW2Fw-wzTsW > div > div > div > div.SfvQgf > div.n2q0Vd > div:nth-child(2) > button"));
        String ff = link.getAttribute("href");
        driver.get(ff);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("zv7tnb")));
        //String email = "your_temp_email@yopmail.com"; // Replace with dynamic retrieval from Yopmail
        //calculatorPage.emailEstimate(email);

        // Wait for the email to arrive (you may want to implement a more robust wait)
        //Thread.sleep(30000); // Adjust time based on your testing needs

        //String estimatedCost = calculatorPage.getTotalEstimatedCost();
        // Here, you would check the email for the cost and compare it.
        // This would typically require a Yopmail API or scraping for verification.
        // Assertions.assertEquals(expectedCost, estimatedCost);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}