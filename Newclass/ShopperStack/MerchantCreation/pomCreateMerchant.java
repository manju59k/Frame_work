package MerchantCreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomCreateMerchant {
	@FindBy(xpath="//button[.='Merchant Login']")
	private WebElement Merchant;
	@FindBy(xpath="//span[.='Create Account']")
	private WebElement CreateAcc;
	@FindBy(id="Enter Admin Email")
	private WebElement sendAdminMailId;
	@FindBy(xpath="//span[@class='MuiIconButton-label']")
	private WebElement validateAdmin;
	@FindBy(xpath="//span[.='Merchant Signup']")
	private WebElement MSingup;
	@FindBy(id="First Name")
	private WebElement MFname;
	@FindBy(id="Last Name")
	private WebElement MLname;
	@FindBy(id="E-mail")
	private WebElement MEid;
	@FindBy(id="Phone Number")
	private WebElement MPhonenumber;
	@FindBy(id="Password")
	private WebElement MPassword;
	@FindBy(id="Male")
	private WebElement g_male;
	@FindBy(id="Female")
	private WebElement g_Fmale;
	@FindBy(id="Other")
	private WebElement g_Other;
	@FindBy(xpath="//span[.='Next']")
	private WebElement Next;
	@FindBy(id="Company Name")
	private WebElement Cname;
	@FindBy(id="Company Email")
	private WebElement C_Email;
	@FindBy(id="Company Phone Number")
	private WebElement C_Phonenumber;
	@FindBy(id="Company GSTN")
	private WebElement C_GSTN;
	@FindBy(name="registerNumber")
	private WebElement Rnumber;
	@FindBy(id="Company Website")
	private WebElement C_Website;
	@FindBy(id="Commission")
	private WebElement C_Commission;
	@FindBy(id="Company Type")
	private WebElement C_Type;
	@FindBy(id="Building Information")
	private WebElement Binfo;
	@FindBy(id="Landmark")
	private WebElement BLandmark;
	@FindBy(id="Street Info")
	private WebElement BStreetInfo;
	@FindBy(id="Pincode")
	private WebElement BPincode;
	@FindBy(id="Country")
	private WebElement WhichCountry;
	@FindBy(id="State")
	private WebElement WhichState;
	@FindBy(id="City")
	private WebElement WhichCity;
	@FindBy(xpath="//span[.='Finish']")
	private WebElement FinishMCreation;
	@FindBy(id="Terms And Conditions")
	private WebElement Authorise1;
	@FindBy(xpath="//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	private WebElement Authorise2;
	@FindBy(xpath="//button[.='I Agree']")
	private WebElement Authorise3;
	
	
	
	
	public pomCreateMerchant(WebDriver driver) {
		PageFactory.initElements( driver,this);	
	}
	public void SelectMerchant() {
		Merchant.click();
	}
	public void createAcc() {
		CreateAcc.click();
	}
	public void sendAdminMAilid(String mailid) {
		sendAdminMailId.sendKeys(mailid);
	}
	public void vaildAdmin() {
		validateAdmin.click();
	}
	public void merchantSinup() {
		MSingup.click();
	}
	public void sendFname(String fname) {
		MFname.sendKeys(fname);
	}
	public void sendlname(String lname) {
		MLname.sendKeys(lname);
		}


}