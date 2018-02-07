package framework;

import org.testng.annotations.DataProvider;

public class TestData {

    String TEST_URL = "http://hotel-test.equalexperts.io/";

    @DataProvider(name = "hotelbookingentries")
    public Object[][] hotelBookingDetails() {
        return new Object[][] {
                { "firstname100", "surname100", "1000", "0", "2018-02-06", "2018-02-07", },
                { "firstname101", "surname101", "1001", "1", "2018-02-05", "2018-02-06", }
        };
    }

}
