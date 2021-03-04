package HomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class HomeWork9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"C:\\webdrivers\\chromedriver.exe" );

        WebDriver webDriver = new ChromeDriver();

        System.out.println("Start test");

        String url = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
        webDriver.get(url);
        Actions actions = new Actions(webDriver);

        WebElement button = webDriver.findElement(By.cssSelector("body > div > section > div > div > div > p > span"));
        WebElement context = webDriver.findElement(By.cssSelector("body > ul"));
        List <WebElement> li = context.findElements(By.tagName("li"));

        System.out.println(button.getText());
        actions.contextClick(button).perform();
        Thread.sleep(2000);
       // actions.moveToElement(context.get.click().perform();
        Thread.sleep(2000);
        webDriver.quit();
        System.out.println("Test ended");


    }
}
