package HomeWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

        System.out.println("Start test");
        String firstTitle = webDriver.getTitle();
        System.out.println("Title начальной страницы=" + firstTitle);

        WebElement iframe = null;

        iframe = webDriver.findElement(By.cssSelector("#iframeResult"));

        WebDriver frame = webDriver.switchTo().frame(iframe);

        WebDriver frame1 = webDriver.switchTo().frame(0);

        String code = frame1.getPageSource();

        int index = code.indexOf("W3Schools Online Web Tutorials");

        System.out.println("index = " + index);

        String sub = code.substring(index, index + 30);
        System.out.println("Искомый TITLE= " + sub);

        boolean isContain = code.contains("W3Schools Online Web Tutorials");
        System.out.println(isContain);

        webDriver.quit();
        System.out.println("End test");

        Thread.sleep(3000);

        webDriver.quit();


    }
}
