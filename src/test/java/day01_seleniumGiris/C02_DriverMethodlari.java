package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        /*

        jar dosyalarini yukleyerek  selenium 'u kullanilir hale getirdik
        ancak herbir class in hangi browser ile calismasini istiyorsak
        o browser ile ilgili driwer'i class da tanimlamamiz lazim

        browser ile ilgili  tercihimiz dogrultusunda  ilgili ayarlari yapmak icin
        java daki System classin 'dan SetProperty() kullanilir
        methoda 2 parametre ekleyecegiz
        1.parametre herkes icin aynidir :webdriver.choreme.driver
        2.parametre  bu driver' in dosya yolu
        herkesin bilgisyarinda farkli olabilir
        windows bilgisyarlarda sonunda .exe yazilmalidir
        mac 'lerde exe olmaz
         */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        // istenen sayfaya gitmek icin

        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);

         driver.close();

    }
}
