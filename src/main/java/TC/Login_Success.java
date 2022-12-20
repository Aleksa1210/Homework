package TC;

import POM.BasePage;
import TestBases.TestBase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;
import java.security.Key;

public class Login_Success extends TestBase {
    BasePage basePage = new BasePage();


@Test()

    public void login_success(){
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    basePage.Username.sendKeys(ConfigurationReader.getProperty("Success.username"));
    basePage.Password.sendKeys(ConfigurationReader.getProperty("Success.password"));
    basePage.SubmitBtn.click();
    System.out.println(basePage.LoggedMsg.getText());
    Assert.assertEquals(basePage.LoggedMsg.getText(),"You logged into a secure area!\n" + "×");

    //TODO - close browser
}

@Test()
    public void login_fail_invalid_creadentials(){
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    basePage.Username.sendKeys(ConfigurationReader.getProperty("Failure.username"));
    basePage.Password.sendKeys(ConfigurationReader.getProperty("Failure.password"));
    basePage.SubmitBtn.click();
    System.out.println(basePage.InvalidPassword.getText());
    Assert.assertEquals(basePage.InvalidPassword.getText(),"Your password is invalid!\n" + "×");
    }

@Test
        public void checkboxes(){
        Driver.getDriver().get(ConfigurationReader.getProperty("Checkboxes.url"));

        basePage.Checkbox1.click();
        System.out.println("IsSelected Checkbox2 - " + basePage.Checkbox1.isSelected());
        Assert.assertTrue(basePage.Checkbox1.isSelected(), "true");

        basePage.Checkbox2.click();
        System.out.println("IsSelected Checkbox2 - " + basePage.Checkbox2.isSelected());
        Assert.assertTrue(basePage.Checkbox1.isSelected(), "false");
}

    @Test
    public void context_menu(){
        Driver.getDriver().get(ConfigurationReader.getProperty("Context.menu"));

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(basePage.ContextMenu).perform();


       // TODO with JS. assert
    }

    @Test
    public void drag_amd_drop(){
        Driver.getDriver().get(ConfigurationReader.getProperty("Drag.amd.Drop"));

        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(basePage.DragAndDropB, basePage.DragAndDropA).perform();
      //  actions.clickAndHold(basePage.DragAndDropA).moveToElement(basePage.DragAndDropB).perform();
      //actions.dragAndDropBy(basePage.DragAndDropA,110, 125).build().perform();

    }

    @Test
    public void dropdown_list(){
        Driver.getDriver().get(ConfigurationReader.getProperty("DropDown"));
        basePage.DropdownList.click();
        basePage.Option1.click();
        basePage.Option1.click();
        Assert.assertEquals("Option 1",basePage.Option1.getText());
        // TODO IT IS HTML


    }


    @Test
    public void iframe(){
        Driver.getDriver().get(ConfigurationReader.getProperty("Iframe"));

        driver.switchTo().frame(driver.findElement(By.className("no-js")));
        basePage.TextIframe.sendKeys("hello" + Keys.ENTER);




    }


}
