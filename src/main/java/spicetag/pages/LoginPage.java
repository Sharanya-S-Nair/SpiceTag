package spicetag.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicetag.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory - OR:
	 @FindBy(xpath="//input[@placeholder=\"User ID\"] ")
	 WebElement username;
	 @FindBy(xpath="//input[@type=\"password\"]")
	 WebElement password;
	 @FindBy(xpath="//button[@class=\"btn btn-primary btn-block auth-form-btn\"]")
	 WebElement loginBtn;
	 @FindBy(xpath="//img[@src=\"../../assets/img/new-tag.png\"]")
	 WebElement Spicelogo;
	 public LoginPage() {
		PageFactory.initElements(driver, this);
	 }
	 
	 public String validatetitle() {
		 return driver.getTitle();
	 }
	 public boolean validateImg() {
		 return Spicelogo.isDisplayed();
	 }
	 public HomePage login(String un, String pwd) {
		 username.sendKeys(un);
		 password.sendKeys(pwd);
		 loginBtn.click();
		 return new HomePage();
	 }
	 
	 }
	 

