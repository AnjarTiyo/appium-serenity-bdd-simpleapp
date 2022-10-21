package com.isl;

import com.isl.interactions.GetText;
import com.isl.interactions.GetTheTitle;
import com.isl.questions.See;
import com.isl.tasks.*;
import com.isl.ui.ListApp;

public class BaseTest {
    public Login login = new Login();
    public GetTheTitle getTitle = new GetTheTitle();
    public TapButton tapButton = new TapButton();
    public GetText getText = new GetText();
    public SetCalcInput calc = new SetCalcInput();
    public SwipeScreen swipeScreen = new SwipeScreen();
    public TapOptionsApp tapOptions = new TapOptionsApp();
    public ListApp listApp = new ListApp();
    public See see = new See();
}
