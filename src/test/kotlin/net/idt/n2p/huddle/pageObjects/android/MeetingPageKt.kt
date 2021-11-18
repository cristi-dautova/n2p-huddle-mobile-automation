package net.idt.n2p.huddle.pageObjects

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.AndroidBy
import io.appium.java_client.pagefactory.AndroidFindAll
import io.appium.java_client.pagefactory.AndroidFindBy

class MeetingPageKt {
    internal var appiumDriver: AppiumDriver<MobileElement>? = null

    fun MeetingPageObjectKt(){

    }

    @AndroidFindBy(accessibility = "Navigate up")
    var navigate_back: MobileElement? = null

    //@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    var okbutton: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.Button[@text='GO TO SETTINGS']")
    var settingsButton: MobileElement? = null

    @AndroidFindBy(accessibility = "Back")
    var backButton: MobileElement? = null

    // @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2' and @text='NO, THANKS.']")
    @AndroidFindBy(xpath = "//android.widget.Button[@text='NO, THANKS.']")
    var nothanksbutton: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Top Stories']")
    var topstories: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My News']")
    var mynews: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Popular']")
    var popular: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Video']")
    var video: MobileElement? = null

    @AndroidFindBy(accessibility = "Search")
    var searchbutton: MobileElement? = null

    @AndroidFindBy(accessibility = "Share story")
    var sharestory: MobileElement? = null

    @AndroidFindAll(AndroidBy(id = "bbc.mobile.news.uk.internal:id/action_search"), AndroidBy(accessibility = "Search"))
    var search: MobileElement? = null

    @AndroidFindBy(accessibility = "Show navigation menu drawer")
    var menubutton: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Settings']")
    var settings: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='App info']")
    var Appinfo: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Other BBC apps']")
    var OtherBBCapps: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Internal Settings']")
    var InternalSettings: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search topics and articles']")
    var searchfield: MobileElement? = null

    //  @AndroidFindBy(id = "bbc.mobile.news.uk.internal:id/heading")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'bbc.mobile.news.uk.internal:id/heading') and @index='0']")
    //@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'bbc.mobile.news.uk.internal:id/content_card_ordered_badge') and @text='1']")
    var searchheading: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='bbc.mobile.news.uk.internal:id/heading' and @index='2']")
    var searchheading2: MobileElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='bbc.mobile.news.uk.internal:id/heading' and @index='4']")
    var searchheading4: MobileElement? = null

    @AndroidFindBy(xpath = "//bbc.mobile.news.uk.internal:id/chip_item[@index='1']")
    var searchsuggest1: MobileElement? = null
    var searchsuggest1_text = "India"

    @AndroidFindBy(xpath = "//bbc.mobile.news.uk.internal:id/chip_item[@index='2']")
    var searchsuggest2: MobileElement? = null
    var searchsuggest2_text = "India-Pakistan independence"

    @AndroidFindBy(xpath = "//bbc.mobile.news.uk.internal:id/chip_item[@index='3']")
    var searchsuggest3: MobileElement? = null
    var searchsuggest3_text = "Rape in India"

    @AndroidFindBy(accessibility = "Cancel search")
    var cancelSearch: MobileElement? = null

    var SubDirectory = "Screenshots"

    var ScreenshotPaths: String? = null



}