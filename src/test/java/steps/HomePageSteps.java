package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("Click the elements section")
    public void clickElementsSection() {
        homePage.click_elements();
    }
}

