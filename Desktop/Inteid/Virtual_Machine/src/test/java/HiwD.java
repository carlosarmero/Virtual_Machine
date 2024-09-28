import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class HiwD {
    static Logger log = (Logger) LogManager.getLogger("HiwD.class");

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        log.debug("DEBUG: for gods sake");
        driver.get("https://www.linkedin.com/jobs/search/?currentJobId=3995681383&distance=25&geoId=106313561&keywords=Ingl%C3%A9s%20como%20lengua%20extranjera&origin=JOB_SEARCH_PAGE_KEYWORD_HISTORY&refresh=true");
        log.info("no sesion");
        //System.out.println("mmmdmm");
        Thread.sleep(2000);
        driver.quit();
    }
}
