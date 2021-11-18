package net.idt.n2p.heddlev2.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import net.idt.n2p.huddle.tests.LoginTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class SetupDeviceCapabilities {

    private static final Logger LOGGER = LogManager.getLogger(LoginTest.class);

//    public static DesiredCapabilities getDesiredCapabilities(/*....*/) {
//        LOGGER.info("**************  Setting Desired Capabilities  **************");
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("appium:deviceName", "sdk_gphone_x86");
//        caps.setCapability("appium:platformVersion", 11);
////            caps.setCapability("appium:app", "C:\\Users\\rcorrea\\Downloads\\huddle.apk")
//        caps.setCapability("appium:automationName", "UiAutomator2");
//        caps.setCapability("appium:appPackage", "com.net2phone.huddle");
//        caps.setCapability("appium:appActivity", ".MainActivity");
//
//        return caps;
//    }

    public static DesiredCapabilities getDesiredCapabilities(/*....*/) {
        LOGGER.info("**************  Setting Desired Capabilities  **************");

        File apkFile = new File("src/test/resources/app-release.apk");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Nexus 6 API 30");
        caps.setCapability("appium:platformVersion", 11);
        caps.setCapability("appium:appPackage", "com.net2phone.huddle");
        caps.setCapability("appium:appActivity", ".MainActivity");
        caps.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());

        return caps;
    }
}
