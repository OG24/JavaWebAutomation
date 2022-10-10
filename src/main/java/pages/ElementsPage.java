package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.Header;
import utils.Printer;
import utils.WebUtilities;

public class ElementsPage extends WebUtilities {

    Printer log = new Printer(ElementsPage.class);

    @FindBy(tagName = "header")
    public Header header;

    @FindBy(xpath = "//*[contains(@id,'item')]//*[text()='Text Box']")
    public WebElement textBox;

    @FindBy(xpath = "//*[contains(@id,'item')]//*[text()='Check Box']")
    public WebElement checkBox;

    @FindBy(xpath = "//*[contains(@id,'item')]//*[text()='Radio Button']")
    public WebElement radioButton;

    @FindBy(xpath = "//*[contains(@id,'item')]//*[text()='Web Templates']")
    public WebElement webTemplates;
}
