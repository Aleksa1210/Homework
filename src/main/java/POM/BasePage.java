package POM;


import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {

        public BasePage(){
                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(id = "username")
        public WebElement Username;

        @FindBy(id = "password")
        public WebElement Password;

        @FindBy(className = "radius")
        public WebElement SubmitBtn;

        @FindBy(id = "flash")
        public WebElement LoggedMsg;

        @FindBy(id = "flash")
        public WebElement InvalidPassword;

        @FindBy(xpath = "//input[@type='checkbox'][1]")
        public WebElement Checkbox1;

        @FindBy(xpath = "//input[@type='checkbox'][2]")
        public WebElement Checkbox2;

        @FindBy (id = "hot-spot")
        public WebElement ContextMenu;

        @FindBy (id = "column-a")
        public WebElement DragAndDropA;

        @FindBy (id = "column-b")
        public WebElement DragAndDropB;

        @FindBy (id = "dropdown")
        public WebElement DropdownList;

        @FindBy (xpath = "//option[@value='1']")
        public WebElement Option1;


        @FindBy (id = "tinymce")
        public WebElement TextIframe;

        @FindBy (xpath = "//button[@onclick='jsAlert()']")
        public WebElement Alerts;


        @FindBy (xpath = "//button[@onclick='jsConfirm()']")
        public WebElement AlertsConfirm;

        @FindBy (xpath = "//button[@onclick='jsPrompt()']")
        public WebElement AlertsPrompt;




}

