package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");


        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getWindowHandle());
        //CDwindow-54DBBE219017BFB5B2B64E5349C87F55
        //getWindowhandele  selenium tarafindan her driver sayfasi icin uretilen
        //unique handle degerini dondurur
        //getwindowhandels test sirasinda 1 den fazla sayfa acilmissa
        //bir set olarak ,tum sayfalarin  handel degerlerini dondurur

        driver.quit();

        //close ve quit ikisi de sayfayi kapatmak icin kullanilir
        //close sadece 1 sayfa kapatirken
        // quit test sirasinda acilan tum sayfalari kapatir

        System.out.println(driver.getPageSource());

        String expectedicerik =" 2 hours weekly meeting with the team";
        String actualSayfaKodlari = driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedicerik)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");



        }

    }
}
