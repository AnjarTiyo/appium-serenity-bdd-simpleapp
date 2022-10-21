package com.isl.hooks;

import com.isl.simpleapp.drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.messages.Messages;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import static com.isl.simpleapp.drivers.AndroidDriverInit.driver;

public class AndroidDriverHook {

    @Before()
    public void beforeScenario(){
        AndroidDriverInit.initialize();
    }

    //TODO create screenshot after each step

    @After()
    public void afterScenario(Scenario scenario){
        AndroidDriverInit.quit();
    }

    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        String timeRun = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss|").format(new Date()) + scenario.getName();
        String filename = scenario.getName();
        File targetFile = new File("./target/screenshot/"+timeRun+ ".png");
        FileUtils.copyFile(srcFile,targetFile);
    }
}
