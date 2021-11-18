package net.idt.n2p.utils

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption
import net.idt.n2p.base.PlatformTouchActionKt
import java.time.Duration

class UtilsKt {
    companion object {

        fun verticalSwipe(driver: AppiumDriver<MobileElement?>) {
            val dimension = driver.manage().window().size
            val height = dimension.getHeight()
            val width = dimension.getWidth()
            val startX = width / 2
            val startY = (height * 0.75).toInt()
            val endY = (height * 0.35).toInt()

            PlatformTouchActionKt(driver as AppiumDriver<MobileElement>)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(startX, endY)).release().perform()
        }

        fun horizontalSwipe(driver: AppiumDriver<MobileElement?>) {
            val dimension = driver.manage().window().size
            val height = dimension.getHeight()
            val width = dimension.getWidth()
            val startXaxis = (width * 0.90).toInt()
            val Yaxis = (height * 0.20).toInt()
            val endXaxis = (width * 0.10).toInt()

            PlatformTouchActionKt(driver as AppiumDriver<MobileElement>)
                .press(PointOption.point(startXaxis, Yaxis))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(startXaxis, endXaxis)).release().perform()
        }
    }

}