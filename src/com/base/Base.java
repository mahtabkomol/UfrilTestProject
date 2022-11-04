package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {
    public static WebDriver driver;
    public Base(){

    }
    public void initialize(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahtab\\OneDrive\\" +
                "Desktop\\ReadingMaterial\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    public void close(){
        driver.quit();
    }

}
