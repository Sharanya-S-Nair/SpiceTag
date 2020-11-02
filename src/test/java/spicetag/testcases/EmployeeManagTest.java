package spicetag.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import spicetag.base.TestBase;
import spicetag.pages.EmployeeManag;
import spicetag.pages.HomePage;
import spicetag.pages.LoginPage;

public class EmployeeManagTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	EmployeeManag employeepage;
	public EmployeeManagTest() {
		super();
	}
   @BeforeTest
   public void setup() throws InterruptedException {
	   initialization();
		loginPage = new LoginPage();
	    homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    //employeepage = homepage.ClickOnConfig();  
}
   @Test
   public void ClickOnEmp() throws InterruptedException{
	   Thread.sleep(5000);
	   homepage.ClickOnConfig();
   }
   //@Test
   public void ClickOnEmail() {
	   employeepage.ClickOnEmailId();
   }
   //@Test
   public void ClickOnLogin() {
	   employeepage.ClickOnLoginId();
   }
   //@Test
   public void ClickCity() {
	   employeepage.ClickOnCity();
   }
}
