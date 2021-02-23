package Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSelect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriverss\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\Student\\IdeaProjects\\QA2020\\src\\main\\resources\\select.html");


        //WebElement selectElement = webDriver.findElement(By.cssSelector("body > form > select > option:nth-child(4)"));
        WebElement selectElement = webDriver.findElement(By.cssSelector("body > form > select:nth-child(3)"));

        //System.out.println(selectElement.getText());

        Select select = new Select(selectElement);

        List<WebElement> options = select.getOptions();


        String [] countries = {"Denmark" ,"Norway", "Sweden", "Finland"};
        if(options.size() == countries.length) {

        for (int i = 0; i < options.size();i++) {
            WebElement webElement = options.get(i);
            //System.out.println(webElement.getText());
            if(options.get(i).getText().equals(countries[i])){
                System.out.println("Exp: " + options.get(i).getText() + " actual " + countries[i]);
            }
        }
        }else {
                System.out.println("Exp " + options.size() + " actual " + countries.length);
            }


        System.out.println("=========Selected elements=========");

        select.selectByIndex(0);


        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        for (WebElement selectionEl : allSelectedOptions) {
            System.out.println(selectionEl.getText());
        }


        webDriver.quit();

        System.out.println("Ok");


    }
}
