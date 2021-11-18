package net.idt.n2p.huddle.pageObjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidFindBy

class NativeAppPageKt {
    internal var appiumDriver: AppiumDriver<MobileElement>? = null

    fun NativeAppPageObjectKt(){

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Huddle']")
    var huddleApp: MobileElement? = null

}