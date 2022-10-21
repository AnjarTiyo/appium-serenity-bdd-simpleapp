package com.isl.interactions;

import com.isl.simpleapp.base.BasePageObjectModel;
import com.isl.ui.CalculatorPage;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import static com.isl.ui.LoginPage.SNACKBAR_MSG;

public class GetText extends BasePageObjectModel {

    public String theAnswer(){
        return getText(MobileBy.id(CalculatorPage.ANSWER));
    }

    public String theOperator(String operator) {
        return getText(MobileBy.id(CalculatorPage.ACTIVE_OPERATOR));
    }
}
