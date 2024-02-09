package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListContactPage {

    public ContactListContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "logout")
    public WebElement logout;

}
