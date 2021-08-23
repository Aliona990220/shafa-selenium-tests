package Coderlessons;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatchExceptions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        WebElement txtboxusername = driver.findElement(( By.xpath("//div[@class='collapse navbar-collapse']")));
        try{
            if(( txtboxusername).isEnabled()){
                txtboxusername.sendKeys("tutorial");
            }
        }

        catch(NoSuchElementException nsee){
            System.out.println(nsee.toString());
    }
}
}
