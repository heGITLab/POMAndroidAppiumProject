package pomappiumautomation.commands;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pomappiumautomation.base.TestBase;

public class BasicCommands extends TestBase{

    public static void click(MobileElement element) {
        element.click();
    }

    public static void type(MobileElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void waite(By element, long Seco) {
        WebDriverWait wait = new WebDriverWait(loadDriver(), Seco);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
}
