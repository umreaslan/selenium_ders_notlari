package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_driverMethodlar {

    public static void main(String[] args) throws InterruptedException {

      // chromedriver  kullanarak ,facebook sayfasina gidin

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        String expectedTitle ="facebook";
        String actualTitle =driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("facebook title testi PASSED");
        }else {
            System.out.println("facebook title testi FAILED" +
                   " \n gerceklesen title  :" +actualTitle);
            {

            String expectedicerik = "facebook";
            String actualUrl =driver.getCurrentUrl();

            if (actualUrl.contains(expectedicerik)){
                System.out.println("facebook url testi passed");
            }else {
                System.out.println("facebook url testi failed" +
                        "\n gerceklesen url  :" +actualUrl);


                }
                driver.get("https://www.walmart.com");

                String walmartExpectedicerik= "Walmart.com";
                String walmartActualtitle = driver.getTitle();

                if (walmartActualtitle.contains(walmartExpectedicerik)){
                    System.out.println("walmart  title  testi PASSED");
                }else {
                    System.out.println("walmart title testi FAILED");
                }
                //tekrar "facebook" sayfasina donun
                    driver.navigate().back();
                 // sayfayi yenileyin
                    driver.navigate().refresh();// yenileyin
                 // sayfayi tam sayfa yapiniz
                    driver.manage().window().maximize();

                // browsar'i kapatin
                    driver.close();

                }




            }



        }
    }

