package pomappiumautomation.page;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import pomappiumautomation.Util.Utilities;
import pomappiumautomation.base.TestBase;
import pomappiumautomation.commands.BasicCommands;

public class ConduitNewPostPage extends TestBase {

    public static String conduitNPArticleTitleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText";
    public static String conduitNPArticleAboutXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
    public static String conduitNPArticleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText";
    public static String conduitNPEnterTagsXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.widget.EditText";
    public static String conduitNPPublishArticleButtonXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.Button";
    public static String conduitNPPublishedTitleLabelXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[2]";
    public static String conduitNPCommentXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[6]/android.view.View/android.widget.EditText";
    public static String conduitNPPublishCommentButtonXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[6]/android.view.View/android.widget.Button";
    public static String conduitNPPublishedCommentXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[6]/android.view.View[2]/android.view.View[1]";

    public static MobileElement getConduitNPArticleTitle() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPArticleTitleXpath);
    }

    public static MobileElement getConduitNPArticleAbout() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPArticleAboutXpath);
    }

    public static MobileElement getConduitNPArticle() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPArticleXpath);
    }

    public static MobileElement getConduitNPEnterTags() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPEnterTagsXpath);
    }

    public static MobileElement getConduitNPPublishArticleButton() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPPublishArticleButtonXpath);
    }

    public static MobileElement getConduitNPPublishedTitleLabel() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPPublishedTitleLabelXpath);
    }

    public static MobileElement getConduitNPComment() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPCommentXpath);
    }

    public static MobileElement getConduitNPPublishCommentButton() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPPublishCommentButtonXpath);
    }

    public static MobileElement getConduitNPPublishedCommentXpath() {
        return (MobileElement) loadDriver().findElementByXPath(conduitNPPublishedCommentXpath);
    }

    public static void validateConduitNewPost(String title, String about, String article, String tags, String comment) {
        BasicCommands.type(getConduitNPArticleTitle(), title);
        BasicCommands.type(getConduitNPArticleAbout(), about);
        BasicCommands.type(getConduitNPArticle(), article);
        BasicCommands.type(getConduitNPEnterTags(), tags);
        BasicCommands.click(getConduitNPPublishArticleButton());
        BasicCommands.waite(By.xpath(ConduitNewPostPage.conduitNPCommentXpath), Utilities.DRWAIT_10SE);
        BasicCommands.type(getConduitNPComment(), comment);
        BasicCommands.click(getConduitNPPublishCommentButton());
        BasicCommands.waite(By.xpath(ConduitNewPostPage.conduitNPPublishedCommentXpath), Utilities.DRWAIT_10SE);
    }
}
