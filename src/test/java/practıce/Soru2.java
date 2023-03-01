package practıce;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Soru2  extends TestBase {

    @Test
    public  void test01(){

       // /Navigate to  https://testpages.herokuapp.com/styled/index.html

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //Type any number in the first input
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("15");
        //Type any number in the second input
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("25");
        //Click on Calculate
        driver.findElement(By.id("calculate")).click();
        //Get the result
        driver.findElement(By.xpath("//span[@id='answer']")).getText();
        //Print the result
        System.out.println("Answer :" +driver.findElement(By.xpath("//span[@id='answer']")).getText());


    }






}
