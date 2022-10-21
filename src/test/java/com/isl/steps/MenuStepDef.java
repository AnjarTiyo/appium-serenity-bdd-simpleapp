package com.isl.steps;

import com.isl.BaseTest;
import com.isl.model.Direction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.isl.ui.CalculatorPage.HAMBURGER_BUTTON;
import static org.junit.Assert.assertTrue;

public class MenuStepDef extends BaseTest {

    @When("(.*) tap hamburger button$")
    public void tapHamburgerButton() {
        tapButton.on(HAMBURGER_BUTTON);
    }

    @Then("(.*) should see the Android icon$")
    public void shouldSeeTheAndroidIcon() {
        assertTrue(see.androidIconDisplayed());
    }

    @And("(.*) should see Calculator option$")
    public void seeCalculatorOption(String actor) {
        assertTrue(see.calculatorOptionDisplayed());
    }

    @And("(.*) should see List option$")
    public void seeListOption(String actor) {
        assertTrue(see.listOptionDisplayed());
    }

    @When("(.*) swipe screen (.*)$")
    public void swipe(String actor, Direction dir) {
        swipeScreen.to(dir);
    }

    @When("(.*) tap on (.*) options$")
    public void heTapOnOptions(String actor, String options) {
        tapOptions.on(options);
    }
}
