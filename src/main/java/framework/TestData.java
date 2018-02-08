package framework;

import org.testng.annotations.DataProvider;

/**
 * Created by Senthil kumar
 */

public class TestData {

    String TEST_URL = "http://hotel-test.equalexperts.io/";

    // Test Data with All Valid details
    @DataProvider(name = "hotelbookingallvalidentry")
    public Object[][] hotelBookingDetails_tc1() {
        return new Object[][] {
                { "firstname100", "surname100", "100", "0", "2018-02-06", "2018-02-07", }
        };
    }

    // Test Data with Check-in date less than Check-out date
    @DataProvider(name = "hotelbookingentrywithdatevariation")
    public Object[][] hotelBookingDetails_tc2() {
        return new Object[][] {
                { "firstname101", "surname101", "101", "1", "2018-02-07", "2018-02-05", }
        };
    }

    // Test Data with All Special Characters
    @DataProvider(name = "hotelbookingallspecialcharentry")
    public Object[][] hotelBookingDetails_tc3() {
        return new Object[][] {
                { "!\"£$!¬", "!\"£$!¬", "!\"£$!¬", "0", "!\"£$!¬", "!\"£$!¬", }
        };
    }

    // Test Data with All Numeric
    @DataProvider(name = "hotelbookingallnumericentry")
    public Object[][] hotelBookingDetails_tc4() {
        return new Object[][] {
                { "12345", "12345", "12345", "0", "12345", "12345", }
        };
    }

}
