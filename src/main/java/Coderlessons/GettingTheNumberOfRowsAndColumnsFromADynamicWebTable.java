package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GettingTheNumberOfRowsAndColumnsFromADynamicWebTable {
    public static void main(String[] args) {
        WebDriver wd;
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");
        WebElement col = (WebElement) wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " + ((List<?>) col).size());
        WebElement rows = (WebElement) wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + ((List<?>) rows).size());
        wd.close();
    }
}
