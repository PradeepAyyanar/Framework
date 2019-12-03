package projectspecificmethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import api.design.SeleniumBase;
import utils.DataLibrary;

public class ProjectSpecificMethod extends SeleniumBase{
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  @BeforeMethod
  public void beforeMethod() {
	startApp("chrome", "http://leaftaps.com/opentaps");
	node = test.createNode(testcaseName);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  
  
  
  
  
  
  
  
  
  
  
  

}