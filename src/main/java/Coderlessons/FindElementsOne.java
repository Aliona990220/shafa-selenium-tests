package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> element = driver.findElements((By.xpath("//div[@class='container']//label")));
        System.out.println("Number of elements:" +element.size());

        for (int i=0; i < element.size();i++) {
            System.out.println("Radio button text:" + element.get(i).getText());
        }

    }
}
