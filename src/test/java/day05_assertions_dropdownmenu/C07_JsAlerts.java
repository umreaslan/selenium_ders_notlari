package day05_assertions_dropdownmenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseClass;

public class C07_JsAlerts extends TestBaseClass {


    @Test
    public  void  test01(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts  ");

        driver.findElement(By.xpath("//*[text()=‘Click for JS Alert’]")).click();


        String expectedAlertYazisi="I am a JS Alert";
        String actualAlertYazisi=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);
        driver.switchTo().alert().accept();

    }
    @Test
    public void test02(){

        driver.findElement(By.xpath("/*[text()=‘Click for JS Confirm’]")).click();
        driver.switchTo().alert().dismiss();
        String expectedSonucYazisi="You  clicked :Cancel;";
        String actualSonucYazisi=driver.findElement(By.xpath("//*[id='result'"))
                .getText();

        Assert.assertEquals(expectedSonucYazisi,actualSonucYazisi);

    }
    @Test
    public  void test03(){

        driver.findElement(By.xpath("//*[text()=‘Click for JS Prompt’]")).click();
        driver.switchTo().alert().sendKeys("Abdullah");
        driver.switchTo().alert().accept();
        String actualSonucYazisi=driver.findElement(By.xpath("//*[id='result'"))
                .getText();
        String expectedIcerik="Abdullah";

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }

    // Gerekli ayarlamalari yapip
// https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
// 3 test method'u olusturup her method'da bir JsAlert'e basin
// Ilgili method'lari kullanin
// https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
// 1.alert'e tiklayalim
// Alert'deki yazinin "I am a JS Alert" oldugunu test edelim
// OK tusuna basip alert'i kapatalim
// https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
// 2.alert'e tiklayalim
// cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
// https://the-internet.herokuapp.com/javascript_alerts  adresine gidin
// 3.alert'e tiklayalim
// Cikan prompt ekranina "Abdullah" yazdiralim ve OK tusuna basarak alert'i kapatalim
// Cikan sonuc yazisinin Abdullah icerdigini test edelim






}
