package pages;

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

    public HomePage click_header(){
        driver.findElement(header);
        return this;
    }

    public ElementsPage click_elements(){
        driver.findElement(elements);
        return new ElementsPage();
    }
}