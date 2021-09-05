package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        WebElement email =  driver.findElements(By.xpath("//div[@class='d-flex flex-column flex-sm-row flex-items-center']//input")).get(0);
        email.click();
        email.sendKeys("aliona.havela@gmail.com");

        WebElement login = driver.findElements(By.xpath("//div[@class='d-lg-flex flex-items-center px-3 px-lg-0 text-center text-lg-left']//a")).get(5);
        Thread.sleep(3000);
        WebElement username =  driver.findElements(By.xpath("//div[@class='auth-form-body mt-3']//input")).get(1);
        username.click();
        username.clear();
        username.sendKeys("Aliona990220");

        WebElement password =  driver.findElements(By.xpath("//div[@class='auth-form-body mt-3']//input")).get(2);
        password.click();
        password.clear();
        password.sendKeys("a02112099");
        WebElement exit =  driver.findElements(By.xpath("//div[@class='auth-form-body mt-3']//input")).get(13);
        exit.click();

        driver.close();
    }
}


