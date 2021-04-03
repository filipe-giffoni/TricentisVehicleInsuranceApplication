package pages;

import bases.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    // Locators

    @FindBy(id = "nav_automobile")
    private WebElement lnkAuto;

    @FindBy(id = "nav_truck")
    private WebElement lnkTruck;

    @FindBy(id = "nav_motorcycle")
    private WebElement lnkMotorcycle;

    @FindBy(id = "nav_camper")
    private WebElement lnkCamper;

    // Actions

    public void clickLnkAuto() {
        click(lnkAuto);
    }

    public void clickLnkTruck() {
        click(lnkTruck);
    }

    public void clickLnkMotorcycle() {
        click(lnkMotorcycle);
    }

    public void clickLnkCamper() {
        click(lnkCamper);
    }

}