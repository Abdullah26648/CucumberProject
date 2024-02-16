package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_36Page {

    public Task_36Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "note-title-input")
    public WebElement title;

    @FindBy(id = "note-details-input")
    public WebElement note;

    @FindBy(id = "add-note")
    public WebElement addbutton;


}
