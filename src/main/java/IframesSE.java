import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframesSE {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");

//        String title = driver.switchTo().frame(0).findElement(By.cssSelector("#main > h1")).getText();
//        System.out.println(title);

        WebElement iframe = driver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));

        driver.switchTo().frame(iframe).findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left.topnavbar > a.w3-bar-item.w3-button.ga-nav.active")).click();

//        driver.close();

    }
}
