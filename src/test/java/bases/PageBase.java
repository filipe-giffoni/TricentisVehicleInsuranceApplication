package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageBase {

    protected WebDriver driver = null;
    protected WebDriverWait wait = null;

    // Constructor
    public PageBase() {
        driver = TestBase.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    protected void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void click(WebElement element) {
        waitForElement(element);
        element.click();
    }

    protected void select(WebElement element, String text) {
        waitForElement(element);
        Select make = new Select(element);
        make.selectByVisibleText(text);
    }

    protected void type(WebElement element, String text) {
        waitForElement(element);
        element.sendKeys(text);
    }

    protected void assertEquals(WebElement element, String text) {
        waitForElement(element);
        Assert.assertEquals(element.getText(), text);
    }

}
