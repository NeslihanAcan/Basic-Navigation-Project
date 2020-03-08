package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList(//"https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://westelm.com/");

        for (String eachUrls : urls) {

            WebDriver driver = BrowserFactory.getDriver("chrome");
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
            driver.quit();
        }

    }
}