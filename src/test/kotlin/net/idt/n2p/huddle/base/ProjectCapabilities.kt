package net.idt.n2p.base

import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities

class ProjectCapabilities {
    companion object {
        fun androidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("platformName", "Android")
            caps.setCapability("appium:deviceName", "sdk_gphone_x86")
            caps.setCapability("appium:platformVersion", 11)
//            caps.setCapability("appium:app", "C:\\Users\\rcorrea\\Downloads\\huddle.apk")
            caps.setCapability("appium:automationName", "UiAutomator2")

            caps.setCapability("appium:appPackage", "com.net2phone.huddle")
            caps.setCapability("appium:appActivity", ".MainActivity")

//            caps.setCapability("newCommandTimeout", 120)
            return caps
        }
    }
}
