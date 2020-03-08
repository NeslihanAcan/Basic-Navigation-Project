package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                    "http://practice.cybertekschool.com/dropdown",
                                     "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
          for(String eachUrl:urls) {
              driver.navigate().to(eachUrl);
              BrowsUtils.wait(2);
              String title = driver.getTitle();

              if (eachUrl.contains(title.toLowerCase())) {
                  System.out.println("Title Passed");
              } else {
                  System.out.println("Title Failed");
              }

              if (eachUrl.startsWith("http://practice.cybertekschool.com")) {
                  System.out.println("URL Passed");
              } else {
                  System.out.println("URL Failed");

              }


          }
        driver.quit();
    }

}




