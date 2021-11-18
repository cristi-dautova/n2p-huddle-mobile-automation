package net.idt.n2p.tests

import net.idt.n2p.base.ProjectCapabilities
import net.idt.n2p.base.TestBaseKt
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.Test

class LoginTestKt: TestBaseKt() {
    override var caps: DesiredCapabilities? = ProjectCapabilities.androidBaseCapabilities()

    @Test
    fun loginApp() {


//        val wait = WebDriverWait(driver?.let { it }, 30)
//
//        UtilsKt.verticalSwipe(driver!!)
//
//        val launchHuddle = driver?.findElementByXPath("//android.widget.TextView[@content-desc=\"Huddle\"]")
//        launchHuddle?.click()
//
//        Thread.sleep(10000)
//
//        val loginName: MobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.ByXPath("//android.widget.EditText[@resource-id='email']"))) as MobileElement
//        val nextButton: MobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.ByXPath("//android.widget.Button[@text='NEXT']"))) as MobileElement
//        loginName.setValue("qa.admin07@idt.net")
//        nextButton.click()
//
//        val passwordName: MobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.ByXPath("//android.widget.EditText[@resource-id='password']"))) as MobileElement
//        val nextPassButton: MobileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.ByXPath("//android.widget.Button[@text='LOGIN']"))) as MobileElement
//        passwordName.setValue("idt12345")
//        nextPassButton.click();


    }

}

