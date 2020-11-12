package pomappiumautomation.testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.page.*;

import static org.testng.Assert.*;

public class ConduitLoginPageTest extends TestBase {

    @BeforeTest
    public void setUp() {

        initDriver("android");
    }

    @Test
    public void verifyConduitLogin() {
        ChromePage.validateChromeInit();
        ConduitLoginPage.validateConduitLogin();
        assertEquals(ConduitHomePage.getConduitYourFeed().getText(),"Your Feed");
        assertEquals(ConduitHomePage.getConduitGlobalFeed().getText(),"Global Feed");
    }

    @AfterTest
    public void tearDown() {
        loadDriver().closeApp();
    }
}
