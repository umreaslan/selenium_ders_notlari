package day08_ecplicylyWait_cookies_webtables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_ExplicitlyWait {

    @Test
    public  void  test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //amazon anasayfaya gidin

        driver.get("https://www.amazon.com");
        //arama kutusu clicable oluncaya kadar bekleyin

        //emplicitlywait icin
        //wait objesi olustur

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
        //mumkunse wen element locate et

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //
        wait.until(ExpectedConditions.elementToBeClickable(aramaKutusu));


        //nutella icin arama yapin
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        Thread.sleep(5000);


    }
}
