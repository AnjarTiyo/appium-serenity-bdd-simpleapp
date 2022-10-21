package com.isl.simpleapp.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInit {

    public static AndroidDriver<AndroidElement> driver;

    public static void initialize(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.isl.simpleapp");
        desiredCapabilities.setCapability("deviceName", "RR8NA09QZ3J");
        desiredCapabilities.setCapability("appActivity", "com.isl.simpleapp.ui.login.LoginActivity");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        String url = "http://localhost:4723/wd/hub";

        try {
            driver = new AndroidDriver<>(new URL(url), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException error) {
            error.printStackTrace();
        }
    }

    public static void quit(){
        driver.quit();
    }
}
