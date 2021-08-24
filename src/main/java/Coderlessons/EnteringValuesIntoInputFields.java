package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringValuesIntoInputFields {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/login.html");
        WebElement email =  driver.findElements(By.xpath("//div[@class='container']//input")).get(0);
        Thread.sleep(3000);
        email.click();
        email.sendKeys("abcd@gmail.com");
//        email.clear();
        WebElement password =  driver.findElements(By.xpath("//div[@class='container']//input")).get(1);
        password.click();
        password.sendKeys("123456abcdftry");
//        password.clear();
        WebElement login =  driver.findElement(By.xpath("//div[@class='form_content clearfix']//button"));
//        login.click();
        //Або команда:
        login.submit();

        driver.close();


    }
}
