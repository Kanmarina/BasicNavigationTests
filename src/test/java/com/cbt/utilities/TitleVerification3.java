package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com, " + "https://westelm.com/");

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();

        Thread.sleep(3000);

        for (String url: urls){
            driver.get(url);

            String title = driver.getTitle().replace(" ","").toLowerCase();

            if(url.contains(title)){
                System.out.println("Test passed " );
            }else{
                System.out.println("Test failed ");
            }


        }


        if( urls.contains("Lulu") &&  urls.contains("Giorgia")){
            System.out.println("https://lulugandgeorgia.com");
        }else if ( urls.contains("wayfair")){
            System.out.println(" https://wayfair.com/ ");
        }else if ( urls.contains("walmart")) {
            System.out.println(" https://walmart.com/ ");
        }else if ( urls.contains("westelm")) {
            System.out.println(" https://westelm.com/ ");
        }
        driver.quit();
    }
}
