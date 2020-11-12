package pomappiumautomation.testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.page.ChromePage;
import pomappiumautomation.page.ConduitLoginPage;

import static org.testng.Assert.*;

public class ChromePageTest extends TestBase {

    @BeforeTest
    public void setUp() {

        initDriver("android");
    }

    @Test
    public void verifyChromeInit() {
        ChromePage.validateChromeInit();
        assertEquals(ConduitLoginPage.getConduitLabelXpath().getText(), "conduit");
    }

    @AfterTest
    public void tearDown() {
        loadDriver().closeApp();
    }
}
