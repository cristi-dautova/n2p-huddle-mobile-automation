package net.idt.n2p.huddle.pageObjects.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.idt.n2p.huddle.base.BasePage;
import net.idt.n2p.huddle.base.ILoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AndroidLoginPage extends BasePage implements ILoginPage {
    private static final Logger LOGGER = LogManager.getLogger(AndroidLoginPage.class);

    public AndroidLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='email']")
    public MobileElement loginName;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")
    public MobileElement nextLoginButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='password']")
    public MobileElement passwordName;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
    public MobileElement nextPasswordButton;

    @Override
    public void loginHuddle() {
        enterUserName("qa.admin07@idt.net");
        clickNextBtn();
        enterPassword("idt12345");
        clickAfterPasswordEntered();
    }

    public void enterUserName(String username) {
        wait.until(ExpectedConditions.visibilityOf(loginName)).sendKeys(username);
    }

    public void clickNextBtn() {
        wait.until(ExpectedConditions.visibilityOf(nextLoginButton)).click();
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordName)).sendKeys(password);
    }

    public void clickAfterPasswordEntered() {
        wait.until(ExpectedConditions.visibilityOf(nextPasswordButton)).click();
    }

}
