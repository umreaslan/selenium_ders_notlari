package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_AutomationExercise {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test classi  olusturun ilgili ayarlari yapin

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2-https://www.automationExercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");
        //3-Sayfada 147 tane link bulundugunu test edin

        List<WebElement> LinkElementleriList=driver.findElements(By.tagName("a"));

        int expectedLinksayisi=147;
        int actualLinkSayisi=LinkElementleriList.size();

        if (expectedLinksayisi==actualLinkSayisi){
            System.out.println("link sayisi testi passed");

        }else {
            System.out.println("list sayisi testi failed" +
                    "\nsayfada varolan link sayisi " + actualLinkSayisi);

            //products linkine tiklayin

            driver.findElement(By.partialLinkText("products")).click();
            //5-special affer yazisinin gorundugunu test edin
            WebElement specialOfferElementi=driver.findElement(By.id("sale_image"));
            if (specialOfferElementi.isDisplayed()){
                System.out.println("specialOffer testi passed");
            }else {
                System.out.println("SpecialOffer testi failed");
            }

            Thread.sleep(3000);
            driver.close();
        }
    }
}
