package day08_ecplicylyWait_cookies_webtables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C01_ExplicitlyWait {

    @Test
    public  void  test01(){

        /*
       iMPLICITLY WAIT TEST YAPARKEN IHTIYACIMIZ OLAN BEKLEMELERIN COGUNUN HALLEDER
       nadiren de olsa bazi islemelr icin imlicitlywait icin tanimlanan sureden
       daha fazla zamanaihtiyac olabilir

       Explicitly bir meb element uzerinde gerceklesecek
       tek bir gorev icin tanimlanir

       bunun icin hem  web element tanimlanmali hem de gorev


         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        driver.get(" https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        //explicity wait kullanacaksak
        //A-bir wait objesi olustur

        WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(40));
        //B-eger kullanacagimiz webelement locate edilebilir ise locate edelim


       // WebElement itsGoneelementi=driver
               // .findElement(By.xpath("//*[text()=\"It’s gone!\"]"));

        //C-eger locate etmemiz icin zamana ihtiyac varsa ,o zaman locate ve gorev tanimlamayi
        //tek satirda yapiyoruz
        WebElement itsGoneelementi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        Assert.assertTrue(itsGoneelementi.isDisplayed());




        driver.close();


    }
}
