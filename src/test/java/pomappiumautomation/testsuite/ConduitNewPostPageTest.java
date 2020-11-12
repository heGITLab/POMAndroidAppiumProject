package pomappiumautomation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import pomappiumautomation.Util.Utilities;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.commands.BasicCommands;
import pomappiumautomation.datareader.Reader;
import pomappiumautomation.page.ChromePage;
import pomappiumautomation.page.ConduitHomePage;
import pomappiumautomation.page.ConduitLoginPage;
import pomappiumautomation.page.ConduitNewPostPage;

import static org.testng.Assert.assertEquals;

public class ConduitNewPostPageTest extends TestBase {

    Reader rd = new Reader();

    @BeforeMethod
    public void setUp() {

        initDriver("android");
    }

    @DataProvider(name = "conduitData")
    public Object[][] loadData() {

        Object[][] obArr = null;
        obArr = rd.getData();
        return obArr;

    }

    @Test(dataProvider = "conduitData", priority = 0)
    public void verifyConduitLogin(String title, String about, String article, String tags, String comment) {
        ChromePage.validateChromeInit();
        ConduitLoginPage.validateConduitLogin();
        ConduitHomePage.validateNavigationConduitNewPost();
        ConduitNewPostPage.validateConduitNewPost(title, about, article, tags, comment);

        if (title.equalsIgnoreCase("TestAp2") && comment.equalsIgnoreCase("TestAp Comment2")) {
            assertEquals(ConduitNewPostPage.getConduitNPPublishedTitleLabel().getText(), "TestAp2");
            assertEquals(ConduitNewPostPage.getConduitNPPublishedCommentXpath().getText(), "TestAp Comment2");
        }
    }

    @AfterMethod
    public void tearDown() {
        loadDriver().closeApp();
    }

}
