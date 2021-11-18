package net.idt.n2p.huddle.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.idt.n2p.huddle.base.BaseStep;
import net.idt.n2p.huddle.base.SetupEmulator;
import net.idt.n2p.huddle.base.SetupAppiumService;
import net.idt.n2p.huddle.pageObjects.android.AndroidLoginPage;
import net.idt.n2p.huddle.pageObjects.android.AndroidNativeAppPage;
import net.idt.n2p.huddle.tests.LoginTest;
import net.idt.n2p.huddle.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.MalformedURLException;

public class LoginSteps extends BaseStep {
    public AndroidLoginPage loginPage;
    public AndroidNativeAppPage nativeApp;
    public LoginTest loginTest;
    private static final Logger LOGGER = LogManager.getLogger(LoginSteps.class);
    public SetupAppiumService appiumService;
    public SetupEmulator emulator;
    public AndroidDriver<MobileElement> driver;
    public LoginSteps() throws MalformedURLException {
        appiumService = new SetupAppiumService();
        loginTest = new LoginTest();
        emulator = new SetupEmulator();
//        nativeApp = new NativeAppPageObject(this.driver);
//        loginPage = new LoginPageObject(this.driver);
    }

//    @BeforeAll
//    public void beforeAll()throws Exception{
//        LOGGER.info(".....................BEFORE ALLLLL.................");
//        appiumService.start();
//    }

    @Before
    public void setup()throws Exception{
        appiumService.start();
        emulator.launch();
        Thread.sleep(30000);
        driver = emulator.initDriver();
        loginPage = new AndroidLoginPage(driver);
    }

    @Given("^I launch Mobile device$")
    public void startDeviceEmulator() {
//        loginTest.setUpDevice();
        LOGGER.info("NOTHING");
    }

    @When("^I swipe vertically the Device$")
    public void swipeVertically() {
        Utils.verticalSwipe(driver);
    }

    @When("^launch Huddle app$")
    public void launchHuddle() {
        nativeApp = new AndroidNativeAppPage(driver);
        nativeApp.openHuddle();
    }

    @When("^I enter the user name$")
    public void enterUserName() throws InterruptedException {
        Thread.sleep(10000);
        loginPage.enterUserName("qa.admin07@idt.net");
    }

    @When("^I enter the user password$")
    public void enterUserPassword() throws InterruptedException {
        Thread.sleep(10000);
        loginPage.enterPassword("idt12345");
    }

    @When("^I click on Next button$")
    public void clickUserName() throws InterruptedException {
        Thread.sleep(10000);
        loginPage.clickNextBtn();
    }

    @When("^I click on Next button after password entered$")
    public void clickPassword() throws InterruptedException {
        Thread.sleep(10000);
        loginPage.clickAfterPasswordEntered();
    }

    @Then("^I validate the user joined the meeting$")
    public void validateTHeAccountsValues() {
        LOGGER.info("END!!!");
    }

}
