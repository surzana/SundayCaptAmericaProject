package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.PetstoreRestAssuredActions;

public class PetstoreApi {
	PetstoreRestAssuredActions PetstoreRestAssuredActionsObj = new PetstoreRestAssuredActions();

@Given("^Creat pet$")
public void creat_pet() throws Throwable {
    PetstoreRestAssuredActionsObj.createPet();
}

@Given("^Get pet$")
public void get_pet() throws Throwable {
	PetstoreRestAssuredActionsObj.getPet();
}

@When("^Update pet$")
public void update_pet() throws Throwable {
	PetstoreRestAssuredActionsObj.updatePet();
}

@When("^Delete pet$")
public void delete_pet() throws Throwable {
	PetstoreRestAssuredActionsObj.deletePet();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
