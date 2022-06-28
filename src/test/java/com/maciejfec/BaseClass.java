package com.maciejfec;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    private WebDriver driver;
    private String baseUrl = "https://www.saucedemo.com/";

    public void setUp() {

        String browser = System.getProperty("browser");

        if(browser == null) {
            browser = "";
        }

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver();
                driver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
    }

    public void tearDown() {

        driver.quit();
    }

    public WebDriver getDriver() {

        return driver;
    }

    public String getBaseUrl() {

        return baseUrl;
    }
}
