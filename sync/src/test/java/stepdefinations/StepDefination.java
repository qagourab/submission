package stepdefinations;

import com.map.model.WebDriverProvider;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;
public class StepDefination {
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		TestRunner.driver.get(WebDriverProvider.getURL());
	    throw new PendingException();
	}

	@When("^I click on the addtoggle$")
	public void i_click_on_the_addtoggle() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see the  addtoggle expand or collapse$")
	public void i_should_see_the_addtoggle_expand_or_collapse() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
