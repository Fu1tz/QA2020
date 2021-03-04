package HomeWork2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"C:\\webdrivers\\chromedriver.exe" );

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://itstep.dp.ua/ru/about_academy");
        System.out.println("Loaded "+ webDriver.getCurrentUrl());
        System.out.println("Title " + webDriver.getTitle());

        webDriver.navigate().to("https://itstep.dp.ua/ru/java_course");
        System.out.println("Loaded "+ webDriver.getCurrentUrl());
        System.out.println("Title " + webDriver.getTitle());

        webDriver.navigate().to("https://itstep.dp.ua/ru/qa_course");
        System.out.println("Loaded "+ webDriver.getCurrentUrl());
        System.out.println("Title - " + webDriver.getTitle());

        Thread.sleep(5000);
        webDriver.quit();

    }
}
