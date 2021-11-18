package net.idt.n2p.huddle.hooks;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.BeforeAll;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumServiceHook {
    public static final int PORT = 4723;
    private static final Logger LOGGER = LogManager.getLogger(AppiumServiceHook.class);
    public static final String APPIUM_SERVICE = "C:\\Users\\rcorrea\\AppData\\Roaming\\npm\\node_modules\\appium";
    public static final String NODEJS_SERVICE = "C:\\Program Files\\nodejs\\node.exe";
    public static final String LOCALHOST_ADDRESS = "127.0.0.1";
    public static final String APPIUM_ADDRESS = "http://127.0.0.1";

    public AndroidDriver<MobileElement> driver;
    protected final URL webDriverURL = new URL(APPIUM_ADDRESS + ":" + PORT + "/wd/hub");

    public AppiumServiceHook() throws MalformedURLException {
    }

    @BeforeAll
    public static void startAppium() {
        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        AppiumDriverLocalService service;
        serviceBuilder.withIPAddress(LOCALHOST_ADDRESS).usingPort(PORT);
        serviceBuilder.usingDriverExecutable(new File(NODEJS_SERVICE));
        serviceBuilder.withAppiumJS(new File(APPIUM_SERVICE));

        service = AppiumDriverLocalService.buildService(serviceBuilder);
        try {
            LOGGER.info("Starting Appium service....");
            service.start();
//            Runtime.getRuntime().exec("emulator @Pixel_XL_API_30");
            Thread.sleep(5000);
//            val process3 = Runtime.getRuntime().exec("adb shell am start -n package:com.net2phone.huddle")
        }
        catch (Exception e) {
            LOGGER.error("Error starting Appium service...." + e.getMessage());
        }
    }
}
