package StudentPractice;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class PomScriptp extends GenericScritptS {

	@FindBy(id="firstName")
	private WebElement FtextFld;
	
	@FindBy(id="lastName")
	private WebElement LtxtFld;
	
	@FindBy(id="userEmail")
	private WebElement eTxtFld;
	
	@FindBy(xpath="//label[@class='custom-control-label' and @for='gender-radio-1']")
	private WebElement Male;
	
	@FindBy(xpath="//label[contains(text(),'Female')]")
	private WebElement FeMale;
	
	@FindBy(xpath="//label[contains(text(),'Other')]")
	private WebElement Other;
	
	@FindBy(id="userNumber")
	private WebElement Phnumber;
	@FindBy(id="dateOfBirthInput")
	private WebElement dateOfBirthInput;
	@FindBy(xpath="//div[.='26']")
	private WebElement dob;
	@FindBy(xpath="//input[@id='subjectsInput']")
	private WebElement subject;
	
	@FindBy(xpath="//label[.='Sports']")
	private WebElement sports;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement music;
	
	@FindBy(xpath="//label[.='Reading']")
	private WebElement Reading;
	
	@FindBy(id="uploadPicture")
	private WebElement picture;
	
	
	@FindBy(id="currentAddress")
	private WebElement CA;
	
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="submit")
	private WebElement submit;
	
	public PomScriptp(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public void fnametxt(String s) {
		FtextFld.sendKeys(s);
	}
	public void lnameTxt(String s) {
		LtxtFld.sendKeys(s);
		
	}
	public void Emailtxtfld(String s) {
		eTxtFld.sendKeys(s);
	}
	public void Selectgender()
	{
	//	if(s=="male"||s=="Male"||s=="m"||s=="M") 
			Male.click();
			Actions act=new Actions(driver);
			act.moveToElement(Male).click();
		//else if(s=="female"||s=="Female"||s=="f"||s=="F")	
				//FeMale.click();
		//else
		//	Other.click();
		
	}
  public void dob() {
	  
	  dateOfBirthInput.click();
	  dob.click();
  }
	public void phonum(String s) {
		Phnumber.sendKeys(s);
		
	}
	public void subject(String s) {
		try{
			subject.sendKeys(s);
			Robot r=new Robot ();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
	catch(Exception e) {
		
	}
	}
	

	
	

	public void hobies(String R, String S,String M)
	{
	Reading.click();
	sports.click();
	music.click();
	
	}
	public void currtentA(String s) {
		CA.sendKeys(s);
	}
	public void selectStatecity(String stat,String cit) {
		try {
			state.click();
			Robot r=new Robot ();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			city.click();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	public void Selectfile(String f) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display='block';", picture);
		picture.sendKeys(f);
	}
	public void submitf() {
		submit.click();
	}
	
	
	
}
