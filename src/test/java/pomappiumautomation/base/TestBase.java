package pomappiumautomation.base;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestBase {

    public static MobileDriver<MobileElement> driver;
    public static Properties prop;

    public static Properties loadProperty() {

        try {

            prop = new Properties();
            FileInputStream path = new FileInputStream("/Users/harindaekanayake/IdeaProjects/AndroidAppiumProject/src/test/java/pomappiumautomation/config/config.properties");
            prop.load(path);

        } catch (IOException e) {

            e.printStackTrace();

        }

        return prop;
    }

    public static void initDriver(String os) {

        try {
            DesiredCapabilities dc = new DesiredCapabilities();

            if (os.equalsIgnoreCase("android")) {
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
                dc.setCapability("platformName", "android");
                dc.setCapability("appPackage", "com.android.chrome");
                dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
                dc.setCapability("unicodeKeyboard","true");
                dc.setCapability("resetKeyboard","true");

                driver = new AndroidDriver<MobileElement>(new URL(loadProperty().getProperty("appiumUrl")), dc);

            } else if (os.equalsIgnoreCase("ios")) {
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                dc.setCapability(MobileCapabilityType.APP, "com.google.android.apps.chrome.Main");

                driver = new IOSDriver<MobileElement>(new URL(loadProperty().getProperty("appiumUrl")), dc);

            } else {

                System.out.println("Please select either 'ios' or 'android'");

            }
        } catch (MalformedURLException e) {

            e.printStackTrace();

        }

    }

    public static MobileDriver loadDriver() {
        return driver;
    }
}
