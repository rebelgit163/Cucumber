package smokeTest;
import ASOSProject.AutomationTest.AsosBase;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en_au.When;

public class SmokeTest {
AsosBase ab=new AsosBase();

@Before
public void openBrowser(){
	ab.startBrowser();
}

	@Given("^I am on ASOS home page \"([^\"]*)\"$")
	public void I_am_on_ASOS_home_page(String arg1) {
		ab.testURL(arg1);
	  	}

	@When("^WOMEN section is displayed$")
	public void WOMEN_section_is_displayed() {
	 ab.isWomenSetionDisplayed();  
	}

	@When("^I click on Women tab$")
	public void I_click_on_Women_tab() {
	   ab.clickOnWomenTab();
	}

	@Then("^URL should be this \"([^\"]*)\"$")
	public void URL_should_be_this(String arg1) {
	    ab.verifyWomen();
	}	
	
	@After
	public void tearDown(){
		ab.closeBrowser();
		
	}
	

}
