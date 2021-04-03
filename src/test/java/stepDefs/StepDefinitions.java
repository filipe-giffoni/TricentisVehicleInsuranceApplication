package stepDefs;

import bases.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class StepDefinitions {

    @Given("the website is loaded")
    public void the_website_is_loaded() {
        TestBase.startDriver();
    }

    @When("I click on Automobile")
    public void i_click_on_automobile() {
        HomePage hp = new HomePage();
        hp.clickLnkAuto();
    }

    @When("I click on Truck")
    public void i_click_on_truck() {
        HomePage hp = new HomePage();
        hp.clickLnkTruck();
    }

    @When("I click on Motorcycle")
    public void i_click_on_motorcycle() {
        HomePage hp = new HomePage();
        hp.clickLnkMotorcycle();
    }

    @When("I click on Camper")
    public void i_click_on_camper() {
        HomePage hp = new HomePage();
        hp.clickLnkCamper();
    }

    // Automobile Insurance Application Flow
    @When("I fill out Vehicle Data with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_vehicle_data_with(String make, String engPerf, String manDate, String numSeats, String fuelType, String listPrice, String licenPlate, String annMileage) throws InterruptedException {
        VehicleDataPage vdp = new VehicleDataPage();

        vdp.selectDrpMake(make);
        vdp.typeFldEnginePerf(engPerf);
        vdp.typeFldManufDate(manDate);
        vdp.selectDrpNumberSeats(numSeats);
        vdp.selectDrpFuelType(fuelType);
        vdp.typeFldListPrice(listPrice);
        vdp.typeFldLicensePlate(licenPlate);
        vdp.typeFldAnnualMileage(annMileage);

        vdp.clickBtnNext();
    }

    // Truck Insurance Application Flow
    @When("I fill out Vehicle Data with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_vehicle_data_with(String make, String engPerf, String manDate, String numSeats, String fuelType, String payload, String totWeight, String listPrice, String licenPlate, String annMileage) throws InterruptedException {
        VehicleDataPage vdp = new VehicleDataPage();

        vdp.selectDrpMake(make);
        vdp.typeFldEnginePerf(engPerf);
        vdp.typeFldManufDate(manDate);
        vdp.selectDrpNumberSeats(numSeats);
        vdp.selectDrpFuelType(fuelType);
        vdp.typeFldPayload(payload);
        vdp.typeFldTotalWeight(totWeight);
        vdp.typeFldListPrice(listPrice);
        vdp.typeFldLicensePlate(licenPlate);
        vdp.typeFldAnnualMileage(annMileage);

        vdp.clickBtnNext();
    }

    // Motorcycle Insurance Application Flow
    @When("I fill out the Vehicle Data with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_the_vehicle_data_with(String make, String model, String cylCap, String engPerf, String manDate, String numSeats, String listPrice, String annMileage) throws InterruptedException {
        VehicleDataPage vdp = new VehicleDataPage();

        vdp.selectDrpMake(make);
        vdp.selectDrpModel(model);
        vdp.typeFldCylinderCap(cylCap);
        vdp.typeFldEnginePerf(engPerf);
        vdp.typeFldManufDate(manDate);
        vdp.selectDrpNumberSeatsMotor(numSeats);
        vdp.typeFldListPrice(listPrice);
        vdp.typeFldAnnualMileage(annMileage);

        vdp.clickBtnNext();
    }

    // Camper Insurance Application Flow
    @When("I fill out Vehicle Data with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_vehicle_data_with(String make, String engPerf, String manDate, String numSeats, String rHandDrive, String fuelType, String payload, String totWeight, String listPrice, String licenPlate, String annMileage) throws InterruptedException {
        VehicleDataPage vdp = new VehicleDataPage();

        vdp.selectDrpMake(make);
        vdp.typeFldEnginePerf(engPerf);
        vdp.typeFldManufDate(manDate);
        vdp.selectDrpNumberSeats(numSeats);
        vdp.clickRdbRHandDrive(rHandDrive);
        vdp.selectDrpFuelType(fuelType);
        vdp.typeFldPayload(payload);
        vdp.typeFldTotalWeight(totWeight);
        vdp.typeFldListPrice(listPrice);
        vdp.typeFldLicensePlate(licenPlate);
        vdp.typeFldAnnualMileage(annMileage);

        vdp.clickBtnNext();
    }

    // Common Insurance Application Flow
    @When("I fill out Insurant Data with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_insurant_data_with(String fName, String lName, String birth, String gender, String addr, String country, String zipCode, String city, String occup, String speed, String bungeejump, String cliffDiv, String skydiv, String other, String website) throws InterruptedException {
        InsurantDataPage idp = new InsurantDataPage();

        idp.typeFldFirstName(fName);
        idp.typeFldLastName(lName);
        idp.typeFldBirthDate(birth);
        idp.clickRdbGender(gender);
        idp.typeFldStreetAddress(addr);
        idp.selectDrpCountry(country);
        idp.typeFldZipCode(zipCode);
        idp.typeFldCity(city);
        idp.selectDrpOccupation(occup);
        idp.clickChkSpeeding(speed);
        idp.clickChkBungeeJumping(bungeejump);
        idp.clickChkCliffDiving(cliffDiv);
        idp.clickChkSkydiving(skydiv);
        idp.clickChkOther(other);
        idp.typeFldWebsite(website);

        idp.clickBtnNext();
    }

    // Automobile Insurance Application Flow
    @When("I fill out Product Data with {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_product_data_with(String startDate, String insurSum, String meritRat, String dmgInsur, String euroProt, String legalDef, String courtCar) throws InterruptedException {
        ProductDataPage pdp = new ProductDataPage();

        pdp.typeFldStartDate(startDate);
        pdp.selectDrpInsuranceSum(insurSum);
        pdp.selectDrpMeritRating(meritRat);
        pdp.selectDrpDamageInsurance(dmgInsur);
        pdp.clickChkEuroProtection(euroProt);
        pdp.clickChkLegalDefenseInsurance(legalDef);
        pdp.selectDrpCourtesyCar(courtCar);

        pdp.clickBtnNext();
    }

    // Camper, Motorcycle & Truck Insurance Application Flow
    @When("I fill out Product Data with {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_product_data_with(String startDate, String insurSum, String dmgInsur, String euroProt, String legalDef) throws InterruptedException {
        ProductDataPage pdp = new ProductDataPage();

        pdp.typeFldStartDate(startDate);
        pdp.selectDrpInsuranceSum(insurSum);
        pdp.selectDrpDamageInsurance(dmgInsur);
        pdp.clickChkEuroProtection(euroProt);
        pdp.clickChkLegalDefenseInsurance(legalDef);

        pdp.clickBtnNext();
    }

    // Common Insurance Application Flow
    @When("I select {string} Price Option")
    public void i_select_price_option(String priceOpt) throws InterruptedException {
        PriceOptionPage pop = new PriceOptionPage();
        pop.clickRdbPriceOption(priceOpt);

        pop.clickBtnNext();
    }

    // Common Insurance Application Flow
    @When("I fill out Quote with {string}, {string}, {string}, {string}, {string}")
    public void i_fill_out_quote_with(String email, String phone, String user, String password, String comments) throws InterruptedException {
        QuotePage qp = new QuotePage();

        qp.typeFldEmail(email);
        qp.typeFldPhone(phone);
        qp.typeFldUsername(user);
        qp.typeFldPassword(password);
        qp.typeFldConfirmPassword(password);
        qp.typeFldComments(comments);

        qp.clickBtnSend();
    }

    // Common Insurance Application Flow
    @Then("the message {string} is displayed")
    public void the_message_is_displayed(String success) throws InterruptedException {
        QuotePage qp = new QuotePage();
        qp.assertMsgSuccess(success);
    }

    @After
    public void quitDriver() {
        TestBase.getDriver().quit();
    }

}
