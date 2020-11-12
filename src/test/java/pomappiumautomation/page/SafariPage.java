package pomappiumautomation.page;

import org.openqa.selenium.By;
import pomappiumautomation.Util.Utilities;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.commands.BasicCommands;

public class SafariPage extends TestBase {

    public static void validateSafariInit() throws InterruptedException {
        loadDriver().get("https://react-redux.realworld.io/#/login");
//        BasicCommands.waite(By.xpath(ConduitLoginPage.conduitIOSLabelXpath), Utilities.DRWAIT_10SE);
    }


}
