package Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver" ,"C:\\webdrivers\\chromedriver.exe" );

       WebDriver webDriver = new ChromeDriver();

        String url = "https://prom.ua/";
        webDriver.get(url);
        Thread.sleep(1000);
        System.out.println();
        if(url.equals(webDriver.getCurrentUrl())){
            System.out.println("Pass");
        }else {
            System.out.println("Error");
        }
        System.out.println(webDriver.getTitle());


        String pageSource = webDriver.getPageSource();


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("index.html"));
        bufferedWriter.write(pageSource);
        bufferedWriter.close();

    }
}
