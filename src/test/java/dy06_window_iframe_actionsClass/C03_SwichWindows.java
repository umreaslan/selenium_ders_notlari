package dy06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_SwichWindows extends TestBase {


    @Test
    public  void  test01(){

        //amazon ana sayfaya gidip arama kutusunun erisilebilir oldugunu test edin

        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
        String amazonWindowHandelDegeri=driver.getWindowHandle();

        bekle(2);
        //yeni bir tab olarak wisequarter.com a gidin
        //url nin wisequarter icerdigini test edin
        //once yeni bir tab olusturup driver i o sayfaya gecirmeliyiz

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.wisequarter.com");

        String expectedIcerik="wisequarter";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        String wiseWindowHandelDegeri=driver.getWindowHandle();

        //amazonun acik oldugu tab a geri donup
        driver.switchTo().window(amazonWindowHandelDegeri);

        /*

        daha once acilmis olan bir windova gecis yapmak icin
        o sayfanin windowhandel degerine ihtiyacimiz var

        Testimiz boyle bir gorevi iceriyorsa o sayfada iken
         window handel degerini alip kayit yapmaliyiz
         */
        //nutella icin arama yapin
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //sonuclarin nutella icerdigini test edin
        String aramaSonucyazisi=driver
                .findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"))
                        .getText();

        String expectedicerik="Nutella";
        Assert.assertTrue(aramaSonucyazisi.contains(expectedicerik));

        //yeni bir window olarak youtuba.com a gidin

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");

        //url nin youtube icerdigini test edin
        expectedicerik="youtube";
        actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedicerik));
        bekle(2);
        //wisequarterin acik oldugu sayfaya donun

        driver.switchTo().window(wiseWindowHandelDegeri);
        //title nin wisequarter in icerdigini test edin
          expectedicerik="WiseQuarter";
       String actualTitle=driver.getTitle();
       Assert.assertTrue(actualTitle.contains(expectedicerik));

        bekle(3);


    }
}
