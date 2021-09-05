package shafaSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;

public class SafaTestLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shafa.ua/uk/");
        WebElement login =  driver.findElements(By.xpath("//div[@class='_1C8R7Ed8PZh8800Q5y1A']//a")).get(2);
        Thread.sleep(5000);
        login.click();
        Thread.sleep(3000);
        WebElement email =  driver.findElements(By.xpath("//div[@class='_2ze0hXfd8Fj8W5fmqJC6']//input")).get(0);
        email.click();
        email.clear();
        email.sendKeys("AlionaHavelia");

        WebElement password =  driver.findElements(By.xpath("//div[@class='_2ze0hXfd8Fj8W5fmqJC6']//input")).get(1);
        password.click();
        email.clear();
        password.sendKeys("wbDcq");
        WebElement exits =  driver.findElement(By.xpath("//div[@class='_2ze0hXfd8Fj8W5fmqJC6']//button"));
        exits.submit();
        Thread.sleep(20000);
        WebElement settings = driver.findElement(By.xpath("//div[@class='_1onCmMty-awZVo2WdHGN']//img"));
        settings.click();
        WebElement sett = driver.findElement(By.xpath("//div[@class='b-form-row']//textarea"));
        sett.click();
        sett.sendKeys("Привіт , мене звати Альона.");




        driver.close();



    }
}


