package net.idt.n2p.heddlev2.utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.net.MalformedURLException;

public class SetupAppiumService {

    private static final Logger LOGGER = LogManager.getLogger(SetupAppiumService.class);

    public static final int PORT = 4723;
    public static final String APPIUM_SERVICE = "C:\\Users\\\\cdautova\\AppData\\Roaming\\npm\\node_modules\\appium";
    public static final String NODEJS_SERVICE = "C:\\Program Files (x86)\\nodejs\\node.exe";
    public static final String LOCALHOST_ADDRESS = "127.0.0.1";

    public AndroidDriver<MobileElement> driver;

    private final AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
    public AppiumDriverLocalService service;

    public SetupAppiumService() throws MalformedURLException {
    }

    public boolean start() {
        serviceBuilder.withIPAddress(LOCALHOST_ADDRESS).usingPort(PORT);
        serviceBuilder.usingDriverExecutable(new File(NODEJS_SERVICE));
        serviceBuilder.withAppiumJS(new File(APPIUM_SERVICE));
        service = AppiumDriverLocalService.buildService(serviceBuilder);
        try {
            LOGGER.info("**************  Starting Appium service **************");
            service.start();
            return true;
        }
        catch (Exception e) {
            LOGGER.error("Error starting Appium service failed...." + e.getMessage());
        }
        return false;
    }

    public boolean stop() {
        try {
            LOGGER.info("Stopping Appium service...");
            service.stop();
            // Kill previous PORT used process
            Runtime.getRuntime().exec("taskkill /F /IM node.exe");
            Runtime.getRuntime().exec("adb kill-server");
            return true;
        }
        catch (Exception e) {
            LOGGER.error("There were an error stopping Appium service...");
        }
        return false;
    }

    public boolean isRunning() {
        // TODO
        return false;
    }
}
