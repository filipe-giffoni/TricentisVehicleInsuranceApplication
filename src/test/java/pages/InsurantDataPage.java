package pages;

import bases.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsurantDataPage extends PageBase {

    // Locators

    @FindBy(id = "firstname")
    private WebElement fldFirstName;

    @FindBy(id = "lastname")
    private WebElement fldLastName;

    @FindBy(id = "birthdate")
    private WebElement fldBirthDate;

    @FindBy(xpath = "//label/input[@id='gendermale']/following-sibling::span")
    private WebElement rdbGenderMale;

    @FindBy(xpath = "//label/input[@id='genderfemale']/following-sibling::span")
    private WebElement rdbGenderFemale;

    @FindBy(id = "streetaddress")
    private WebElement fldStreetAddress;

    @FindBy(id = "country")
    private WebElement drpCountry;

    @FindBy(id = "zipcode")
    private WebElement fldZipCode;

    @FindBy(id = "city")
    private WebElement fldCity;

    @FindBy(id = "occupation")
    private WebElement drpOccupation;

    @FindBy(xpath = "//label/input[@id='speeding']/following-sibling::span")
    private WebElement chkSpeeding;

    @FindBy(xpath = "//label/input[@id='bungeejumping']/following-sibling::span")
    private WebElement chkBungeeJumping;

    @FindBy(xpath = "//label/input[@id='cliffdiving']/following-sibling::span")
    private WebElement chkCliffDiving;

    @FindBy(xpath = "//label/input[@id='skydiving']/following-sibling::span")
    private WebElement chkSkydiving;

    @FindBy(xpath = "//label/input[@id='other']/following-sibling::span")
    private WebElement chkOther;

    @FindBy(id = "website")
    private WebElement fldWebsite;

    @FindBy(id = "nextenterproductdata")
    private WebElement btnNext;

    // Actions

    public void typeFldFirstName(String text) {
        type(fldFirstName, text);
    }

    public void typeFldLastName(String text) {
        type(fldLastName, text);
    }

    public void typeFldBirthDate(String text) {
        type(fldBirthDate, text);
    }

    public void clickRdbGender(String text) {
        if(text.equalsIgnoreCase("male"))
            click(rdbGenderMale);
        else
            click(rdbGenderFemale);
    }

    public void typeFldStreetAddress(String text) {
        type(fldStreetAddress, text);
    }

    public void selectDrpCountry(String text) {
        select(drpCountry, text);
    }

    public void typeFldZipCode(String text) {
        type(fldZipCode, text);
    }

    public void typeFldCity(String text) {
        type(fldCity, text);
    }

    public void selectDrpOccupation(String text) {
        select(drpOccupation, text);
    }

    public void clickChkSpeeding(String text) {
        if(text.equalsIgnoreCase("true"))
            click(chkSpeeding);
    }

    public void clickChkBungeeJumping(String text) {
        if(text.equalsIgnoreCase("true"))
            click(chkBungeeJumping);
    }

    public void clickChkCliffDiving(String text) {
        if(text.equalsIgnoreCase("true"))
            click(chkCliffDiving);
    }

    public void clickChkSkydiving(String text) {
        if(text.equalsIgnoreCase("true"))
            click(chkSkydiving);
    }

    public void clickChkOther(String text) {
        if(text.equalsIgnoreCase("true"))
            click(chkOther);
    }

    public void typeFldWebsite(String text) {
        type(fldWebsite, text);
    }

    public void clickBtnNext() {
        click(btnNext);
    }






}
