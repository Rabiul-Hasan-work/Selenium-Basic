import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");

        //locators
        //ID
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        Long end = System.currentTimeMillis();

        System.out.println("ID: " + (end - start));

        //Xpath
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
        end = System.currentTimeMillis();

        System.out.println("Xpath: " + (end - start));

        //cssSelector
        start = System.currentTimeMillis();
        driver.findElement((By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang2")));
        end = System.currentTimeMillis();

        System.out.println("CssSelector: " + (end - start));

        driver.close();

    }
}
