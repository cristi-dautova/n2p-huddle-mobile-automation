package net.idt.n2p.base

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.service.local.AppiumDriverLocalService
import io.appium.java_client.service.local.AppiumServiceBuilder
import org.openqa.selenium.remote.DesiredCapabilities

import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import java.io.BufferedReader
import java.io.File
import java.io.IOException
import java.io.InputStreamReader
import java.lang.Exception
import java.net.URL
import java.util.*
import kotlin.system.exitProcess

const val PORT = 4723
const val APPIUM_SERVICE = "C:\\Users\\rcorrea\\AppData\\Roaming\\npm\\node_modules\\appium"
const val NODEJS_SERVICE = "C:\\Program Files\\nodejs\\node.exe"
const val LOCALHOST_ADDRESS = "127.0.0.1"
const val APPIUM_ADDRESS = "http://127.0.0.1"

open class TestBaseKt {
    protected var driver: AndroidDriver<MobileElement>? = null
    protected open var caps: DesiredCapabilities? = null
    private val webDriverURL: URL = URL("${APPIUM_ADDRESS}:${PORT}/wd/hub")
    private val serviceBuilder = AppiumServiceBuilder()
    lateinit var service: AppiumDriverLocalService

    @BeforeClass
    fun setUp() {
        serviceBuilder.withIPAddress(LOCALHOST_ADDRESS).usingPort(PORT)
        serviceBuilder.usingDriverExecutable(File(NODEJS_SERVICE))
        serviceBuilder.withAppiumJS(File(APPIUM_SERVICE))

        service = AppiumDriverLocalService.buildService(serviceBuilder)
        try {
            Runtime.getRuntime().exec("emulator @Pixel_XL_API_30")
            service.start()
            Thread.sleep(30000)
//            val process3 = Runtime.getRuntime().exec("adb shell am start -n package:com.net2phone.huddle")
        }
        catch (e:Exception) {
            println("--------------------------------------------------------------")
        }

        this.driver = AndroidDriver(webDriverURL, caps)
//        this.driver = AndroidDriver(caps)
    }

    @AfterClass
    fun tearDown() {
        try {
            this.driver?.quit() ?: throw Exception("Driver instance was unable to quit.")
            service.stop()
            // Kill previous PORT used process
            Runtime.getRuntime().exec("taskkill /F /IM node.exe")
            Runtime.getRuntime().exec("adb kill-server")
        }
        catch (e:Exception) {
            println("----------------------------ERROR STOPPING----------------------------------")
        }
    }
}