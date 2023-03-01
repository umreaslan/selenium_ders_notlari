package day04_JUnitFramework;

import org.junit.*;

public class C05_BirlikteKullanim {


    @BeforeClass
    public static void  beforeclass(){

        System.out.println("beforeclass calisti \n===============");

    }
    @AfterClass
    public  static  void afterClass(){
        System.out.println("==================\nBefore Class calisti");
    }
    @Before
    public  void before(){
        System.out.println("\nbefore methodu calisti");
    }
    @After
    public  void after(){
        System.out.println("After methodu calisti");


    }
    @Test
    public  void test01(){
        System.out.println("test01 calisti");
    }
    @Test
    public  void test02(){
        System.out.println("test02 calisti");

}
    @Test
    public  void test03(){
        System.out.println("test03 calisti");

        }

}
