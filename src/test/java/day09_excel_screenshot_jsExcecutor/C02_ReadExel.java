package day09_excel_screenshot_jsExcecutor;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExel {

    @Test
    public  void test01() throws IOException {

        String dosyaYolu="src/test/java/day09_excel_screenshot_jsExcecutor/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fis);

        //- 1.satirdaki 2.hucreye gidelim ve yazdiralim
        System.out.println(workbook.getSheet("Sayfa1")
                .getRow(0)
                .getCell(1));
        // - 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim

        String istenenData=workbook.getSheet("Sayfa1")
                .getRow(0)
                .getCell(1)
                .toString();
        System.out.println("istenenData:" +istenenData);
        // - 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        String expectedData="Kabil";
        String actualData=workbook.getSheet("Sayfa1").getRow(1)
                .getCell(3).toString();

        Assert.assertEquals(expectedData,actualData);
        // - Satir sayisini bulalim
        System.out.println("satir sayisi:" +workbook.getSheet("Sayfa1").getLastRowNum()+1);
        // -sayfa 2 deki satir sayisi ve Fiziki olarak kullanilan satir sayisini bulun

        System.out.println("sayfa2 satir sayisi:" +(workbook.getSheet("Sayfa2").getLastRowNum()+1));
        // - Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim


    }
}
