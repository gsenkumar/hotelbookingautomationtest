package pages;

import framework.WebBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPage extends WebBrowser {

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstNameElement;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement surNameElement;

    @FindBy(how = How.ID, using = "totalprice")
    private WebElement totalPriceElement;

    @FindBy(how = How.ID, using = "depositpaid")
    private WebElement depositPaidElement;

    @FindBy(how = How.ID, using = "checkin")
    private WebElement checkInElement;

    @FindBy(how = How.ID, using = "checkout")
    private WebElement checkOutElement;

    @FindBy(how = How.CSS, using = "input[value=' Save ']")
    private WebElement saveButtonElement;

    public HotelBookingPage() {
        this.driver();
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstname) {
        firstNameElement.sendKeys(firstname);
    }

    public void enterSurName(String surtname) {
        surNameElement.sendKeys(surtname);
    }

    public void enterTotalPrice(String totalprice) {
        totalPriceElement.sendKeys(totalprice);
    }

    public void enterDepositPaid(String depositpaid) {
        Select depositPaidSelect = new Select(depositPaidElement);
        depositPaidSelect.selectByIndex(Integer.parseInt(depositpaid));
    }

    public void enterCheckInDate(String checkindate) {
        checkInElement.sendKeys(checkindate);
    }

    public void enterCheckOutDate(String checkoutdate) {
        checkOutElement.sendKeys(checkoutdate);
    }

    public void clickSaveButton() {
        saveButtonElement.click();
    }


}
