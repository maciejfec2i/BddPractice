package com.maciejfec;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    private final SharedDictionary sharedDict;
    private WebDriver driver;
    private String baseUrl = "https://www.saucedemo.com/";

    public Hooks(SharedDictionary sharedDict) {

        this.sharedDict = sharedDict;
    }

    @Before
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

        sharedDict.add("driver", driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {

        driver.quit();
    }

    public WebDriver getDriver() {

        return driver;
    }
}
