package com.cbt.tests;

import com.cbt.utilities.BrowsUtils;
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
    public static void chromeTest(){

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        BrowsUtils.wait(2);
        String title=driver.getTitle();
        BrowsUtils.wait(2);
       driver.navigate().to("https://etsy.com");
        BrowsUtils.wait(2);
        String etsyTitle=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);

        driver.quit();
    }
    public static void fireFoxTes(){
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        BrowsUtils.wait(2);
        String title=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().to("https://etsy.com");
        BrowsUtils.wait(2);
        String etsyTitle=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);

        driver.quit();

    }
    public static void edgeTest() {
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("http://google.com");

        String title=driver.getTitle();

        driver.navigate().to("https://etsy.com");
       // Thread.sleep(2000);
        String etsyTitle=driver.getTitle();
        BrowsUtils.wait(2);
        driver.navigate().back();
        StringUtility.verifyEquals(title,etsyTitle);


       driver.quit();
    }
}
