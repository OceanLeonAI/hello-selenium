package com.leon.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Description: 通过selenium操作浏览器打开百度进行搜索
 * selenium版本：3.12.0； 通过maven管理jar包
 * 开发工具：IDEA
 * jdk：1.8
 * 浏览器：chrome 75+
 * @Author: ggf
 * @Date: 2020/03/22
 */
public class BaiduSearchMine {

    // 系统分隔符
    public static final String SYSTEM_SEPARATOR = System.getProperty("file.separator");

    // 驱动名称
    public static final String DRIVER_NAME = "chromedriver.exe";

    // 获取当前项目的绝对路径
    public static final String PROJECT_PATH = System.getProperty("user.dir");

    // 驱动路径
    // D:\DevelopWorkspace\WorkspaceForIdea\hello-selenium\chrome-driver\chromedriver.exe
    public static final String DRIVER_PATH = PROJECT_PATH + SYSTEM_SEPARATOR + "chrome-driver" + SYSTEM_SEPARATOR + DRIVER_NAME;

    public static void main(String[] args) {

        System.out.println("DRIVER_PATH ---> " + DRIVER_PATH);

        // 设置系统环境变量
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

        // 1.创建webdriver驱动
        WebDriver driver = new ChromeDriver();
        // 2.打开百度首页
        driver.get("https://www.baidu.com");
        // 3.获取输入框，输入selenium
        driver.findElement(By.id("kw")).sendKeys("selenium");
        // 4.获取“百度一下”按钮，进行搜索
        driver.findElement(By.id("su")).click();
        // 5.退出浏览器
        driver.quit();
    }
}
