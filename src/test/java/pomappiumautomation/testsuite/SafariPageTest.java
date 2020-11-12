package pomappiumautomation.testsuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.page.ConduitLoginPage;
import pomappiumautomation.page.SafariPage;

import static org.testng.Assert.assertEquals;

public class SafariPageTest extends TestBase {

    @BeforeTest
    public void setUp() {

        initDriver("ios");
    }

    @Test
    public void verifySafariInit() throws InterruptedException {
        SafariPage.validateSafariInit();
//        assertEquals(ConduitLoginPage.getConduitLabelXpath("ios").getText(), "conduit");
    }

    @AfterTest
    public void tearDown() {
        loadDriver().closeApp();
    }
}
