import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickingWebPage {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        WebElement englishButton = driver.findElement(By.id("js-link-box-en"));

        englishButton.click();

        String expectedTitle = "Welcome to Wikipedia";
        WebElement titleOfEnglishPage = driver.findElement(By.id("Welcome_to_Wikipedia"));

        if (titleOfEnglishPage.getText().equals((expectedTitle))) {
            System.out.println("Test has passed! Page is the  English one");
        } else{
            System.out.println(("Test has failed! Click"));
        }


//        driver.close();
    }
}
