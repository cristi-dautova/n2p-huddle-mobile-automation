package net.idt.n2p.huddle.base;

import io.appium.java_client.android.AndroidDriver;
import net.idt.n2p.huddle.tests.LoginTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetupDeviceCapabilities {
    private static final Logger LOGGER = LogManager.getLogger(LoginTest.class);

    public static DesiredCapabilities getDesiredCapabilities(/*....*/) {
        LOGGER.info("**************  Setting Desired Capabilities  **************");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "sdk_gphone_x86");
        caps.setCapability("appium:platformVersion", 11);
//            caps.setCapability("appium:app", "C:\\Users\\rcorrea\\Downloads\\huddle.apk")
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:appPackage", "com.net2phone.huddle");
        caps.setCapability("appium:appActivity", ".MainActivity");

        return caps;
    }
}
