package Coderlessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfDesiredFeatures {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver wd;
        WebDriver driver = wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("http://gmail.com");
        driver.quit();
    }
}
