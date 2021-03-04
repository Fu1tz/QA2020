package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class HomeWork4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,"C:\\webdrivers\\chromedriver.exe" );

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("file:///C:/Users/Кирилл/Desktop/ШАГ/Lesson4%20hw/select_hw.html");

        WebElement SelectElement = webDriver.findElement(By.cssSelector("#auto"));

        Select select = new Select(SelectElement);

        List<WebElement> options = select.getOptions();


        select.selectByIndex(1);

        WebElement volvo = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(volvo.getText());
        String str = "value:volvo";
        if (volvo.getText().equals(str)){
            System.out.println("Строка есть");
        }else{
            System.out.println("Строки нет");
        }

        select.selectByValue("saab");

        WebElement saab = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(saab.getText());
        String str1 = "value:saab";
        if (saab.getText().equals(str1)){
            System.out.println("Строка есть");
        }else{
            System.out.println("Строки нет");
        }

        select.selectByVisibleText("Mercedes");

        WebElement mercedes = webDriver.findElement(By.cssSelector("#out1"));
        System.out.println(mercedes.getText());
        String str2 = "value:mersedes"; //как указано в задании, если написать правильно,строка будет
        if (saab.getText().equals(str2)){
            System.out.println("Строка есть");
        }else{
            System.out.println("Строки нет");
        }



        Thread.sleep(2000);

        webDriver.quit();




    }
}
