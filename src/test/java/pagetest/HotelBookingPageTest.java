package pagetest;

import pages.HotelBookingPage;

/**
 * Created by Senthil kumar
 */

public class HotelBookingPageTest {

    HotelBookingPage hotelbookingpage = new HotelBookingPage();

    // To enter all input for a row entry
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

    // To find total number of rows at present
    public int rowsPresent() throws InterruptedException {
        return hotelbookingpage.numberOfRowsPresent();
    }

    // To validate a row is added to exist list
    public void rowsValidation(int present, int lastest) throws InterruptedException {
        if((present+1) == lastest){
            System.out.println("One Row Entered Successful in Hotel Booking System");
        }else {
            System.out.println("No Rows added to Hotel Booking System");
        }
    }

    //To delete last row
    public void deleteLastRow() throws InterruptedException{
        hotelbookingpage.deleteLastRow();
    }

    // To validate a row is deleted from the list
    public void lastRowDeleteValidation(int present, int lastest) throws InterruptedException {
        if((present-1) == lastest){
            System.out.println("One Row Deleted Successful in Hotel Booking System");
        }else {
            System.out.println("No Rows Deleted to Hotel Booking System");
        }
    }

}
