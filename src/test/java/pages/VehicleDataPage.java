package pages;

import bases.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDataPage extends PageBase {

    // Locators

    @FindBy(id = "make")
    private WebElement drpMake;

    @FindBy(id = "model")
    private WebElement drpModel;

    @FindBy(id = "cylindercapacity")
    private WebElement fldCylinderCap;

    @FindBy(id = "engineperformance")
    private WebElement fldEnginePerf;

    @FindBy(id = "dateofmanufacture")
    private WebElement fldManufDate;

    @FindBy(id = "numberofseats")
    private WebElement drpNumberSeats;

    @FindBy(id = "numberofseatsmotorcycle")
    private WebElement drpNumberSeatsMotor;

    @FindBy(xpath = "//label/input[@id='righthanddriveyes']/following-sibling::span")
    private WebElement rdbRHandDriveYes;

    @FindBy(xpath = "//label/input[@id='righthanddriveno']/following-sibling::span")
    private WebElement rdbRHandDriveNo;

    @FindBy(id = "fuel")
    private WebElement drpFuelType;

    @FindBy(id = "payload")
    private WebElement fldPayload;

    @FindBy(id = "totalweight")
    private WebElement fldTotalWeight;

    @FindBy(id = "listprice")
    private WebElement fldListPrice;

    @FindBy(id = "licenseplatenumber")
    private WebElement fldLicensePlate;

    @FindBy(id = "annualmileage")
    private WebElement fldAnnualMileage;

    @FindBy(id = "nextenterinsurantdata")
    private WebElement btnNext;

    // Actions

    public void selectDrpMake(String text) {
        select(drpMake, text);
    }

    public void selectDrpModel(String text) {
        select(drpModel, text);
    }

    public void typeFldCylinderCap(String text) {
        type(fldCylinderCap, text);
    }

    public void typeFldEnginePerf(String text) {
        type(fldEnginePerf, text);
    }

    public void typeFldManufDate(String text) {
        type(fldManufDate, text);
    }

    public void selectDrpNumberSeats(String text) {
        select(drpNumberSeats, text);
    }

    public void selectDrpNumberSeatsMotor(String text) {
        select(drpNumberSeatsMotor, text);
    }

    public void clickRdbRHandDrive(String text) {
        if(text.equalsIgnoreCase("yes"))
            click(rdbRHandDriveYes);
        else
            click(rdbRHandDriveNo);
    }

    public void selectDrpFuelType(String text) {
        select(drpFuelType, text);
    }

    public void typeFldPayload(String text) {
        type(fldPayload, text);
    }

    public void typeFldTotalWeight(String text) {
        type(fldTotalWeight, text);
    }

    public void typeFldListPrice(String text) {
        type(fldListPrice, text);
    }

    public void typeFldLicensePlate(String text) {
        type(fldLicensePlate, text);
    }

    public void typeFldAnnualMileage(String text) {
        type(fldAnnualMileage, text);
    }

    public void clickBtnNext() {
        click(btnNext);
    }




}
