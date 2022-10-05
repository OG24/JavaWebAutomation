package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.text.Utilities;

public class HomePage extends Utilities {
    WebDriver driver;

    By header = By.tagName("header");
    By banner = By.className("banner-image");
    By elements = By.xpath("//*[@class='category-cards']//*[text()='Elements']");
    By forms = By.xpath("//*[@class='category-cards']//*[text()='Forms']");
    By alertsFrameWindows = By.xpath("//*[@class='category-cards']//*[text()='Alerts, Frame & Windows']");
    By widgets = By.xpath("//*[@class='category-cards']//*[text()='Widgets']");
    By interactions = By.xpath("//*[@class='category-cards']//*[text()='Interactions']");
    By bookStoreApplications = By.xpath("//*[@class='category-cards']//*[text()='Book Store Applications']");

    public HomePage(){
        checkElements();
    }

    public void checkElements() {
        Assert.assertTrue("Header is not displayed!", driver.findElement(header).isDisplayed());
        Assert.assertTrue("Banner is not displayed!", driver.findElement(banner).isDisplayed());
        Assert.assertTrue("'Elements' section is not displayed!", driver.findElement(elements).isDisplayed());
        Assert.assertTrue("'Forms' section is not displayed!", driver.findElement(forms).isDisplayed());
        Assert.assertTrue("'Alerts, Frame & Windows' section is not displayed!",
                driver.findElement(alertsFrameWindows).isDisplayed());
        Assert.assertTrue("'Widgets' section is not displayed!", driver.findElement(widgets).isDisplayed());
        Assert.assertTrue("'Interactions' section is not displayed!",
                driver.findElement(interactions).isDisplayed());
        Assert.assertTrue("'Book Store Application' section is not displayed!",
                driver.findElement(bookStoreApplications).isDisplayed());
    }

    public HomePage click_header() {
        driver.findElement(header).click();
        return this;
    }

    public void click_elements() {
        driver.findElement(elements);
        new ElementsPage();
    }
}
