import framework.TestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Senthil kumar
 */

public class BaseTest extends TestData{

    @BeforeMethod
    public static void beforeTest() {
        System.out.println("Hotel Booking Test Started");
    }

    @AfterMethod
    public static void afterTest() {
        System.out.println("Hotel Booking Test finished");
    }
}
