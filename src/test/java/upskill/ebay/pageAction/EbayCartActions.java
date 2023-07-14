package upskill.ebay.pageAction;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {

	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	
	public void switchNewWindow(){
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
		SetupDrivers.driver.switchTo().window(winhandle);
		}
	}
	
	public void switchOnSpecificWindowByIndex(){

		List<String> windowHandles = new ArrayList<>(SetupDrivers.driver.getWindowHandles());
		int windowIndex = 1; // Index of the window you want to switch to (0-based index)

		SetupDrivers.driver.switchTo().window(windowHandles.get(windowIndex));
	}
	
	public void switchOnSpecificWindowByTitle(){
		String desiredTitle = "My Desired Window Title";

		for (String windowHandle : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(windowHandle);
		    if (SetupDrivers.driver.getTitle().equals(desiredTitle)) {
		        break;
		    }
		}
	}
	
	public void selectSizeType() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddSizeType);
//		dropDownObj.selectByVisibleText("Big & Tall");
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		Thread.sleep(2000);
	}
	
	public void selectMenSize() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddMenSize);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("MenSize"));
//		dropDownObj.selectByVisibleText("8XLT");
//		dropDownObj.selectByIndex(5);
		Thread.sleep(2000);
	}
	
	public void selectShade() throws Exception{
		Thread.sleep(2000);
		Select dropDownObj = new Select(EbayCartLocatorsObj.ddShade);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
//		dropDownObj.selectByVisibleText("White");
//		dropDownObj.selectByValue("14");
		Thread.sleep(2000);
	}
	
	public void enterQuantity() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.txtbxQty.clear();
//		EbayCartLocatorsObj.txtbxQty.sendKeys("2");
		EbayCartLocatorsObj.txtbxQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		Thread.sleep(2000);
	}
	
	public void addToCart() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.btnAddCart.click();
		Thread.sleep(2000);
	}
}
// dan is here



