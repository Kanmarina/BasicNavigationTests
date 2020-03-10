package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);


        Set<String> unique = new HashSet<>();
        for (String each:urls) {
            driver.get(each);
            unique.add(driver.getTitle());
        }
        if (unique.size()==1){
            System.out.println("They are equal!");
        } else {
            System.out.println("They are NOT equal!");
        }
        Thread.sleep(3000);
        driver.quit();

    }}