package Automating_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import GenericALL.initialisepom;

public class Pom2 extends initialisepom{
	@FindBy(id="email")
	private WebElement loginTextFeild;
	@FindBy(id="pass")
	private WebElement pwdTextFeild;
	@FindBy(name="login")
	private WebElement submitbtn;
	
	public Pom2(WebDriver driver){
		super(driver);
		
	}
	
	public void sendemail(String email) {
		loginTextFeild.sendKeys(email);
	}
	
	public void sendpwd(String pwd) {
		pwdTextFeild.sendKeys(pwd);
	}
	public void validate() {
		submitbtn.click();
	}

}
