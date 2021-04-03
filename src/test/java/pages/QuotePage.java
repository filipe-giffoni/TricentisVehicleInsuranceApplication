package pages;

import bases.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePage extends PageBase {

    //Locators

    @FindBy(id = "email")
    private WebElement fldEmail;

    @FindBy(id = "phone")
    private WebElement fldPhone;

    @FindBy(id = "username")
    private WebElement fldUsername;

    @FindBy(id = "password")
    private WebElement fldPassword;

    @FindBy(id = "confirmpassword")
    private WebElement fldConfirmPassword;

    @FindBy(id = "Comments")
    private WebElement tarComments;

    @FindBy(id = "sendemail")
    private WebElement btnSend;

    @FindBy(xpath = "//div[@class='sweet-alert showSweetAlert visible']/h2")
    private WebElement msgSuccess;

    // Actions

    public void typeFldEmail(String text) {
        type(fldEmail, text);
    }

    public void typeFldPhone(String text) {
        type(fldPhone, text);
    }

    public void typeFldUsername(String text) {
        type(fldUsername, text);
    }

    public void typeFldPassword(String text) {
        type(fldPassword, text);
    }

    public void typeFldConfirmPassword(String text) {
        type(fldConfirmPassword, text);
    }

    public void typeFldComments(String text) {
        type(tarComments, text);
    }

    public void clickBtnSend() {
        click(btnSend);
    }

    public void assertMsgSuccess(String text) {
        assertEquals(msgSuccess, text);
    }

}
