package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public static LoginPage lg;
	
	private LoginPage() {
		// TODO Auto-generated constructor stub
	}
	
	public static LoginPage getInstance() {
		
		if(lg == null) {
			
			lg = new LoginPage();
		
		}
		return lg;

	}
	
	@FindBy(id = "username")
	
	private WebElement username;
	
	@FindBy(id = "password")
	
	private WebElement password;
	
	@FindBy(id = "login")
	
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public  WebElement getLogin() {
		return login;
	}

}
