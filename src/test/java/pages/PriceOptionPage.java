package pages;

import bases.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceOptionPage extends PageBase {

    // Locators

    @FindBy(xpath = "//label/input[@id='selectsilver']/following-sibling::span")
    private WebElement rdbSelectSilver;

    @FindBy(xpath = "//label/input[@id='selectgold']/following-sibling::span")
    private WebElement rdbSelectGold;

    @FindBy(xpath = "//label/input[@id='selectplatinum']/following-sibling::span")
    private WebElement rdbSelectPlatinum;

    @FindBy(xpath = "//label/input[@id='selectultimate']/following-sibling::span")
    private WebElement rdbSelectUltimate;

    @FindBy(id = "nextsendquote")
    private WebElement btnNext;

    // Actions

    public void clickRdbPriceOption(String text) {
        switch(text) {
            case "Silver":      click(rdbSelectSilver);
                                break;
            case "Gold":        click(rdbSelectGold);
                                break;
            case "Platinum":    click(rdbSelectPlatinum);
                                break;
            case "Ultimate":    click(rdbSelectUltimate);
                                break;
            default:            System.err.println("INVALID PRICE OPTION VALUE");
        }
    }

    public void clickBtnNext() {
        click(btnNext);
    }

}
