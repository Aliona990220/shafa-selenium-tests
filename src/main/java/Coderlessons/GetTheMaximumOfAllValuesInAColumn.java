package Coderlessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public class GetTheMaximumOfAllValuesInAColumn {
    public static void main(String[] args) throws ParseException {
        WebDriver wd;
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");
        String max;
        double m=0,r=0;

        WebElement col = (WebElement) wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total No of columns are : " + ((List<?>) col).size());
        WebElement  rows = (WebElement) wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total No of rows are : " + ((List<?>) rows).size());
        for (int i = 1; i< ((List<?>) rows).size(); i++)
        {
            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
            NumberFormat f =NumberFormat.getNumberInstance();
            Number num = f.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);
            if(m>r)
            {
                r=m;
            }
        }
        System.out.println("Maximum current price is : "+ r);
    }
}
