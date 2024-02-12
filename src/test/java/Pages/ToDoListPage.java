package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoListPage {
    public ToDoListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName = "input")
    public WebElement input;

}
