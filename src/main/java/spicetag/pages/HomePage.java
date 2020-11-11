package spicetag.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicetag.base.TestBase;

public class HomePage extends TestBase {


	
@FindBy(xpath="//span[@_ngcontent-c3][text()='CAREX CARGO FORWARDERS PVT LTD - LKO']")
WebElement UserNameLabel;

@FindBy(xpath="//*[@id=\"mat-input-1\"]")
WebElement AXBnum;

@FindBy(xpath="//*[@id=\"mat-input-2\"]")
WebElement CustomerCode;

@FindBy(xpath="//*[@id=\"mat-input-3\"]")
WebElement DateFrom;

@FindBy(xpath="//*[@id=\"mat-input-4\"]")
WebElement DateTo;

@FindBy(xpath="//mat-form-field[@_ngcontent-c32]//mat-select[@formcontrolname=\"status\"]")
WebElement Status;

@FindBy(xpath="//tr[@class=\"mat-row ng-star-inserted\"]")
WebElement FResult;

@FindBy(xpath="//label[@_ngcontent-c1]//button[@title=\"Search\"]")
WebElement FilterSearchBtn;

@FindBy(xpath="//li[@class=\"link dropdown ng-star-inserted\"][1]") 
WebElement Config;

@FindBy(xpath="//SPAN[@_ngcontent-c4=''][text()='Employee Management']")
WebElement EmpMgt;

@FindBy(xpath="//button[@title=\"Create Employee\"]")
WebElement CreateEmp;
    public HomePage() {
	PageFactory.initElements(driver, this);
}

    public String VerifyHomePageTitle() {
	return driver.getTitle();
}
    public boolean VerifyCorrectusername() {
	return UserNameLabel.isDisplayed();
}


	public void InputAXBnum(String axb) throws InterruptedException {
		AXBnum.sendKeys(axb);
		Thread.sleep(3000);
		FilterSearchBtn.submit();
	}
		
	public void InputCustCode(String cust) {	
		CustomerCode.sendKeys(cust);
		FilterSearchBtn.submit();
		
	}
	public void InputDateFrom(String dtf) {
		DateFrom.sendKeys(dtf);
		FilterSearchBtn.submit();
	}
	public void InputDateto(String dtt) {
		DateTo.sendKeys(dtt);
		FilterSearchBtn.submit();
	}
	public void InputStatus() throws InterruptedException {
		Thread.sleep(10000);
		
		Status.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//SPAN[@class='mat-select-placeholder ng-tns-c7-157 ng-star-inserted']")).click();
		Thread.sleep(4000);
		
	}
	public void ClickOnConfig() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Config).build().perform();
		EmpMgt.click();
		CreateEmp.click();
	}
	}

