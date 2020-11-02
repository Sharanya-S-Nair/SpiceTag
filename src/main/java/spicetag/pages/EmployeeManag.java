package spicetag.pages;

import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicetag.base.TestBase;

public class EmployeeManag extends TestBase {
	
@FindBy(xpath="//SPAN[@_ngcontent-c3=''][text()='Employee Management']")
WebElement EmpMgt;
@FindBy(xpath="//i[@class=\"fa fa-angle-down pull-right\"]") 
WebElement Config;
@FindBy(xpath="//input[@formcontrolname=\"email_id\"]")
WebElement EmailID;
@FindBy(xpath="//input[@id=\"mat-input-1\"]")
WebElement LoginID;
@FindBy(xpath="//span[@class=\"mat-form-field-label-wrapper\"][1]")
WebElement Warehouse; xsffd;
@FindBy(xpath="//input[@formcontrolname=\"city\"]")
WebElement City;


public EmployeeManag() {
	PageFactory.initElements(driver, this);
}

public void ClickOnConfigg() throws InterruptedException {
	Config.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class=\"nav-label \"][text()='Employee Management']")).click();
	
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
}



