import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSafaThree {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://shafa.ua/");
            WebElement element3 = driver.findElement((By.xpath("//div[@class='b-block__promo']")));
        String text3 = (element3).getText();
        System.out.println(text3);

    }
}

