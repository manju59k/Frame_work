package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtextfeild;
	@FindBy(id="nav-search-submit-button")
	private WebElement searchtextbtn;
	
	public pom1(WebDriver driver){
		PageFactory.initElements( driver,this);
		
	}
		public void Sendto(String send) {
			searchtextfeild.sendKeys(send);
		}
	public void serchClick() {
		searchtextbtn.click();
	}
	
	
	

}
