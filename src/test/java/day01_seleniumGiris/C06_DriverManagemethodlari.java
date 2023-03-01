package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManagemethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("maximize size: " + driver.manage().window().getSize());

        System.out.println(" maximize position : " + driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println( "fuulscreen size :" + driver.manage().window().getSize());
        System.out.println("fullscreen position " + driver.manage().window().getPosition());

    }
}
