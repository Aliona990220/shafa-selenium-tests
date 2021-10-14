package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPasswordRecovery {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[@class='l9j0dhe7 buofh1pr j83agx80 bp9cbjyn']//a")).click();

        if (driver.getTitle().equals("Facebook - log in or sign up")) {
            System.out.println("We are back at Facebook's homepage");
        } else {
            System.out.println("We are NOT in Facebook's homepage");
        }
        driver.close();
    }
}
