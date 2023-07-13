import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendTextToWebpage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        String SearchStr = "Selenium Webdriver";
        searchBox.sendKeys(SearchStr);

        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
        searchButton.click();

        driver.close();
    }
}