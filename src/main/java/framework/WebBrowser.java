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
        driver.manage().window().maximize();
        driver.get(TEST_URL);
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
    public static String getTitle() {
        return driver.getTitle();
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isElementPresentOnScreen(By locator) {
        try {
            driver().findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
