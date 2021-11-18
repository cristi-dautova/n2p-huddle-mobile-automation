package net.idt.n2p.heddlev2.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public BasePage(AndroidDriver<MobileElement> driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }
}
