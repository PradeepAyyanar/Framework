package pages;

import projectspecificmethod.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage enterUserName(String uname) {
		clearAndType(locateElement("id", "username"), uname);
		
		return this;
	}
	public LoginPage enterPassword(String pass) {
		clearAndType(locateElement("id", "password"), pass);
		return this;
	}
	public LoginPage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return this;
	}

	
}
