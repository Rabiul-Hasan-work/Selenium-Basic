import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class JavascriptExecutorSe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.udemy.com/course/introduction-to-core-java/");

        WebElement signUpButton = driver.findElement(By.cssSelector("#udemy > div.ud-main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.ud-header.ud-app-loaded > div.ud-text-sm.header--header--1SLKV.header--flex-middle--2QeVR > div:nth-child(9) > a > span"));

        //Clicking with JavascriptExecutor
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signUpButton);

//        JavascriptExecutor javascriptExecutor = (JavascriptExecutorSe) driver;
//        javascriptExecutor.executeScript("arguments[0].click();", signUpButton);

        //Setting up timeouts
        ((JavascriptExecutor) driver).executeScript("window.setTimeout(arguments[arguments.length-1], 1000);");

        //Changing the webpage
//        ((JavascriptExecutor) driver).executeScript("window.location = 'https://www.wikipedia.com'");

        //Scroll the Webpage
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");


//        driver.close();

    }
}
