package net.idt.n2p.huddle.pageObjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy

class LoginPageKt {
    internal var appiumDriver: AppiumDriver<MobileElement>? = null

    fun LoginPageObjectKt(){

    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='email']")
    var loginName: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")
    var nextLoginButton: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='password']")
    var passwordName: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
    var nextPasswordButton: MobileElement? = null

}