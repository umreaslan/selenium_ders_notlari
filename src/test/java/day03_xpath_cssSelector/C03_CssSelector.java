package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {


        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        String expectedIcerik="Spend lees";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("title tasti passed");
        }else {
            System.out.println("title testi failed");
        }

        driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_gc']")).click();

        driver.findElement(By.cssSelector("//a[@aria-label='Birthday']")).click();

        driver.findElement(By.xpath("span[@class=‘a-truncate-cut’])[1]")).click();

        WebElement ucretElementi=driver.findElement(By.cssSelector("#gc-live-preview-amount"));
        String expectedUcret="25$";
        String actualUcret=ucretElementi.getText();

        if (expectedUcret.equals(actualUcret)){
            System.out.println("ucret testi passed");
        }else {
            System.out.println("ucret testi failed" +  "\nActual ucret:" +actualUcret);

        }






        driver.close();
    }
}
