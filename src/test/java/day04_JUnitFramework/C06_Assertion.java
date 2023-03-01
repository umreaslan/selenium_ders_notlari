package day04_JUnitFramework;

import org.junit.Assert;
import org.junit.Test;

public class C06_Assertion {
  /*
  Junit testlerin passed veya failed olduguna
  kodlari calistirirken sorun olusup olusmamasina gore kara verir

   */
    String str1 ="Ali";
    String str2="ali";
    @Test
    public  void test01(){
        Assert.assertEquals("karsilastrilan degerler farkli",str1,str2);
//        if (str1.equals(str2)){
//            System.out.println("esitlik testi passed");
//        }else {
//            System.out.println("esitlik testi failed");
//        }
    }
    @Test
    public  void  test02(){
        Assert.assertTrue("str1 istenen harfi icermiyor",str1.contains("A"));
    }
    {
//        if (str1.contains("A")){
//            System.out.println("olumlu test passed");
//        }else {
//            System.out.println("olumlu test failed");
//        }
    }
    @Test
    public  void test03(){
        Assert.assertFalse("str2 istene harfi icermiyor",str2.contains("c"));
    }
        }
        //cumlemiz  olumlu ise true
        // cumlemiz olumsuz ise false
        // esit mi derse equelse
         //esit degil derse notequelse



