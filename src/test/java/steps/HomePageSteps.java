package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Before
    public void start(){driverManager.init();}

    @After
    public void kill(Scenario scenario){driverManager.kill(scenario);}

    @Given("Click the elements section")
    public void clickElementsSection() {
        homePage.click_elements();
    }
}

