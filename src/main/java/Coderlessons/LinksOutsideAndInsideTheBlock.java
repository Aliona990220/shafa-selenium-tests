package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOutsideAndInsideTheBlock {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
