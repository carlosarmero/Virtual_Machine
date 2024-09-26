import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiwD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/jobs/search/?currentJobId=3995681383&distance=25&geoId=106313561&keywords=Ingl%C3%A9s%20como%20lengua%20extranjera&origin=JOB_SEARCH_PAGE_KEYWORD_HISTORY&refresh=true");
        Thread.sleep(3000);
        driver.quit();
    }
}
