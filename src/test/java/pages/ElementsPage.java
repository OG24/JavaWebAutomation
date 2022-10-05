package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.text.Utilities;

public class ElementsPage extends Utilities {
    WebDriver driver;

    By header = By.tagName("header");
    By textBox = By.xpath("//*[contains(@id,'item')]//*[text()='Text Box']");
    By checkBox = By.xpath("//*[contains(@id,'item')]//*[text()='Check Box']");
    By radioButton = By.xpath("//*[contains(@id,'item')]//*[text()='Radio Button']");
    By webTemplates = By.xpath("//*[contains(@id,'item')]//*[text()='Web Templates']");
    By buttons = By.xpath("//*[contains(@id,'item')]//*[text()='Buttons']");

    public ElementsPage(){
        checkElements();
    }

    public void checkElements() {
        Assert.assertTrue("Header is not displayed!", driver.findElement(header).isDisplayed());
        Assert.assertTrue("'Text Box' section is not displayed!", driver.findElement(textBox).isDisplayed());
        Assert.assertTrue("'Check Box' section is not displayed!", driver.findElement(checkBox).isDisplayed());
        Assert.assertTrue("'Radio Button' section is not displayed!",
                driver.findElement(radioButton).isDisplayed());
        Assert.assertTrue("'Web Templates' section is not displayed!",
                driver.findElement(webTemplates).isDisplayed());
        Assert.assertTrue("'Buttons' section is not displayed!", driver.findElement(buttons).isDisplayed());
    }

    public HomePage click_header() {
        driver.findElement(header).click();
        return new HomePage();
    }
}
