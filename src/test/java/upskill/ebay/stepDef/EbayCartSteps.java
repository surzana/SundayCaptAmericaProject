package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCartActions;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbayCartSteps {
	
	EbayCartActions EbayCartActionsObj = new EbayCartActions();

	@When("^Select Size$")
	public void select_Size() throws Throwable {
		EbayCartActionsObj.switchNewWindow();
		EbayCartActionsObj.selectSizeType();
	}

	@When("^Select Men Size$")
	public void select_Men_Size() throws Throwable {
		EbayCartActionsObj.selectMenSize();
	}

	@When("^Select Shade$")
	public void select_Shade() throws Throwable {
		EbayCartActionsObj.selectShade();
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		EbayCartActionsObj.enterQuantity();
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartActionsObj.addToCart();
	}
}