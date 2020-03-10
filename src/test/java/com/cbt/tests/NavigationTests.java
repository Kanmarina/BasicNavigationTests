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
        fireFoxTest();
        edgeTest();
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
       String title2 = driver.getTitle();

        driver.navigate().forward();
        Thread.sleep(3000);
        String title3= driver.getTitle();
        driver.quit();
    }
    public static void fireFoxTest() throws InterruptedException {

        driver= BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        Thread.sleep(3000);

        String title = driver.getTitle();

        driver.navigate().to("http://etsy.com");
        Thread.sleep(3000);
        String title1=  driver.getTitle()  ;

        driver.navigate().back();
        Thread.sleep(3000);
        String title2 = driver.getTitle();

        driver.navigate().forward();
        Thread.sleep(3000);
        String title3= driver.getTitle();
        driver.quit();
    }
public static void edgeTest() throws InterruptedException {
    driver= BrowserFactory.getDriver("edge");
    driver.get("https://google.com");
    Thread.sleep(3000);

    String title = driver.getTitle();

    driver.navigate().to("http://etsy.com");
    Thread.sleep(3000);
    String title1=  driver.getTitle()  ;

    driver.navigate().back();
    Thread.sleep(3000);
    String title2 = driver.getTitle();

    driver.navigate().forward();
    Thread.sleep(3000);
    String title3= driver.getTitle();
    driver.quit();
}
}