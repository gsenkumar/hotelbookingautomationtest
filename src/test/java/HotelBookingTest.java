import org.testng.annotations.Test;
import pages.HotelBookingPage;

/**
 * Created by Senthil kumar
 */

public class HotelBookingTest extends BaseTest {

    HotelBookingPage hotelbookingpage = new HotelBookingPage();

    @Test(dataProvider = "hotelbookingentries")
    public void enterAllValidInput(String firstname,
                                   String surname,
                                   String price,
                                   String depositpaid,
                                   String checkindate,
                                   String checkoutdate){
        hotelbookingpage.enterFirstName(firstname);
        hotelbookingpage.enterSurName(surname);
        hotelbookingpage.enterTotalPrice(price);
        hotelbookingpage.enterDepositPaid(depositpaid);
        hotelbookingpage.enterCheckInDate(checkindate);
        hotelbookingpage.enterCheckOutDate(checkoutdate);
        hotelbookingpage.clickSaveButton();
    }

}
