package com.isl.steps;

import com.isl.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepDef extends BaseTest {

    @Given("(.*) input (.*) to angka1 field$")
    public void inputNumberToAngka1Field(String actor, String number1) {
        calc.setFirstNumber(number1);
    }

    @And("(.*) input (.*) to angka2 field$")
    public void inputNumberToAngka2Field(String actor, String number2) {
        calc.setSecondNumber(number2);
    }

    @And("(.*) set operator to (.*)$")
    public void setOperatorTo(String actor, String operator) {
        calc.setOperator(operator);
    }

    @When("(.*) tap equal button$")
    public void userTapEqualButton(String actor) {
        calc.calculate();
    }

    @Then("(.*) should get answer (.*)$")
    public void userShouldGetAnswer(String actor, String answer) {
        //for screenplay pattern, should go to questions package
        String calcAnswer = getText.theAnswer();
        Assertions.assertEquals("Hasil : " + answer, calcAnswer);
    }

    @Then("(.*) should get (.*) of 2$")
    public void userShouldGetDigitOf(String actor, int digit) {
        //for screenplay pattern, should go to questions package
        String expectedAnswer = String.valueOf(2 * (10 ^ digit));
        String answer = getText.theAnswer();
        Assertions.assertEquals(expectedAnswer, answer);
    }

    @Then("The operator is set to (.*)$")
    public void operatorIsSetTo(String operator) {
        String op = getText.theOperator(operator);
        Assertions.assertEquals(operator, op);
    }

    @Given("(.*) input (.*) digits of 1 to field angka1$")
    public void inputDigitDigitsOfToFieldAngka1(String actor, int digit) {
        calc.setFirstNumber(String.valueOf(10 ^ digit));
    }

    @Given("(.*) input (.*) digits of 1 to field angka2$")
    public void inputDigitDigitsOfToFieldAngka2(String actor, int digit) {
        calc.setSecondNumber(String.valueOf(10 ^ digit));
    }
}
