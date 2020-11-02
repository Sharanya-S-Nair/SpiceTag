package spicetag.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import spicetag.base.TestBase;
import spicetag.pages.HomePage;
import spicetag.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginPage;
	HomePage  homePage;
	public LoginTest() {
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void logintitletest() {
		String title = loginPage.validatetitle();
		Assert.assertEquals(title, "SpiceTag");
	}
	@Test
	public void Imgtest() {
		boolean Img = loginPage.validateImg();
		Assert.assertTrue(Img);
	}
	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}
}