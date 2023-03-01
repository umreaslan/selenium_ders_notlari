package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // amazon anasayfaya git

        driver.get("https://www.amazon.com");

        //arama kutusunu locate edip bir web element olarak kaydedin
        //id si twotabsearchtextbox olan webelement seklinde locate edecegiz


       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));// bu islem loceyt denir
        /*
         driver 'e web elementi tarif etme islemine Locate,

         //  tarifi yapabilmek icin kullnabilecegim  degiskenlere de LOCATOR denir
        locator 'larin 8 tane locator  vardir
        Locater lerin  6 tanesi  webelementin ozelliklerine baglidir
        //-id
        //- classname
        //-tagname
        //-linktext
        //-partialLinktext

       Geriye kalan 2 locater ise her turlu webelementi locate etmek icin kullanilabilir

       -xpath'

       -cssSelector
*/
     aramaKutusu.sendKeys("Nutella");
     aramaKutusu.submit();
     Thread.sleep(3000);


    }
}
