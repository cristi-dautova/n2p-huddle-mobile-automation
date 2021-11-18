package net.idt.n2p.huddle.pageObjects.android.iOS;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.idt.n2p.huddle.base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IOSMeetingPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(IOSMeetingPage.class);

    public IOSMeetingPage(AppiumDriver<MobileElement> driver) {
        super(driver);

    }

 }
