package Pages;

import Utilities.Driver;
import Utilities.ParallelDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListContactParallelPage {

    public ContactListContactParallelPage(){
        PageFactory.initElements(ParallelDriver.getDriver(), this);
    }

    @FindBy(id = "logout")
    public WebElement logout;

}
