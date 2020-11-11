package spicetag.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import spicetag.base.TestBase;

public class EmployeeManag extends TestBase {
	
@FindBy(xpath="//SPAN[@_ngcontent-c4=''][text()='Employee Management']")
WebElement EmpMgt;
@FindBy(xpath="//input[@formcontrolname=\"email_id\"]")
WebElement EmailID;
@FindBy(xpath="//input[@id=\"mat-input-1\"]")
WebElement LoginID;
@FindBy(xpath="//span[@class=\"mat-form-field-label-wrapper\"][1]")
WebElement Warehouse; 
@FindBy(xpath="//input[@formcontrolname=\"city\"]")
WebElement City;
@FindBy(xpath="//i[@class=\"fa fa-angle-down pull-right\"]") 
WebElement Config;
@FindBy(xpath="//button[@title=\"Create Employee\"]")
WebElement CreateEmp;
@FindBy(xpath="//input[@placeholder=\"Enter Employee Name *\"]")
WebElement EmployeeName;


public EmployeeManag() {
	PageFactory.initElements(driver, this);
}
public void ClickOnEmailId() {
	EmailID.click();
	
}
public void ClickOnLoginId() {
	LoginID.click();
	
}
public void ClickOnCity() {
	City.click();
}
public void ClickOnCreateEmp() throws InterruptedException {
	Thread.sleep(5000);
	CreateEmp.click();
}
public void ClickOnConfigg() throws InterruptedException {
	Config.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class=\"nav-label \"][text()='Employee Management']")).click();
	Thread.sleep(3000);
	CreateEmp.click();
	Thread.sleep(3000);
}

	//Select select = new Select(driver.findElement(By.xpath("//span[@class=\"mat-select-placeholder ng-tns-c12-41 ng-star-inserted\"]")));
	
}



