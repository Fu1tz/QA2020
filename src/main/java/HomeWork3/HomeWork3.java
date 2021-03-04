package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"C:\\webdrivers\\chromedriver.exe" );

        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to ("https://www.google.com.ua");

        WebElement string = webDriver.findElement(By.name("q"));


        string.sendKeys("погода в павлограде на декабрь 2015 года");
        string.submit();

        try {
            WebElement element = webDriver.findElement(By.cssSelector(".LHJvCe"));
            WebElement element1 = webDriver.findElement(By.cssSelector("#result-stats > nobr:nth-child(1)"));

            String source = element.getText();
            String delete = element1.getText();
            source = source.replace(delete, "");
            System.out.println(source);
            if (source.equals("Результатов: примерно 16 500 ")) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        }catch (NoSuchElementException e){
            System.out.println("Error");
        }


        Thread.sleep(2000);

        webDriver.quit();



    }
}

