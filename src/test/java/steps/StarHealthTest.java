package steps;
import static steps.StarHealthHooks.driver;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StarHealthTest extends StarHealthHomePage {
	WebDriverWait wait;
	@Given("User launches the Star Health application with {string}")
	public void user_launches_the_star_health_application_with(String url) {
	   driver.get(url);
	}

	@Then("User waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() {
		driver.navigate().refresh();
		 wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(popupClose)); 
		clickOnPopUp();
	}

	@Then("User get home page title and Validates it")
	public void user_get_home_page_title_and_validates_it() {
	   String actualtitle=driver.getTitle();
	  String expectedtitle="Star Health Insurance: Medical, Accident and Travel insurance policies";
		System.out.println(actualtitle);
		Assertions.assertEquals(actualtitle, expectedtitle);
	   
	}

	@Then("User clicks on the Buy Now button")
	public void user_clicks_on_the_buy_now_button() {
	    clickOnBuyNow();
	}

	@Then("User Enters data for  {string},{string},{string},{string}")
	public void user_enters_data_for(String name, String phone, String email, String pincode) {
	   enterFullname(name);
	   enterMobile(phone);
	   enterEmail(email);
	   enterPincode(pincode);
	}

	@Then("User click on getstarted button")
	public void user_click_on_getstarted_button() {
	   clickOnGetStarted();
	}

	@Then("User select the checkbox for myself")
	public void user_select_the_checkbox_for_myself() {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(myself));
	    clickOnMyself();
	}

	@Then("user navigates to the HomePage with {string}")
	public void user_navigates_to_the_home_page_with(String url) {
	    driver.get(url);
	}

}
