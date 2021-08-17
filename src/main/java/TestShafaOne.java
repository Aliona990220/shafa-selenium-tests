import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestShafaOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shafa.ua/");
        WebElement element1 = driver.findElements((By.xpath("//div[@class='b-section b-section_bg_brands']//h2"))).get(0);
        String text1 = (element1).getText();
        System.out.println(text1);
    }

}
