package test;

import framework.TestData;
import framework.WebBrowser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Senthil kumar
 */

public class BaseTest extends TestData{

    @BeforeTest
    public static void beforeTest() {
        System.out.println("Hotel Booking Test Started");
        WebBrowser.getCurrentUrl();
        WebBrowser.getTitle();
    }

    @AfterTest
    public static void afterTest() {
        System.out.println("Hotel Booking Test finished");
        WebBrowser.closeBrowser();
    }
}
