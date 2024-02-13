package Pages;

import Utilities.Driver;
import Utilities.ParallelDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormHomeParallelPage {

    public FormHomeParallelPage(){
        PageFactory.initElements(ParallelDriver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "comments")
    public WebElement comments;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

}
