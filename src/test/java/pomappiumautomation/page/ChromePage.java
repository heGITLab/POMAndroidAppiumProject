package pomappiumautomation.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import pomappiumautomation.Util.Utilities;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.commands.BasicCommands;

public class ChromePage extends TestBase {

    public static String chromeTermAcceptId = "com.android.chrome:id/terms_accept";
    public static String chromeSignInNoThanksId = "com.android.chrome:id/negative_button";
    public static String chromeSearchBoxId = "com.android.chrome:id/search_box_text";
    public static String chromeDataSaverNextButtonId = "com.android.chrome:id/next_button";

    public static MobileElement getChromeSearchBox() {
        return (MobileElement) loadDriver().findElementById(chromeSearchBoxId);
    }

    public static MobileElement getChromeTermAccept() {
        return (MobileElement) loadDriver().findElementById(chromeTermAcceptId);
    }

    public static MobileElement getchromeSignInNoThanks() {
        return (MobileElement) loadDriver().findElementById(chromeSignInNoThanksId);
    }

    public static MobileElement getChromeDataSaverNextButton() {
        return (MobileElement) loadDriver().findElementById(chromeDataSaverNextButtonId);
    }

    public static void validateChromeInit() {
        BasicCommands.click(getChromeTermAccept());
        BasicCommands.waite(By.id(chromeDataSaverNextButtonId), Utilities.DRWAIT_10SE);
        BasicCommands.click(getChromeDataSaverNextButton());
        BasicCommands.waite(By.id(chromeSignInNoThanksId), Utilities.DRWAIT_10SE);
        BasicCommands.click(getchromeSignInNoThanks());
        BasicCommands.waite(By.id(chromeSearchBoxId), Utilities.DRWAIT_10SE);
        BasicCommands.type(getChromeSearchBox(),"https://react-redux.realworld.io/#/login");
        ((AndroidDriver)loadDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
        BasicCommands.waite(By.xpath(ConduitLoginPage.conduitLabelXpath), Utilities.DRWAIT_10SE);
    }


}
