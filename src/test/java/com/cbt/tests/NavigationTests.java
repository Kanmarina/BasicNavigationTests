package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class NavigationTests {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        chromeTest();


    }

    public static void chromeTest() throws InterruptedException {


        driver= BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        Thread.sleep(3000);

        String title = driver.getTitle();

        driver.navigate().to("http://etsy.com");
        Thread.sleep(3000);
        String title1=  driver.getTitle()  ;

        driver.navigate().back();
        Thread.sleep(3000);
        title = driver.getTitle();

        driver.navigate().forward();
        Thread.sleep(3000);
        title1= driver.getTitle();
        driver.quit();
    }
    public static void fireFoxTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver2 = new FirefoxDriver() ;
    }
public static void edgeTest(){
    WebDriverManager.edgedriver().setup();
    WebDriver driver3= new EdgeDriver();
}
}