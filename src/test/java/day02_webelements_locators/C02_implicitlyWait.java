package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_implicitlyWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();// kucuk oldugunda bazi elementleri gostermeyebilir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // butun class larda bu 4 islemi muhakkak yapmamiz gerek

                /*

                driver i bir web uygulamasina gonderdigimizde o sayfanin acilmasi,
                orada istedigimiz islemleri yapmak icin elementleri bulmasi gibi...
                islemler zaman gerektirebilir.

                implicitlywait bu tur zaman isteyen islemler icin driver 'in max .ne kadar
                bekleyecegini  belirler
                 */
    }
}
