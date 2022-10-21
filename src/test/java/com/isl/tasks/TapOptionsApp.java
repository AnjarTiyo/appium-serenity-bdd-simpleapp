package com.isl.tasks;

import com.isl.simpleapp.base.BasePageObjectModel;
import com.isl.ui.MenuPanel;
import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.WaitOptions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.touch.TouchActions;
import java.time.Duration;

public class TapOptionsApp extends BasePageObjectModel {

    @Step("{0} tap on options available")
    public void on(String options) {
        switch (options) {
            case "Calculator":
                WaitOptions.waitOptions(Duration.ofSeconds(1));
                tap(MobileBy.id(MenuPanel.CALCULATOR_OPTION));
                break;
            case "List":
                WaitOptions.waitOptions(Duration.ofSeconds(1));
                tap(MobileBy.id(MenuPanel.LIST_OPTION));
                break;
            default:
                throw new IllegalStateException("Options: " + options + "NOT available.");
        }
    }

    @Step("{0} long tap on options available")
    public void longTapListOptions(String options) {
        TouchActions action = new TouchActions(getDriver());
        action
                .longPress(find(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + options + "\")")))
                .release()
                .perform();
    }

    @Step("{0} tap options available multiple times")
    public void multipleTap(int times, String options) {
        for (int i = 0; i < times; i++) {
            tap(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + options + "\")"));
        }
    }
}
