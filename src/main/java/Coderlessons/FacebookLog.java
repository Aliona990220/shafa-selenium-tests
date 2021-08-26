package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLog {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://m.facebook.com/login/?locale2=ru_RU");
        Thread.sleep(3000);
        WebElement email =  driver.findElements(By.xpath("//div[@class='_5rut']//input")).get(6);
        email.click();
        email.sendKeys("+***********");

        WebElement password =  driver.findElements(By.xpath("//div[@class='_5rut']//input")).get(7);
        password.click();
        password.sendKeys("********");
        WebElement exit =  driver.findElement(By.xpath("//div[@class='_2pie']//button"));
        exit.click();

//        driver.close();
    }
}
