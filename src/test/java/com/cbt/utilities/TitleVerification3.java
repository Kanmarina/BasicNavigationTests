package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com/",
                "https://westelm.com/");



        for (String url : urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(url);

            String title = driver.getTitle().replace(" ", "").toLowerCase();
            Thread.sleep(3000);
            if (url.contains(title)) {
                System.out.println("Test passed ");
            } else {
                System.out.println("Test failed ");
            }
            Thread.sleep(3000);

            driver.quit();
        }
    }
}