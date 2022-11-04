package com.test;

import com.base.Base;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunner extends Base {
    HomePageTest test = new HomePageTest();
    public String url = "https://www.ufril.com/";

    @BeforeTest
    public void setUp(){
        initialize(url);
    }
    @Test(priority = 1)
    public void titleTest(){
        String t = test.title();
        Assert.assertEquals(t, ":: Welcome to Ufril ::");
    }
    @Test(priority = 2)
    public void signUpLinkTest() throws Exception{
        boolean b = test.signUplink();
        Assert.assertTrue(b);
    }
    @Test(priority = 3)
    public void logInLinkTest() throws Exception{
        Assert.assertTrue(test.logInLink());
    }
    @Test(priority = 4)
    public void carWashLinkTest() throws Exception{
        Assert.assertTrue(test.carWashLink());
    }
    @Test(priority = 5)
    public void contactUsLinkTest() throws Exception{
        Assert.assertTrue(test.contactUsLink());
    }
//    @Test(priority = 5)
//    public void googlePlayLinkTest() throws Exception{
//        Assert.assertTrue(test.googlePlayLink());
//    }
//    @Test(priority = 6)
//    public void appleStoreLinkTest() throws Exception{
//        Assert.assertTrue(test.appleStoreLink());
//    }
    @AfterTest
    public void tearDown(){
        close();
    }

}
