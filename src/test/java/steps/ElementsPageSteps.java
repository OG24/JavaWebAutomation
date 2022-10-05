package steps;

import io.cucumber.java.en.Then;
import pages.ElementsPage;

public class ElementsPageSteps {
    ElementsPage elementsPage = new ElementsPage();

    @Then("Click the the header section and check whether it is the homepage")
    public void clickElementsSection() {
        elementsPage.click_header();
    }
}
