package pomappiumautomation.page;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import pomappiumautomation.Util.Utilities;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.commands.BasicCommands;

public class ConduitLoginPage extends TestBase {

    public static String conduitLoginUsernameXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.EditText";
    public static String conduitLoginPasswordXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.EditText";
    public static String conduitAndroidLabelXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[1]";
    public static String conduitLoginButtonXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button";


    public static MobileElement getConduitLoginUsername() {
        return (MobileElement) loadDriver().findElementByXPath(conduitLoginUsernameXpath);
    }

    public static MobileElement getConduitLoginPassword() {
        return (MobileElement) loadDriver().findElementByXPath(conduitLoginPasswordXpath);
    }

    public static MobileElement getConduitLoginButton() {
        return (MobileElement) loadDriver().findElementByXPath(conduitLoginButtonXpath);
    }

    public static MobileElement getConduitLabelXpath() {
            return (MobileElement) loadDriver().findElementByXPath(conduitAndroidLabelXpath);
    }

    public static void validateConduitLogin() {
        BasicCommands.type(getConduitLoginUsername(), prop.getProperty("username"));
        BasicCommands.type(getConduitLoginPassword(), prop.getProperty("password"));
        BasicCommands.click(getConduitLoginButton());
        BasicCommands.waite(By.id(ConduitHomePage.conduitSavePasswordNeverButtonId), Utilities.DRWAIT_10SE);
        BasicCommands.click(ConduitHomePage.getConduitSavePasswordNeverButton());
        BasicCommands.waite(By.xpath(ConduitHomePage.conduitYourFeedXpath), Utilities.DRWAIT_10SE);
    }
}
