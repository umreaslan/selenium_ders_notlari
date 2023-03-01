package day07_actionsClass_filetestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_Filepath {

    @Test
    public  void test01(){

        //user.home bilgisayarimizin temel dosya yolu

        //icinde bulundugumuz projenin temel yolu user.dir

     //C:\Users\HP\Desktop\Yeni klasör\seleniumTeam108\src\test\java\day07_actionsClass_filetestleri\text.txt
        String dosyaYolu="C:\\Users\\HP\\Desktop\\";
        boolean sonuc= Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);

        System.out.println(System.getProperty("user.home"));
        dosyaYolu=System.getProperty("user.home") +"\\Desktop\\";

        System.out.println(System.getProperty("user.dir"));



    }
}
