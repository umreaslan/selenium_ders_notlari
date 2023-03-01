package practıce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */

    public static void main(String[] args) {

     //1-setpath
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//Bu satirda sisteme driver'imizi
        //tanitiyoruz.driver 'imizin yolunu gosteriyoruz

        //2-create chrome driver
        WebDriver driver=new ChromeDriver();//bu adomda hangi tarayicida calistiracagimizi belirliyoruz
        //Cross testing de ihtiyacimiz olacak

        //3-Maximize the window
        driver.manage().window().maximize();

        //4-open google home page https://www.google.com/
        driver.get("https://www.google.com");//get daha hizli calisir bagimsiz projelerde
        //ilk ethapta get mi navagate mi  nasil karar veriyoruz?
        // get methodu daha hizli calisir
        //navigate bagimli senaryolarda  tercih edilir

        //5-On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to goog

        driver.navigate().to("https://www.amazon.com/");

       //6- Navigate back to google
        driver.navigate().back();

        //7-Navigate forward to amazon

       driver.navigate().forward();
       //8- Refresh the page
        driver.navigate().refresh();

        //9- Close/Quit the browser

        driver.quit();//close bulunulan son sayfayi .quit ise tum sayfalari kapatir

       //10- And last step : print "All Ok" on console
        System.out.println("All Ok");

    }
}
