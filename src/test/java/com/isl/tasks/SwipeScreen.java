package com.isl.tasks;

import com.isl.model.Direction;
import com.isl.simpleapp.base.BasePageObjectModel;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;
import java.time.Duration;

public class SwipeScreen extends BasePageObjectModel {

    @Step("{0} swipe the screen")
    //perform swipe from the centre of screen
    public void to(Direction dir) {
        //code source https://appium.io/docs/en/writing-running-appium/tutorial/swipe/simple-screen/
        final int PRESS_TIME = 1000;
        int edgeBorder = 5; //fail safe mode

        //screen variable
        Dimension dims = getDriver().manage().window().getSize();

        PointOption pointOptionStart, pointOptionEnd;
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case DOWN: //to center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: //to center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: //to center of left screen
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right screen
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default: //in case not available
                throw new IllegalStateException("direction: " + dir + " NOT Supported");
        }

        new TouchAction(getDriver()).press(pointOptionStart).waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME))).moveTo(pointOptionEnd).waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME))) // to see the movement
                .release().perform();
    }
}

