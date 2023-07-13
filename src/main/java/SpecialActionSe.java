import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class SpecialActionSe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(draggable, droppable).build().perform();

        Actions contextClick = new Actions(driver);

        contextClick.contextClick().build().perform();

        Actions actionObj = new Actions(driver);
        actionObj.keyDown(Keys.F1);

    }
}
