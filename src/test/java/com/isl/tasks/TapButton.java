package com.isl.tasks;

import com.isl.simpleapp.base.BasePageObjectModel;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

public class TapButton extends BasePageObjectModel {

    @Step("{0} tap button")
    public void on(String button) {
        tap(MobileBy.AccessibilityId(button));
    }
}
