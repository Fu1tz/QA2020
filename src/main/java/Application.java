import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriverss\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("https://itstep.dp.ua/ru/contacts");

        WebElement element = webDriver.findElement(By.cssSelector("#form_construct_main > div > div:nth-child(1) > input"));
        String placeholder = element.getAttribute("placeholder");
        System.out.println(placeholder);
        WebElement element1 = webDriver.findElement(By.cssSelector("#form_construct_main > div > div:nth-child(2) > input"));
        String placeholder1 = element.getAttribute("placeholder");
        System.out.println(placeholder);
        WebElement element2 = webDriver.findElement(By.cssSelector("#form_construct_main > div > div:nth-child(3) > input"));
        String placeholder2 = element.getAttribute("placeholder");
        System.out.println(placeholder);


    }
}
