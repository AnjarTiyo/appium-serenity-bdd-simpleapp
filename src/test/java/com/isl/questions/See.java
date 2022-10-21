package com.isl.questions;

import com.isl.simpleapp.base.BasePageObjectModel;
import io.appium.java_client.MobileBy;
import io.appium.java_client.touch.WaitOptions;
import net.thucydides.core.annotations.Step;
import java.time.Duration;
import static com.isl.simpleapp.drivers.AndroidDriverInit.driver;
import static com.isl.ui.MenuPanel.*;

public class See extends BasePageObjectModel {

    @Step("{0} see these Options")
    public void theseOptions(String optionWanted) {
        displayed(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + optionWanted + "\")"));
    }

    @Step("{0} see these message")
    public boolean theseMessage(String msg) {
        boolean isToastMessageSeen = false;

        String xml1 = driver.getPageSource();
        WaitOptions.waitOptions(Duration.ofMillis(200));
        String xml2 = driver.getPageSource();
        WaitOptions.waitOptions(Duration.ofMillis(200));
        String xml3 = driver.getPageSource();
        WaitOptions.waitOptions(Duration.ofMillis(200));
        String xml4 = driver.getPageSource();
        WaitOptions.waitOptions(Duration.ofMillis(200));
        String xml5 = driver.getPageSource();
        WaitOptions.waitOptions(Duration.ofMillis(200));

        if (xml1.contains(msg)) {
            return true;
        } else if (xml2.contains(msg)) {
            return true;
        } else if (xml3.contains(msg)) {
            return true;
        } else if (xml4.contains(msg)) {
            return true;
        } else if (xml5.contains(msg)) {
            return true;
        }

        return isToastMessageSeen;
    }

    public boolean androidIconDisplayed() {
        return displayed(MobileBy.id(ANDROID_ICON));
    }

    public boolean calculatorOptionDisplayed() {
        return displayed(MobileBy.id(CALCULATOR_OPTION));
    }

    public boolean listOptionDisplayed() {
        return displayed(MobileBy.id(LIST_OPTION));
    }

}
