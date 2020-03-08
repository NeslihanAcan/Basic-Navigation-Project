package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class NavigationTests {

    public static void main(String[] args) throws Exception{

   chromeTest();
   fireFoxTes();
   edgeTest();



    }
    public static void chromeTest()throws Exception{

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        Thread.sleep(2000);
        String title=driver.getTitle();
        Thread.sleep(2000);
       driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String etsyTitle=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);

        driver.quit();
    }
    public static void fireFoxTes()throws Exception{
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        Thread.sleep(2000);
        String title=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String etsyTitle=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);

        driver.quit();

    }
    public static void edgeTest() throws Exception{
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("http://google.com");
       // Thread.sleep(2000);
        String title=driver.getTitle();
       // Thread.sleep(2000);
        driver.navigate().to("https://etsy.com");
       // Thread.sleep(2000);
        String etsyTitle=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);


       driver.quit();
    }
}
