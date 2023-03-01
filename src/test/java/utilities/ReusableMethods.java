package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethods {

    public  static  void tumSayfaScreenshot(WebDriver driver)  {

        TakesScreenshot ts=(TakesScreenshot) driver;

        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
      String dinamikDosyaYolu= "target/tumsayfaSs" + ldt.format(dtf)+".png";

     // dosya yolu "target/tumsayfaSs20230227114813
        File tumsayfaSs=new File(dinamikDosyaYolu);
        File geciciFile=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciFile,tumsayfaSs);
        } catch (IOException e) {

        }




    }
    public  static  void webElementScrenshot(WebElement istenenElement){
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String dinamikDosyaYolu= "target/tumsayfaSs" + ldt.format(dtf)+".png";


        File elementSs=new File(dinamikDosyaYolu);
        File geciciFile=istenenElement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciFile,elementSs);
        } catch (IOException e) {

        }
    }
}
