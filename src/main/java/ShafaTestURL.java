import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ShafaTestURL {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shafa.ua/");
//        WebElement element = driver.findElement((By.xpath("//div[@class='b-section__container']/h2")));
//        String text =element.getText();
//        System.out.println(text);
//

//        List <WebElement> element6 = driver.findElements((By.xpath("//div[@class='_1Oikv8416VOZKJriT08h']//a")));
//         Integer size = element6.size();
//            System.out.println(size);
//
//        WebElement element3 = driver.findElement((By.xpath("//div[@class='b-block__promo']")));
//        String text3 =element3.getText();
//        System.out.println(text3);
//
//        WebElement element4 = driver.findElements((By.xpath("//div[@class='DfLiXtdKirLRjXqzIZ7j _9FyXaaDBJB6Q-Kz8GIsD']"))).get(0);
//        String text4 =element4.getText();
//        System.out.println(text4);
//
//        WebElement element5 = driver.findElements((By.xpath("//div[@class='_3FwHm0lcQOk3fn7nVlWL']//a"))).get(1);
//        String text5 =element5.getText();
//        System.out.println(text5);
//
//        WebElement element7 = driver.findElements((By.xpath("//div[@class='b-block']/a"))).get(0);
//        String text7 =element7.getText();
//        System.out.println(text7);
//
//        List <WebElement> element8 = driver.findElements((By.xpath("//div[@class='b-section__container']/ul")));
//        Integer size8 = element8.size();
//        System.out.println(size8);


//        String currentPage=driver.getCurrentUrl();
//        WebElement element9 = driver.findElements((By.xpath("//div[@class='_3FwHm0lcQOk3fn7nVlWL']//a"))).get(1);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element9).clickAndHold().release().build().perform();
//        String newPage = driver.getCurrentUrl();
//        if(currentPage.equals(newPage))
//        {
//            System.out.println("On Same Page");
//
//        }
//        else
//        {
//            System.out.println("Ok");
//        }
//
//        String currentPage10 = driver.getCurrentUrl();
//        WebElement element10 = driver.findElements((By.xpath("//div[@class='_1C8R7Ed8PZh8800Q5y1A']//a"))).get(0);
//        Thread.sleep(2000);
//        Actions actions10 = new Actions(driver);
//        actions10.moveToElement(element10).click().perform();
//        Thread.sleep(5000);
//        String newPage10 = driver.getCurrentUrl();
//        if (currentPage10.equals(newPage10)) {
//            System.out.println("On Same Page");
//
//        } else {
//            System.out.println("Ok");
//        }



//        String currentPage=driver.getCurrentUrl();
//        WebElement element11 = driver.findElements((By.xpath("//div[@class='DfLiXtdKirLRjXqzIZ7j _9FyXaaDBJB6Q-Kz8GIsD']"))).get(0);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element11).clickAndHold().release().build().perform();
//        String newPage = driver.getCurrentUrl();
//        if(currentPage.equals(newPage))
//        {
//            System.out.println("On Same Page");
//
//        }
//        else
//        {
//            System.out.println("Ok");
//        }

//        String currentPage13 = driver.getCurrentUrl();
//        WebElement element13 = driver.findElement((By.xpath("//div[@class='b-index-header__info']//button")));
//        Actions actions13 = new Actions(driver);
//        actions13.moveToElement(element13).clickAndHold().release().build().perform();
//        String newPage13 = driver.getCurrentUrl();
//        if(currentPage13.equals(newPage13))
//        {
//            System.out.println("On Same Page");
//
//        }
//        else
//        {
//            System.out.println("Ok");
//        }

//        WebElement element12 = driver.findElement((By.xpath("//div[@class='b-index-header__info']//span")));
//        String text12 =element12.getText();
//        System.out.println(text12);

        WebElement element15 = driver.findElement((By.xpath("//div[@class='b-more-products']//h2")));
//        String text15 = element15.getText();
        System.out.println(element15);

//        WebElement element16 = driver.findElement((By.xpath("//div[@class='b-product__seller']")));
//        String text16 = element16.getText();
//        System.out.println(text16);

//        WebElement element15 = driver.findElements((By.xpath("//div[@class='b-product__seller']"))).get(0);
//        String text15 =element15.getText();
//        System.out.println(text15);

    }


}
