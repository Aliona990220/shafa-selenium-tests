package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFiles {
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("C:\\newhtml.html");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();
    }
}
