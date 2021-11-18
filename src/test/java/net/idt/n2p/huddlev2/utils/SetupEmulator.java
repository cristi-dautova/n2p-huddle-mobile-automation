package net.idt.n2p.heddlev2.utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;
import java.net.URL;

public class SetupEmulator {

    private static final Logger LOGGER = LogManager.getLogger(SetupEmulator.class);
    private static final int PORT = 4723;
    private static final String APPIUM_ADDRESS = "http://127.0.0.1";
    private final URL webDriverURL = new URL(APPIUM_ADDRESS + ":" + PORT + "/wd/hub");
    public AndroidDriver<MobileElement> driver;

    public SetupEmulator() throws MalformedURLException {
    }

    public AndroidDriver<MobileElement> initDriver() {

        try {
            LOGGER.info("**************  Initializing AndroidDriver  **************");
            driver = new AndroidDriver<>(webDriverURL, SetupDeviceCapabilities.getDesiredCapabilities());
        }
        catch (Exception e) {
            LOGGER.error("Error setting up Android device ..." + e.getMessage());
        }
        return driver;
    }
    public boolean launch() {

        try {
            LOGGER.info("**************  Starting Android emulator device  **************");
            Runtime.getRuntime().exec("emulator @Nexus_6_API_30");
            Thread.sleep(30000);
            return true;
        }
        catch (Exception e) {
            LOGGER.error("Error starting Emulator device...." + e.getMessage());
        }
        return false;
    }

    public boolean down() {
        return false;
    }
}
