package net.idt.n2p.huddle.pageObjects.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.idt.n2p.huddle.base.INativeApp;
import net.idt.n2p.huddle.base.android.AndroidBasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AndroidNativeAppPage extends AndroidBasePage implements INativeApp {
    private static final Logger LOGGER = LogManager.getLogger(AndroidNativeAppPage.class);

    public AndroidNativeAppPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Huddle']")
    public MobileElement huddleApp;

    public void openHuddle() {
        wait.until(ExpectedConditions.visibilityOf(huddleApp)).click();
    }
}