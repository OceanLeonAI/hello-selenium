package com.leon.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {
    public static void main(String[] args) {

//        WebDriver driver = new FirefoxDriver();   //Firefox浏览器
//
//        WebDriver driver = new EdgeDriver();      //Edge浏览器
//
//        WebDriver driver = new InternetExplorerDriver();  // Internet Explorer浏览器
//
//        WebDriver driver = new OperaDriver();     //Opera浏览器
//
//        WebDriver driver = new PhantomJSDriver();   //PhantomJS


        System.setProperty("webdriver.chrome.driver", "D:\\DevelopWorkspace\\WorkspaceForIdea\\hello-selenium\\chrome-driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();    //Chrome浏览器


    }
}
