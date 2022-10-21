package com.isl.simpleapp.base;

import com.isl.simpleapp.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import org.openqa.selenium.By;

import java.time.Duration;

public class BasePageObjectModel {

    public AndroidDriver<AndroidElement> getDriver() {
        return AndroidDriverInit.driver;
    }

    public AndroidElement find(By by) {
        return getDriver().findElement(by);
    }

    public void inputText(By by, String text) {
        AndroidElement element = find(by);
        element.clear();
        element.sendKeys(text);
    }

    public void tap(By by) {
        find(by).click();
    }

    public void longTap(By by, int duration){
//        TouchAction action = new TouchAction(getDriver());
//        action.longPress();
//        find(by);
    }

    public String getText(By by) {
        return find(by).getText();
    }

    public boolean displayed(By by) {
        return find(by).isDisplayed();
    }
}
