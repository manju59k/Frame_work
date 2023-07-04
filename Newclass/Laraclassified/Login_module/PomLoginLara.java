package Login_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginLara {
@FindBy(id="email")
private WebElement e_Textfield;
@FindBy(id="password")
private WebElement p_Textfield;
@FindBy(id="loginBtn")
private WebElement loginBtn;

public PomLoginLara(WebDriver driver ) {
	PageFactory.initElements(driver,this);
}
public void email_id(String s) {
	e_Textfield.sendKeys(s);	
}
public void psswordfeild(String s) {
	p_Textfield.sendKeys(s);	
}
public void LoginBtn()
   {   loginBtn.click();
	}
}

