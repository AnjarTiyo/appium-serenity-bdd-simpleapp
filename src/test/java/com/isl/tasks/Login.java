package com.isl.tasks;

import com.isl.simpleapp.base.BasePageObjectModel;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import static com.isl.ui.LoginPage.*;

public class Login extends BasePageObjectModel {

    @Step("{0} login with username {string] and password {password}")
    public void with(String username, String password) {
        inputText(MobileBy.id(USERNAME), username);
        inputText(MobileBy.id(PASSWORD), password);
        tap(MobileBy.id(LOGIN_BTN));
    }
}
