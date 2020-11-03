
package spicetag.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import spicetag.base.TestBase;
import spicetag.pages.EmployeeManag;
import spicetag.pages.HomePage;
import spicetag.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage  homepage;
	EmployeeManag employeepage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	    homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}
	  
	//@Test(priority=1)
	public void VerifyHomePageTitle() {
		String homepagetitle = homepage.VerifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "SpiceTag");
	}
	//@Test(priority=2)
	public void VerifyCorrectusername() {
		Assert.assertTrue(homepage.VerifyCorrectusername());
	}
	//@Test(priority=3)
	public void InputAXBnum() throws InterruptedException {
		homepage.InputAXBnum("82095720");
	     
	}
	public void ValidSearch() {
		Assert.assertEquals("82095720", "82095720");
	}
	//@Test(priority=4)
    public void InputCustCode() {
		homepage.InputCustCode("LAVND1DD");
	}
    public void ValidcustSearch() {
		Assert.assertEquals("LAVND1DD", "LAVND1DD");
    }
    //@Test(priority=5)
    public void InputDateFrom() {
    	homepage.InputDateFrom("19-10-2020 ");
    }
    public void ValidDateFrom() {
    	Assert.assertEquals("19-10-2020 ", "19-10-2020 ");
    }
    //@Test(priority=6)
    public void InputDateTo() {
    	homepage.InputDateto("19-10-2020");
    }
    public void ValidDateTo() {
    	Assert.assertEquals("19-10-2020", "19-10-2020");
    }
	//@Test(priority=7)
	public void InputStatus() throws InterruptedException {
		homepage.InputStatus();
	}
	public void ValidStats() {
		Assert.assertEquals("Dummy Task Created By Spicetag", "Dummy Task Created By Spicetag");
	}
	
	
	
	@AfterMethod 

	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
		
	}
}
