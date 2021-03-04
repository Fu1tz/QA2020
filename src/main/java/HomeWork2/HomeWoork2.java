package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWoork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"C:\\webdrivers\\chromedriver.exe" );

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("file:///C:/Users/%D0%9A%D0%B8%D1%80%D0%B8%D0%BB%D0%BB/Desktop/%D0%A8%D0%90%D0%93/Lesson2%20hw/automation-practice-table.html");
        List<WebElement> td = webDriver.findElements(By.tagName("td"));

        for(WebElement w : td) {
            System.out.println("td = " +w.getText());
        }

        WebElement link = webDriver.findElement(By.linkText("details"));
        link.click();

        String expectedUrl = webDriver.getCurrentUrl();
        if(expectedUrl.equals("https://ru.wikipedia.org/wiki/%D0%91%D1%83%D1%80%D0%B4%D0%B6-%D0%A5%D0%B0%D0%BB%D0%B8%D1%84%D0%B0")){
            System.out.println("Pass");
        }else {
            System.out.println("Error");
        }
        Thread.sleep(3000);
        webDriver.quit();
    }
}
