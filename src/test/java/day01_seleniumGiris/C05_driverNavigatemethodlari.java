package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_driverNavigatemethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();// tam ekran yapalim
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //wisequarter anasayfaya gidin
        driver.get("https://www.wisequarter.com");

        //yeniden amazon anasayfaya gidin
        driver.navigate().back();

        // yeniden wisequarter anasayfaya donun
        driver.navigate().forward();

        // navigate ().to(), driver.get() ile ayni islevi yapar
        driver.navigate().to("https://www.youtube.com");

        driver.navigate().refresh(); //sayfayi yeniler
    }
}
