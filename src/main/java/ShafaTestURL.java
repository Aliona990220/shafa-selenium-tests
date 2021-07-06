import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShafaTestURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shafa.ua/women/nizhnee-bele-i-kupalniki/trusiki/52655023-komplekt-besshovnyh-trusikov");
        WebElement element = driver.findElement(By.xpath("//div[@class='js-buy-button']//button"));
        element.click();
        String strUrl = driver.getCurrentUrl();
        System.out.println(strUrl);

        Assert.assertEquals(strUrl,"https://shafa.ua/login?next=/checkout/52655023s");
        List<WebElement> elements = driver.findElements(By.xpath("//div"));
        for (WebElement el: elements) {
            System.out.println(el);
        }
        System.out.println(elements.size() > 10 );
        driver.close();


        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver.get("https://shafa.ua/");
        WebElement element2 = driver2.findElement((By.xpath("//div[@class='b-section__container']/ul")));
        System.out.println(element2);
        driver.close();

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        driver.get("https://shafa.ua/");
        System.out.println();
        driver.close();

        Assert.assertEquals(strUrl,"https://shafa.ua/login?next=/checkout/52655023");
        List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='b-section__container']"));
        for (WebElement el1: elements2) {
            System.out.println(el1);
        }
        System.out.println(elements2.size() > 10 );
        driver.close();

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver4 = new ChromeDriver();
        driver.get("https://shafa.ua/");
        WebElement element4 = driver4.findElement((By.xpath("//div[@class='js-suggestion-item-block']")));
        System.out.println(element4);
        driver.close();

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver5 = new ChromeDriver();
        driver.get("https://shafa.ua/");
        WebElement element5 = driver5.findElement((By.xpath("//a[text()='Рекомендуем вам']")));
        System.out.println(element5);
        driver.close();

        Assert.assertEquals(strUrl,"https://shafa.ua/login?next=/checkout/52655023");
        List<WebElement> elements6 = driver.findElements(By.xpath("//div[@class='_1OWA_j74GKb-L50vQxC3']"));
        for (WebElement el2: elements6) {
            System.out.println(el2);
        }
        System.out.println(elements6.size() > 10 );
        driver.close();



    }

}
