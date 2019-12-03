package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import projectspecificmethod.ProjectSpecificMethod;

public class TC001 extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setData() {
		//excelFileName="TC002";
		testcaseName="Login Logout (POM)";
		testcaseDec = "Login and Logout to Leaftaps";
		author="Balaji";
		category="smoke";
		
	}
	
@Test
public void runCase1() {
	new LoginPage()
	.enterUserName("uname")
	.enterPassword("pass")
	.clickLogin();
}
}
