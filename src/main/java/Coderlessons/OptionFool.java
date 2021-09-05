package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptionFool {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio1.click();
        System.out.println("Выбран вариант 1 радиокнопки");

        radio2.click();
        System.out.println("Выбран вариант 2 радиокнопки");

        WebElement option1 = driver.findElement(By.id("vfb-6-0"));

        option1.click();

        if (option1.isSelected()) {
            System.out.println("Флажок установлен");

        } else {
            System.out.println("Флажок отключен");
        }

        driver.get("http://demo.guru99.com/test/facebook.html");
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
        for (int i=0; i<2; i++) {
            chkFBPersist.click ();
            System.out.println("Facebook сохраняет статус флажка -  "+ (chkFBPersist).isSelected());
        }
        driver.close();
    }
}
