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

public class C03_ExplicitlyWait {

    @Test
    public  void test01(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

      //  2. Bir metod olusturun : isEnabled()
      //  3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


      //  4. Textbox’in etkin olmadigini(enabled) dogrulayın

        WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(textbox.isEnabled());

      //  5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        driver.findElement(By.xpath("//button[text()='Enable']")).click();

        //explicity wait kullanacaksak
        //A-wait objesi olustur

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
        //B-mumkunse kullanilacak web elementi locate et
        //C-wait objesi kullanarak  bekleyin

        wait.until(ExpectedConditions.elementToBeClickable(textbox));
        Assert.assertTrue(textbox.isEnabled());

     //   6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.

        WebElement itsEnabledElementi=driver.findElement(By.xpath("//p[@id='message']"));
        Assert.assertTrue(itsEnabledElementi.isDisplayed());

      //  7. Textbox’in etkin oldugunu(enabled) dogrulayın.
        Assert.assertTrue(textbox.isEnabled());

        driver.close();


    }
}
