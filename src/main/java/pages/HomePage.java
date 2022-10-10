package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.Header;
import utils.Printer;
import utils.WebUtilities;

public class HomePage extends WebUtilities {

    Printer log = new Printer(HomePage.class);

    @FindBy(tagName = "header")
    public Header header;

    @FindBy(className = "banner-image")
    public WebElement banner;

    @FindBy(xpath = "//*[@class='category-cards']//*[text()='Elements']")
    public WebElement elements;

    @FindBy(xpath = "//*[@class='category-cards']//*[text()='Forms']")
    public WebElement forms;

    @FindBy(xpath = "//*[@class='category-cards']//*[text()='Alerts, Frame & Windows']")
    public WebElement alertsFrameWindows;
}
