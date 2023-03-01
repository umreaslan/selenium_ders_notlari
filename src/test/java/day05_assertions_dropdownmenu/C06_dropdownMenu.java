package day05_assertions_dropdownmenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class C06_dropdownMenu  extends TestBase {

    @Test
    public  void  test01(){


        driver.get(" https://the-internet.herokuapp.com/dropdown");
/*
 https://the-internet.herokuapp.com/dropdown adresine gidin.
 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
 4.Tüm dropdown değerleri(value) yazdırın
 5. Dropdown’un boyutunun 4 oldugunu test edin,                                      degilse False yazdırın.


 */
       WebElement ddm= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        bekle(3);

        select.selectByVisibleText("Option 1");
        select.getFirstSelectedOption().getText();

        List<WebElement> optionElementListesi=select.getOptions();
        System.out.println("===================");
        for (WebElement eachelement:optionElementListesi
             ) {
            System.out.println(eachelement.getText());

        }
        int expectedBoyut=4;
        int actualboyut=optionElementListesi.size();
        Assert.assertEquals(expectedBoyut,actualboyut);



        bekle(3);




    }
}
