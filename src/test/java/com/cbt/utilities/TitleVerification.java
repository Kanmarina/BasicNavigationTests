package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);


//       for (String url: urls){
//           driver.get(url);
//           String title = driver.getTitle();
//     if(urls.get( title)){
//         urls.get().startsWith( "http://practice.cybertekschool.com");
//     System.out.println(true);
//     }else{
//     System.out.println(false);
//    }
//       }
//        driver.quit();
//    }
//}
    }}