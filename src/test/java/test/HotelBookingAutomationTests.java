package test;

import org.testng.annotations.Test;
import pagetest.HotelBookingPageTest;

/**
 * Created by Senthil kumar
 */

public class HotelBookingAutomationTests extends BaseTest {

    private HotelBookingPageTest hotelbookingpagetest = new HotelBookingPageTest();

    @Test(priority=1, description = "Hotel Booking - Test Scenario 01 - All valid input", dataProvider = "hotelbookingallvalidentry", enabled = true)
    public void testHotelBookingWithAllValidInput(String firstname,
                                                  String surname,
                                                  String price,
                                                  String depositpaid,
                                                  String checkindate,
                                                  String checkoutdate) throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Test Scenario 1 - Enter All Valid Input is executed");
        int presentRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.enterAllValidInput(firstname,
                                                surname,
                                                price,
                                                depositpaid,
                                                checkindate,
                                                checkoutdate);
        int latestRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.rowsValidation(presentRows, latestRows);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    @Test(priority=2, description = "Hotel Booking - Test Scenario 02 - Check-out date less than Check-in date", dataProvider = "hotelbookingentrywithdatevariation", enabled = true)
    public void testHotelBookingWithDateVariation (String firstname,
                                                  String surname,
                                                  String price,
                                                  String depositpaid,
                                                  String checkindate,
                                                  String checkoutdate) throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Test Scenario 2 - Enter Date Variation is executed");
        int presentRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.enterAllValidInput(firstname,
                                                surname,
                                                price,
                                                depositpaid,
                                                checkindate,
                                                checkoutdate);
        int latestRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.rowsValidation(presentRows, latestRows);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    @Test(priority=3, description = "Hotel Booking - Test Scenario 03 - All Special characters", dataProvider = "hotelbookingallspecialcharentry", enabled = true)
    public void testHotelBookingWithAllSpecialChars (String firstname,
                                                  String surname,
                                                  String price,
                                                  String depositpaid,
                                                  String checkindate,
                                                  String checkoutdate) throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Test Scenario 3 - Enter All Special Chars is executed");
        int presentRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.enterAllValidInput(firstname,
                                                surname,
                                                price,
                                                depositpaid,
                                                checkindate,
                                                checkoutdate);
        int latestRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.rowsValidation(presentRows, latestRows);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    //
    @Test(priority=4, description = "Hotel Booking - Test Scenario 04 - All Numeric values", dataProvider = "hotelbookingallnumericentry", enabled = true)
    public void testHotelBookingWithAllNumeric (String firstname,
                                                  String surname,
                                                  String price,
                                                  String depositpaid,
                                                  String checkindate,
                                                  String checkoutdate) throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Test Scenario 4 - Enter All Numeric values is executed");
        int presentRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.enterAllValidInput(firstname,
                                                surname,
                                                price,
                                                depositpaid,
                                                checkindate,
                                                checkoutdate);
        int latestRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.rowsValidation(presentRows, latestRows);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    @Test(priority=5, description = "Hotel Booking - Test Scenario 05 - Last Row Deleted", enabled = true)
    public void testDeleteLastRow () throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Test Scenario 5 - Last Row Deletion");
        int presentRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.deleteLastRow();
        int latestRows = hotelbookingpagetest.rowsPresent();
        hotelbookingpagetest.lastRowDeleteValidation(presentRows, latestRows);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
