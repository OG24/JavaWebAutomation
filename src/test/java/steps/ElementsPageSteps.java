package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.ElementsPage;

public class ElementsPageSteps {
    ElementsPage elementsPage = new ElementsPage();

    @Before
    public void start(){driverManager.init();}

    @After
    public void kill(Scenario scenario){driverManager.kill(scenario);}

    @Given("Click the the header section and check whether it is the homepage")
    public void clickElementsSection() {
        elementsPage.click_header();
    }
}
