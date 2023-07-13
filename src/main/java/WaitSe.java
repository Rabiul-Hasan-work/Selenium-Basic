import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitSe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        System.out.println(driver.getTitle());

        //Explicit Wait

//        WebDriver wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedCondition.visibilityOf(driver.findElement(By.id("js-link-box-en"))));

        //Fluent Wait
//        Wait fluentWait = new FluentWait<WebDriver>(driver)
//                .withTimeout(15, TimeUnit.SECONDS)
//                .pollingEvery(5, TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);
//
//        fluentWait.until(new Function<WebDriver, WebElement>(){
//
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.id("js-link-box-en"));
//            }
//        });
    }
}
