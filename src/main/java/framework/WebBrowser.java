package framework;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by Senthil kumar
 */

public class WebBrowser extends TestData {

    public static WebDriver driver;

    public WebDriver driver() {
        driver = new FirefoxDriver();
        navigateTo(TEST_URL);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
        return driver;
    }

    public static void closeBrowser() {
        driver.close();
    }

    public static void navigateTo(final String url) {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void getWebdriverWait() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void getTitle() {
        System.out.println("Title of the Page -> "+driver.getTitle());
    }

    public static void pageRefresh() {
        driver.navigate().refresh();
    }

    public static void getCurrentUrl() {
        System.out.println("Navigate to Current URL -> "+driver.getCurrentUrl());
    }

}
