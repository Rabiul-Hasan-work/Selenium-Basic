import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetText {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");

        WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));

        String titleText = titleOfWebPage.getText();

        String expectedText = "Wikipedia";

        if(titleText.equals(expectedText)){
            System.out.println("Text has Passed !");
        }else {
            System.out.println("Test did not passed !");
            driver.close();
            throw new Exception();
        }

        driver.close();
    }
}
