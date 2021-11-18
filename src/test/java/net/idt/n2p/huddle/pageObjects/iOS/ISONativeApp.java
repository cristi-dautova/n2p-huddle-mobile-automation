package net.idt.n2p.huddle.pageObjects.iOS;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.idt.n2p.huddle.base.android.AndroidBasePage;
import net.idt.n2p.huddle.base.iOS.IOSBasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ISONativeAppPage extends IOSBasePage {
    private static final Logger LOGGER = LogManager.getLogger(ISONativeAppPage.class);

    public ISONativeAppPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @iOSXCUITFindBy(xpath = "//android.widget.TextView[@content-desc='Huddle']")
    public MobileElement huddleApp;

    public void openHuddle() {
        wait.until(ExpectedConditions.visibilityOf(huddleApp)).click();
    }
}