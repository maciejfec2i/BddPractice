package com.maciejfec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaticHelpers {

    public static void waitForElement(WebDriver driver, int timeout, By locator) {

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        myWait.until(drv -> drv.findElement(locator));
    }
}
