package Pages;

import Utilities.Driver;
import Utilities.ParallelDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoListParallelPage {
    public ToDoListParallelPage() {
        PageFactory.initElements(ParallelDriver.getDriver(), this);
    }

    @FindBy(tagName = "input")
    public WebElement input;

}
