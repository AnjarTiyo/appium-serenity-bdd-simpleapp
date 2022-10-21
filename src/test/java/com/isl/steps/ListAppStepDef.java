package com.isl.steps;

import com.isl.BaseTest;
import com.isl.model.ListAppOptions;
import com.isl.ui.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListAppStepDef extends BaseTest {

    @Given("(.*) already open List app$")
    public void alreadyOpenListApp() {
        tapButton.on(CalculatorPage.HAMBURGER_BUTTON);
        tapOptions.on("List");
    }

    @When("(.*) reach the (.*) of List App options$")
    public void reachTheOptions(String actor, ListAppOptions options) {
        listApp.reach(options);
    }

    @Then("(.*) should see options (.*)$")
    public void shouldSeeListKe(String actor, String optionsWanted) {
        see.theseOptions(optionsWanted);
    }

    @When("(.*) long tap List Options (.*)$")
    public void heLongTapListOptionsListKe(String actor, String options) {
        tapOptions.longTapListOptions(options);
    }

    @When("(.*) tap (.*) times on (.*)$")
    public void heTapTimes(String actor, int times, String options) {
        tapOptions.multipleTap(times, options);
    }
}
