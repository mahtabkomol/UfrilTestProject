package com.test;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class HomePageTest extends Base {

    //Home page Title Test
    String url = "https://www.ufril.com/";
    public String title()  {
        String str = driver.getTitle();
        return str;
    }
    public boolean signUplink() throws Exception{
        driver.findElement(By.xpath("//a[@ui-sref='signup']")).click();
        Thread.sleep(1000);
        boolean b = driver.findElement(By.xpath("//form[@name='signupForm']")).isDisplayed();
        return b;
    }
    public boolean logInLink() throws Exception{
        driver.findElement(By.xpath("//a[@ui-sref='login']")).click();
        Thread.sleep(1000);
        boolean b = driver.findElement(By.xpath("//form[@id='loginForm']")).isDisplayed();
        return b;
    }
    public boolean carWashLink() throws Exception{
        driver.findElement(By.xpath("//a[text()='Car Wash']")).click();
        Thread.sleep(1000);
        boolean b = driver.findElement(By.xpath("//form[@name='requestForm']")).isDisplayed();
        return b;
    }
    public boolean contactUsLink() throws Exception{
        driver.findElement(By.xpath("//a[@ui-sref='contactUs']")).click();
        Thread.sleep(1000);
        boolean b = driver.findElement(By.
                xpath("//form[@class='ufl-contact-form row ng-pristine " +
                        "ng-invalid ng-invalid-required ng-valid-email']")).isDisplayed();
        return b;
    }
    public boolean googlePlayLink() throws Exception{
        String ufril = driver.getWindowHandle();
        driver.findElement(By.xpath("//img[@ng-src='images/android-app.b75e62f2.png']")).click();
        Set<String> set = driver.getWindowHandles();
        for (String s : set){
            if (!s.equals(ufril)){
                driver.switchTo().window(s);
            }
        }
        Thread.sleep(1000);
        boolean b = driver.findElement(By.xpath("//h1[@class='Fd93Bb ynrBgc xwcR9d']")).isDisplayed();
        return b;
    }
    public boolean appleStoreLink() throws Exception{
        String uf = driver.getWindowHandle();
        driver.findElement(By.xpath("//img[@ng-src='images/ios-app.b61d303e.png']")).click();
        Set<String> set = driver.getWindowHandles();
        for (String s : set){
            if (!s.equals(uf)){
                driver.switchTo().window(s);
            }
        }
        Thread.sleep(1000);
        boolean b = driver.findElement(By.xpath(
                "//h1[@class='product-header__title app-header__title']")).isDisplayed();
        return b;
    }

}












