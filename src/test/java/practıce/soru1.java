package practıce;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class soru1 {
/* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */
public static void main(String[] args) throws InterruptedException {


    System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");

  // fill the firstname

   WebElement firstname= driver.findElement(By.xpath("//input[@name='firsname']"));
   firstname.sendKeys("Riza" );


   WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
   lastname.sendKeys("Cimen");

   driver.findElement(By.xpath("(//input[@id='sex-0'])[1]")).click();

   driver.findElement(By.xpath("(//input[@id='exp-4'])[1]")).click();

  WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']"));
  date.sendKeys("25.07.1998" );

 driver.findElement(By.id("profession-1")).click();


  driver.findElement(By.id("tool-2"));



  WebElement ddm=driver.findElement(By.xpath("(//select[@class='input-xlarge'])[1]"));
    Select select=new Select(ddm);
    select.selectByVisibleText("Antartica");

     ddm=driver.findElement(By.xpath("(//select[@class='input-xlarge'])[2]"));
     select=new Select(ddm);
    select.selectByVisibleText("Browser Commands");


  driver.findElement(By.xpath("//button[@id='submit']")).click();










    }



}



