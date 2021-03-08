package HomeWork11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"C:\\webdrivers\\chromedriver.exe" );

        WebDriver webDriver = new ChromeDriver();
        String url = "http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html";
        webDriver.get(url);
        System.out.println("Start test");

        try {
            WebElement botton = webDriver.findElement(By.cssSelector("#save"));
            botton.click();
            webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

            String ignoreImageURl = "http://seleniumeasy.com/test/img/loader-image.gif";
            if( webDriver.findElement(By.id("loading")).isDisplayed()){
                WebElement element = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/img"));
                Thread.sleep(2000);
                System.out.println("Element is Visible");
                System.out.println(webDriver.findElement(By.cssSelector("#loading > img:nth-child(1)")).getAttribute("src"));
                WebElement webElement = webDriver.findElement(By.cssSelector("#loading"));
                System.out.println(webElement.getText());
            }else{
                System.out.println("Element is InVisible");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        webDriver.quit();
        System.out.println("End test");

    }
}
