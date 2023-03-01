package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize(); // gittigimiz sayfayi tam ekran yapar

        //amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");

       // sayfadaki tiitle ve url i yazdirin

        System.out.println("URL :" + driver.getCurrentUrl());
        System.out.println("BASLIK :" + driver.getTitle());
       // amazon ana sayfaya gittiginizi test edin

        // test expected result ile actual result 'in karsilastirilmasidir
        // ornegin  url amazon iceriyorsa diyebiliriz
        String expectedIcerik ="amazon";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

    }
}
