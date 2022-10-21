package com.isl.ui;

public class CalculatorPage {

    public static final String TITLE_PATH = "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView";
    public static final String ANGKA1 = "com.isl.simpleapp:id/et_1";
    public static final String ANGKA2 = "com.isl.simpleapp:id/et_2";
    public static final String DROPDOWN_OP = "com.isl.simpleapp:id/spinner_1";
    public static final String EQUAL_BTN = "com.isl.simpleapp:id/acb_calculate";
    public static final String ANSWER = "tv_result";
    public static final String ACTIVE_OPERATOR = "android:id/text1";
    public static final String HAMBURGER_BUTTON = "Open navigation drawer";//id: "Buka panel navigasi"; en: "Open navigation drawer"

    public static String OP(String operator) {
        String opID;
        switch (operator){
            case "+":
                opID = "1";
                break;
            case "-":
                opID = "2";
                break;
            case "/":
                opID = "3";
                break;
            case "*":
                opID = "4";
                break;
            default:
                throw new IllegalStateException("Operator: "+ operator + "NOT available.");
        }
//        //TODO Bad code replace soon
//        if (operator.equals("+")) {
//            opID = "1";
//        } else if (operator.equals("-")) {
//            opID = "2";
//        } else if (operator.equals("/")) {
//            opID = "3";
//        } else {
//            opID = "4";
//        }
        return "//android.widget.TextView[" + opID + "]";
    }


}
