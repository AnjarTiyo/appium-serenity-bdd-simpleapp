package com.isl.ui;

import com.isl.model.ListAppOptions;
import com.isl.simpleapp.base.BasePageObjectModel;
import io.appium.java_client.MobileBy;
import static com.isl.ui.ListPage.*;
public class ListApp extends BasePageObjectModel {

    public void reach(ListAppOptions options){
        switch (options){
            case first:
                find(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\""+ FIRST_OPTIONS + "\"))"));
                break;
            case middle:
                find(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + MIDDLE_OPTIONS + "\"))"));
                break;
            case last:
                find(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + LAST_OPTIONS + "\"))"));
                break;
        }
    }
}
