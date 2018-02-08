package pages;

import framework.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Senthil kumar
 */

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

    String rowCountElement = "div#bookings div.row";

    public HotelBookingPage() {
        this.driver();
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstname) {
        firstNameElement.clear();
        firstNameElement.sendKeys(firstname);
    }

    public void enterSurName(String surtname) {
        surNameElement.clear();
        surNameElement.sendKeys(surtname);
    }

    public void enterTotalPrice(String totalprice) {
        totalPriceElement.clear();
        totalPriceElement.sendKeys(totalprice);
    }

    public void enterDepositPaid(String depositpaid) {
        Select depositPaidSelect = new Select(depositPaidElement);
        depositPaidSelect.selectByIndex(Integer.parseInt(depositpaid));
    }

    public void enterCheckInDate(String checkindate) {
        checkInElement.clear();
        checkInElement.sendKeys(checkindate);
    }

    public void enterCheckOutDate(String checkoutdate) {
        checkOutElement.clear();
        checkOutElement.sendKeys(checkoutdate);
    }

    public void clickSaveButton() {
        saveButtonElement.click();
    }

    public int numberOfRowsPresent() throws InterruptedException {
        WebBrowser.getWebdriverWait();
        int numbers = driver.findElements(By.cssSelector(rowCountElement)).size();
        System.out.println("Total number of Rows -"+numbers);
        return numbers;
    }

    public void deleteLastRow() throws InterruptedException {
        int existingRows = numberOfRowsPresent();
        String lastestRow = "div#bookings > div:nth-of-type("+(existingRows)+") > div:nth-of-type(7)";
        driver.findElement(By.cssSelector(lastestRow)).click();
    }

}
