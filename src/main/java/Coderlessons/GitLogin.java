package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class GitLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        WebElement email =  driver.findElements(By.xpath("//div[@class='d-flex flex-column flex-sm-row flex-items-center']//input")).get(6);
        email.click();
        email.sendKeys("scantrgmail.com");

        WebElement enter =  driver.findElement(By.xpath("//div[@class='font-mktg']//a"));
        enter.click();
        WebElement exit =  driver.findElements(By.xpath("//div[@class='auth-form-body mt-3']//input")).get(13);
        exit.click();

        driver.close();
    }
}


