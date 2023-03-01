package day07_actionsClass_filetestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08_FileUploadtesti extends TestBase {

    @Test
    public  void test01(){
      //  1.https://the-internet.herokuapp.com/upload adresine gidelim

        driver.get("https://the-internet.herokuapp.com/upload");
      //  2.chooseFile butonuna basalim
      //  3.Yuklemek istediginiz dosyayi secelim.
        //Downloasa a indirdigimiz logo.png dosyasini yukleyelim

        /*

        chooseFile butonuna basarsak bilgisayarimizdan
        bir dosya secme islemi yapmamiz gerekir
        ancak selenium veya java bilgisayarimizdan dosya secme islemi yapamaz
        bunun yerine selenium bize bir yontem gelistirmistir
        coosefile ile secmemiz gereken dosyanin dosya yolunu olusturup
        olusturulan dosya yolunu sendkeys ile coosefile butonuna gondermemeiz gerekir
         */

        String dinamikdosyaYolu=System.getProperty("user.home")+"/Downloads/logo.png";
        WebElement chooseFile=driver.findElement(By.id("file-upload"));

        chooseFile.sendKeys(dinamikdosyaYolu);

      //  4.Upload butonuna basalim.

        driver.findElement(By.id("file-submit")).click();

      //  5.“File Uploaded!” textinin goruntulendigini test edelim.

        WebElement fileUploadYazielementi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadYazielementi.isDisplayed());

        bekle(5);

    }
}
