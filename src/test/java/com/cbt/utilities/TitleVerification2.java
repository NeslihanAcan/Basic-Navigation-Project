package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TitleVerification2 {
    public static void main(String[] args)  {

        List<String> urls = Arrays.asList(//"https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://westelm.com/");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        for (String eachUrls : urls) {


           // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(eachUrls);
            String title = driver.getTitle();
            System.out.println(title);
            BrowsUtils.wait(2);
            if (eachUrls.contains(title.replace(" ","").toLowerCase())) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        }
        driver.quit();
    }
}