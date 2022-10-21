package com.isl.steps;

import com.isl.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginStepDef extends BaseTest {

    @Given("that (.*) is already on (.*) Login Page$")
    public void thatUserIsAlreadyOpenTheApp(String actor, String title) {
        String titleText = getTitle.LoginPage();
        Assertions.assertEquals(title, titleText);
    }

    @When("(.*) login with username (.*) and password (.*)$")
    public void loginWithUsernameAndPassword(String actor, String username, String password) {
        login.with(username, password);
    }

    @Then("(.*) is restricted to login$")
    public void heIsRestrictedToLogin(String actor) {
        String titleText = getTitle.LoginPage();
        Assertions.assertEquals("Simple App", titleText);
    }

    @And("message (.*) appear$")
    public void messageAppear(String msg) {
        see.theseMessage(msg);
    }

    @When("(.*) login as (.*)$")
    public void loginAsValidRegisteredUser(String actor, String admin) {
        login.with(admin, "admin");
    }

    @Then("(.*) should logged in$")
    public void heShouldLoggedIn(String actor) {
        see.theseMessage("Welcome ! Admin");
    }

    @And("(.*) page shown up$")
    public void calculatorPageShownUp(String title) {
        String titleText = getTitle.CalculatorPage();
        Assertions.assertEquals(title, titleText);
    }

    @Given("(.*) already logged in$")
    public void userAlreadyLoggedIn(String actor) {
        login.with("admin", "admin");
    }
}
