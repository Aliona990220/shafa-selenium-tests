import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForTestSafa {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shafa.ua/");
        WebElement element4 = driver.findElements((By.xpath("//div[@class='DfLiXtdKirLRjXqzIZ7j _9FyXaaDBJB6Q-Kz8GIsD']"))).get(0);
        String text4 = (element4).getText();
        System.out.println(text4);

    }
}
