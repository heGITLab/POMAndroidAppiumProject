package AppiumAutomationMain;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.*;

public class AppiumScriptIOS {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        dc.setCapability(MobileCapabilityType.APP, "/Users/harindaekanayake/Library/Developer/Xcode/DerivedData/UICatalog-fbyiojugtyskdefrkytszdbqilgr/Build/Products/Debug-iphonesimulator/UICatalog.app");

        IOSDriver<IOSElement> iOSD = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub/"), dc);

        MobileElement el1 = (MobileElement) iOSD.findElementByXPath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]");
        el1.click();
        MobileElement el2 = (MobileElement) iOSD.findElementByAccessibilityId("Okay / Cancel");
        el2.click();
        MobileElement el3 = (MobileElement) iOSD.findElementByAccessibilityId("OK");
        el3.click();
        MobileElement el4 = (MobileElement) iOSD.findElementByAccessibilityId("Simple");

        assertEquals(el4.getText(), "Simple");
    }
}
