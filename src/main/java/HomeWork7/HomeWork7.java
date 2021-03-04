package HomeWork7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork7 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        System.out.println("Start test");

        webDriver.get("file:///C:/Users/Кирилл/Desktop/ШАГ/Lesson7%20hw/windows.html");


        WebElement btn = webDriver.findElement(By.cssSelector("#button1"));
        String firstpage = webDriver.getWindowHandle();
        System.out.println("First page : " + firstpage);

        btn.click();
        Thread.sleep(2000);

        String secondPage = " ";
        for (String windowHandle : webDriver.getWindowHandles()) {
            secondPage = windowHandle;
            if (!windowHandle.equals(firstpage)) {
                break;
            }
        }
        System.out.println("Second page = " + secondPage);
        WebDriver window = webDriver.switchTo().window(secondPage);
        if (window.getTitle().equals("Компьютерная Академия ШАГ Днепр – №1 на рынке IT-образования Украины")) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail : " + window.getTitle());
        }
        webDriver.switchTo().window(firstpage);
        WebElement btn1 = webDriver.findElement(By.cssSelector("#content > p:nth-child(5) > button"));

        btn1.click();
        Thread.sleep(2000);

        String thirdPage = " ";
        for (String windowHandle : webDriver.getWindowHandles()){
            System.out.println(windowHandle);
            WebDriver currentWindow = webDriver.switchTo().window(windowHandle);
            thirdPage = windowHandle;
            Thread.sleep(1000);
            currentWindow.close();
        }

        System.out.println("Third page = " + thirdPage);

        System.out.println("End test");

        Thread.sleep(1000);

        webDriver.quit();

    }
}
