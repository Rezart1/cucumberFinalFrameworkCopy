package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui_automation.pages.OhrmHomePage;
import ui_automation.utilities.Driver;
import ui_automation.utilities.WaitHelper;

import java.util.List;

public class HomePageSteps {
    private OhrmHomePage homePage = new OhrmHomePage();

    @Then("user is redirected to home page")
    public void user_is_redirected_to_home_page() {
        String actualWelcomeMessage = homePage.welcomeMessage.getText();
        String expectedWelcomeMessage = "Welcome Yoll";
        Assert.assertEquals("Welcome message verification failed", expectedWelcomeMessage, actualWelcomeMessage);
    }

    @Then("user can see following tabs:")
    public void user_can_see_following_tabs(List<String> eTabs) {
        List<String> expectedTabs = eTabs;
        System.out.println("expectedTabs size: " + expectedTabs.size());
        List<WebElement> actualTabs = homePage.tabs;
        System.out.println("actualTabs size: " + actualTabs.size());

        if (expectedTabs.size() != actualTabs.size()) {
            Assert.fail("The actual count of tabs is not matching expected count!");
        }

        for (int i = 0; i < actualTabs.size(); i++) {
            String expectedTab = expectedTabs.get(i);
            String actualTab = actualTabs.get(i).getText();
            Assert.assertEquals("Tab verification failed.", expectedTab, actualTab);
        }
    }


    @Then("user can see page header {string}")
    public void user_can_see_page_header(String expectedPageHeader) {
        String actualPageHeader = homePage.systemUsersPageHeader.getText();
        Assert.assertEquals("Page header verification failed!", expectedPageHeader, actualPageHeader);
    }


}
