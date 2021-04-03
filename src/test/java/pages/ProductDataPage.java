package pages;

import bases.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDataPage extends PageBase {

    // Locators

    @FindBy(id = "startdate")
    private WebElement fldStartDate;

    @FindBy(id = "insurancesum")
    private WebElement drpInsuranceSum;

    @FindBy(id = "meritrating")
    private WebElement drpMeritRating;

    @FindBy(id = "damageinsurance")
    private WebElement drpDamageInsurance;

    @FindBy(xpath = "//label[contains(.,'Euro Protection')]/span")
    private WebElement chkEuroProtection;

    @FindBy(xpath = "//label[contains(.,'Legal Defense Insurance')]/span")
    private WebElement chkLegalDefenseInsurance;

    @FindBy(id = "courtesycar")
    private WebElement drpCourtesyCar;

    @FindBy(id = "nextselectpriceoption")
    private WebElement btnNext;

    // Actions

    public void typeFldStartDate(String text) {
        type(fldStartDate, text);
    }

    public void selectDrpInsuranceSum(String text) {
        select(drpInsuranceSum, text);
    }

    public void selectDrpMeritRating(String text) {
        select(drpMeritRating, text);
    }

    public void selectDrpDamageInsurance(String text) {
        select(drpDamageInsurance, text);
    }

    public void clickChkEuroProtection(String text) {
        if(text.equalsIgnoreCase("true"))
            click(chkEuroProtection);
    }

    public void clickChkLegalDefenseInsurance(String text) {
        if(text.equalsIgnoreCase("true"))
            click(chkLegalDefenseInsurance);
    }

    public void selectDrpCourtesyCar(String text) {
        select(drpCourtesyCar, text);
    }

    public void clickBtnNext() {
        click(btnNext);
    }

}
