package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Locators {

    public static void main(String[] args) throws InterruptedException {

        //https://www.amazon.com/ sayfasina gidin
        //rama tusunda city cake yazip arayin

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        //Arama tusuna city bike yazip aratin

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("city bake" +Keys.ENTER);

        //goruntulenen sonuclarin sayisini yazdirin

        WebElement sonucYazielementi=driver.findElement(By.className("rush-component"));
        System.out.println(sonucYazielementi.getText());

        //listeden ilk urunun resmini tiklayin

        driver.findElement(By.className("s-image")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
