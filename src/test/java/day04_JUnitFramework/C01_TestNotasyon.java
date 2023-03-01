package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyon {

    /*

    Fremwork  : ortak calisma cercevesi hangi dosyalari nerede olusturacagimizi belirler
    ve boylece toplu calistirmayi kolaylastirir.
    Her fremwork ,dosya duzeni olusturmanin  yaninda islerimizi kolaylastiran yeni ozellikler sunmustur


    JUnit fremwork en temel test  fremwork'udur.
    bize kazandirdigi en onmeli ozellik test Annotation(Notasyon)'dir.

    @test notasyonu sayesinde herbir method bagimsiz olarak calistirilabilen  test methodu olur

    @test notasyonu sayesinde istersek herbir test methodunu bagimsiz  calistirabildigimiz gibii
    istenirse class levildAN  Calistirip
    tum testlerin calismasini saglayabiliriz
    JunitFremwork te test methodlarinin hangi sira ile calisacagini
    ONGOREMEYIZ VE KONTROL EDEMEYIZ

    TEST METHODLARI BAGIMSIZDIR.


     */
    @Test
    public  void  test01(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.wisequarter.com");
        driver.close();

    }
    @Test
    public  void  test02(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.youtube.com");
        driver.close();

}

}
