import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShafaTestURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shafa.ua/");
        WebElement element = driver.findElement((By.xpath("//div[@class='b-section__container']/h2")));
        String text =element.getText();
        System.out.println(text);

        WebElement element1 = driver.findElements((By.xpath("//div[@class='b-section b-section_bg_brands']//h2"))).get(0);
        String text1 =element1.getText();
        System.out.println(text1);

        List <WebElement> element6 = driver.findElements((By.xpath("//div[@class='_1Oikv8416VOZKJriT08h']//a")));
         Integer size = element6.size();
            System.out.println(size);

        WebElement element3 = driver.findElement((By.xpath("//div[@class='b-block__promo']")));
        String text3 =element3.getText();
        System.out.println(text3);

        WebElement element4 = driver.findElements((By.xpath("//div[@class='DfLiXtdKirLRjXqzIZ7j _9FyXaaDBJB6Q-Kz8GIsD']"))).get(0);
        String text4 =element4.getText();
        System.out.println(text4);

        WebElement element5 = driver.findElements((By.xpath("//div[@class='_3FwHm0lcQOk3fn7nVlWL']//a"))).get(1);
        String text5 =element5.getText();
        System.out.println(text5);

        WebElement element7 = driver.findElements((By.xpath("//div[@class='b-block']/a"))).get(0);
        String text7 =element7.getText();
        System.out.println(text7);

        List <WebElement> element8 = driver.findElements((By.xpath("//div[@class='b-section__container']/ul")));
        Integer size8 = element8.size();
        System.out.println(size8);





    }

}
