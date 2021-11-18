package net.idt.n2p.huddle.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;
    public SetupEmulator emulator;
    public SetupAppiumService appiumService;

    public BaseTest() throws MalformedURLException {
        LOGGER.info("+++++++ CONSTRUCTOR PARENT +++++++");
        appiumService = new SetupAppiumService();
        emulator = new SetupEmulator();
    }

    @BeforeSuite
    public final void beforeSuite() throws InterruptedException {
        LOGGER.info("+++++++ BeforeSuite PARENT +++++++");
        appiumService.start();
        emulator.launch();
        Thread.sleep(30000);
        this.driver = emulator.initDriver();
    }

    @AfterSuite
    public final void afterSuite() {
        LOGGER.info("+++++++ AfterSuite PARENT +++++++");
        try {
            LOGGER.info("Stopping Appium service...");
            appiumService.stop();
        }
        catch (Exception e) {
            LOGGER.error("There was an error stopping Appium service..." + e.getMessage());
        }

        try {
            LOGGER.info("Closing AndroidDriver...");
            this.driver.quit();
        }
        catch (Exception e) {
            LOGGER.error("There was an error closing AndroidDriver..." + e.getMessage());
        }
    }

    public void nada() {
        LOGGER.info("");
    }
//    private boolean waitUntilIsRunning() throws Exception {
//        final URL status = new URL(webDriverURL + "/sessions");
//        try {
//            new UrlChecker().waitUntilAvailable(10000, TimeUnit.MILLISECONDS, status);
//            return true;
//        } catch (UrlChecker.TimeoutException e) {
//            return false;
//        }
//    }
}
