package net.idt.n2p.huddle.tests;

import net.idt.n2p.huddle.base.BaseTest;
import net.idt.n2p.huddle.base.ILoginPage;
import net.idt.n2p.huddle.pageObjects.android.AndroidLoginPage;
import net.idt.n2p.huddle.pageObjects.android.AndroidNativeAppPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.net.MalformedURLException;

public class LoginTest extends BaseTest {
    public WebDriverWait wait;
    public AndroidLoginPage loginPage;
    public ILoginPage iloginPage;
    public AndroidNativeAppPage nativeApp;
    private static final Logger LOGGER = LogManager.getLogger(LoginTest.class);

    public LoginTest() throws MalformedURLException {
        LOGGER.info("CONSTRUCTOR CHILD");
    }

    @BeforeClass
    public void setUpDevice() {
        LOGGER.info("+++++++ BeforeClass +++++++");
        LOGGER.info(this.driver);
        nativeApp = new AndroidNativeAppPage(this.driver);
//        loginPage = new LoginPage(this.driver);
        iloginPage = new AndroidLoginPage(this.driver);
    }

    @Test
    public void loginApp() throws InterruptedException {
        // Get Desired capabilities
        // Get Driver
        // Start test

        nativeApp.verticalSwipe();
        nativeApp.openHuddle();
        iloginPage.loginHuddle();
    }
}
