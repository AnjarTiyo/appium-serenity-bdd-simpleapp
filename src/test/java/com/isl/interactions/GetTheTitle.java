package com.isl.interactions;

import com.isl.simpleapp.base.BasePageObjectModel;
import com.isl.ui.CalculatorPage;
import com.isl.ui.LoginPage;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

public class GetTheTitle extends BasePageObjectModel {

    public String LoginPage(){
        return getText(MobileBy.className(LoginPage.TITLE_LOC));
    }
    public String CalculatorPage() {
        return getText(MobileBy.xpath(CalculatorPage.TITLE_PATH));
    }
}
