package com.isl.tasks;

import com.isl.simpleapp.base.BasePageObjectModel;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import static com.isl.ui.CalculatorPage.*;

public class SetCalcInput extends BasePageObjectModel {

    @Step("{0} set first number to calculator by {string}")
    public void setFirstNumber(String number1) {
        //add number to angka1
        inputText(MobileBy.id(ANGKA1), number1);
    }

    @Step("{0} set second number to calculator by {string}")
    public void setSecondNumber(String number2) {
        //add number to angka2
        inputText(MobileBy.id(ANGKA2), number2);
    }

    @Step("{0} set operator of calculator to {string}")
    public void setOperator(String operator) {
        tap(MobileBy.id(DROPDOWN_OP));
        tap(MobileBy.xpath(OP(operator)));
    }

    @Step("{0} tap equal button")
    public void calculate() {
        tap(MobileBy.id(EQUAL_BTN));
    }
}
