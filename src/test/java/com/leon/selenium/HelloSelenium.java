package com.leon.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {

        // 需要打开pom中 webdrivermanager 相关的依赖
        // WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "D:\\DevelopWorkspace\\WorkspaceForIdea\\hello-selenium\\chrome-driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        driver.quit();
    }
}
