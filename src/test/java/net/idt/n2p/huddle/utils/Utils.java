package net.idt.n2p.huddle.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Utils {
    private static final Logger LOGGER = LogManager.getLogger(Utils.class);
    public static void verticalSwipe(AppiumDriver<MobileElement> driver) {
        if(driver == null) {
            LOGGER.warn("DRIVER is NULL...");
        }

        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();
        int startX = width / 2;
        int startY = (int)(height * 0.75);
        int endY = (int)(height * 0.35);

        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(startX, endY))
                .release().perform();
    }

    public static void horizontalSwipe(AppiumDriver<MobileElement> driver) {
        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();
        int startXaxis = (int)(width * 0.90);
        int Yaxis = (int)(height * 0.20);
        int endXaxis = (int)(width * 0.10);

        new TouchAction(driver)
                .press(PointOption.point(startXaxis, Yaxis))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(startXaxis, endXaxis)).release().perform();

//        PlatformTouchAction((AppiumDriver<MobileElement>)driver)
//                .press(PointOption.point(startXaxis, Yaxis))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(PointOption.point(startXaxis, endXaxis)).release().perform()
    }
}
