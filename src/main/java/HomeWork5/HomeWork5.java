package HomeWork5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("file:///C:/Users/%D0%9A%D0%B8%D1%80%D0%B8%D0%BB%D0%BB/Desktop/%D0%A8%D0%90%D0%93/Lesson5%20hw/windows.html");


        WebElement button = webDriver.findElement(By.cssSelector("#confirm > button"));
        button.click();

        Alert confirm = webDriver.switchTo().alert();
        confirm.accept();
        System.out.println("Confirm accept");


        WebElement button1 = webDriver.findElement(By.cssSelector("#prompt > button"));
        button1.click();

        Alert prompt = webDriver.switchTo().alert();
        prompt.sendKeys("45");
        prompt.accept();
        WebElement span = webDriver.findElement(By.cssSelector("#prompt > span"));
        String spanText = span.getText();
        System.out.println("Prompt = " + spanText);

        WebElement iframe = webDriver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));
        WebDriver frame = webDriver.switchTo().frame(iframe);
        WebElement text = frame.findElement(By.cssSelector("h1"));
        String h1 = text.getText();
        System.out.println("text: " + h1);


        Thread.sleep(3000);

        webDriver.quit();


    }
}
