package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_35Page {
    public Task_35Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="firstname")
    public WebElement firstName;

    @FindBy(id="surname")
    public WebElement lastName;

    @FindBy(id="age")
    public WebElement age;

    @FindBy(id="country")
    public WebElement country;

    @FindBy(id="notes")
    public WebElement notes;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement sendButton;

    @FindBy(tagName = "h1")
    public WebElement inputValidation;

}
