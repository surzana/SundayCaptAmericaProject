package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    Thread.sleep(2000);
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomepageActionsObj.searchShoes();
		Thread.sleep(2000);
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsObj.searchItems(items);
		Thread.sleep(2000);
	}
	
	@Given("^Search for Big Tall Cotton Tee$")
	public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
		EbayHomepageActionsObj.searchItems("Big & Tall Cotton Tee");
	}
}
