package Lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowExample {
    @Override
    public String toString() {
        return "WindowExample{}";
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriverss\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("C:\\Users\\Student\\IdeaProjects\\QA2020\\src\\main\\resources\\windows.html");

        WebElement a = webDriver.findElement(By.cssSelector("a"));
        //Set<String> windowHandles = webDriver.getWindowHandles();

        String main = webDriver.getWindowHandle();
        System.out.println("Before open window");
        showWindowsEach(webDriver.getWindowHandles());
        System.out.println("--------------------------");
        a.click();
        Thread.sleep(2000);

        showWindowsEach(webDriver.getWindowHandles());
        System.out.println("After open window");



        String secondPageHandle = " ";
        for (String windowHandle : webDriver.getWindowHandles()) {
            secondPageHandle = windowHandle;
            if(windowHandle.equals(main)){
          break;
            }
        }

        System.out.println("Second page = " + secondPageHandle);
        WebDriver window = webDriver.switchTo().window(secondPageHandle);

        //webDriver.switchTo().window();
       // webDriver.switchTo().window(s);

        System.out.println("Title = " + webDriver.getTitle());

        webDriver.quit();
        System.out.println("End test");

    }



    public static void showWindowsEach(Set<String> windowHandles) {
        System.out.println("window size = " + windowHandles.size());
       for (String windowHandle: windowHandles) {
           System.out.println("handler = " + windowHandle);

        }

    }

}
