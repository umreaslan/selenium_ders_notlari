package practıce;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class soru3 extends TestBase {


    @Test
    public  void test01(){
       // Navigate to website https://testpages.herokuapp.com/styled/index.html

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //    Under the ORIGINAL CONTENTS
        //    click on Alerts
        driver.findElement(By.xpath("//*[text()='Alerts']   ")).click();
        //    print the URL
        System.out.println(driver.getCurrentUrl());
        //    navigate back
        driver.navigate().back();
        //    print the URL
        System.out.println(driver.getCurrentUrl());
        //    Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        //    print the URL
        System.out.println(driver.getCurrentUrl());
        //    enter value 20 and ENTER
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("20" + Keys.ENTER);
        bekle(2);

        //    and then verify Submitted Values is displayed open page
        String expected="Submitted Values";
        String actual=driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();


        //    close driver



    }
}
