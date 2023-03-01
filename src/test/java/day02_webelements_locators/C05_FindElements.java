package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FindElements {

    public static void main(String[] args) throws InterruptedException {

        //amazon ana sayfaya gidin arama kutusun'a java yazin
        //arama sonucunda cikan resimlerin  yazilarini yazin

       // System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java");
        aramaKutusu.submit();

        List<WebElement> aramaSonuclariElementList= driver.findElements(By.className("sg-col-inner"));

        System.out.println(aramaSonuclariElementList.size());
        
        //86 elementi yazdiralim
       int elementNo=1;
        for (WebElement eachElement:aramaSonuclariElementList
             ) {
            System.out.println(elementNo + "---" + eachElement.getText());
            elementNo++;

        }


        Thread.sleep(3000);
        driver.close();
    }
}
