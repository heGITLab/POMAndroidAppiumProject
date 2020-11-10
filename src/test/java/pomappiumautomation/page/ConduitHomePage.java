package pomappiumautomation.page;

import io.appium.java_client.MobileElement;
import pomappiumautomation.base.TestBase;

public class ConduitHomePage extends TestBase {

    public static String conduitGlobalFeedXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View";
    public static String conduitYourFeedXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.widget.ListView/android.view.View[1]/android.view.View";
    public static String conduitSavePasswordNeverButtonId = "com.android.chrome:id/button_secondary";


    public static MobileElement getConduitSavePasswordNeverButton() {
        return (MobileElement) loadDriver().findElementById(conduitSavePasswordNeverButtonId);
    }

    public static MobileElement getConduitYourFeed() {
        return (MobileElement) loadDriver().findElementByXPath(conduitYourFeedXpath);
    }

    public static MobileElement getConduitGlobalFeed() {
        return (MobileElement) loadDriver().findElementByXPath(conduitGlobalFeedXpath);
    }

}
