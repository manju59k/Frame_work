package Signup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericALL.Genricaction;

public class pomCreatingLaraclasified {
@FindBy(xpath="//a[.='Signup']")
private WebElement SignupBtn;
@FindBy(id="select2-gender-container")
private WebElement Genderselect;
@FindBy(xpath="//input[@name='name']")
private WebElement Namefeild;
@FindBy(xpath="//input[@id='user_type-2']")
private WebElement Professional;
@FindBy(xpath="//input[@id='user_type-3']")
private WebElement Individual;
@FindBy(xpath="//span[@id='select2-country-container']")
private WebElement clickonCountry;
@FindBy(xpath="//input[@class='select2-search__field']")
private WebElement SelectCountry;
@FindBy(id="password_confirmation")
private WebElement passwordcnfrmfeild;
@FindBy(name="phone")
private WebElement phonenumberfeild;
@FindBy(id="password")
private WebElement passwordfeild;
@FindBy(id="email")
private WebElement emailfeild;
@FindBy(id="term")
private WebElement termBTn;
@FindBy(id="signup_btn")
private WebElement Register;

//public List<WebElement>l1;
/*public void Webelementslist() {
	l1.add(Genderselect);
	l1.add(Namefeild);
	l1.add(Individual);
	l1.add(SelectCountry)
}*/
public pomCreatingLaraclasified(WebDriver driver) {
	PageFactory.initElements( driver,this);	
}


public void Singupbtnclick() {
	SignupBtn.click();
}
public void selectGender(String s) {
	Genderselect.click();
try {	
	if(s=="male"||s=="Male"||s=="m"||s=="M") {
		Genricaction.Enterkey(1);
		Thread.sleep(500);
	}
	else {
		Genricaction.DownKEy(2);;
		Genricaction.Enterkey(1);
		Thread.sleep(500);
		}
}

   catch(Exception e) {
	System.out.println(e);
}

}
public void name_user(String name) {
	try {
		Thread.sleep(500);
		Namefeild.sendKeys(name);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}	
}
public void SelectAccountType(String s)  {
	try {
	if(s.equals("Individual")) 
		Individual.click();
		else
		Professional.click();
	Thread.sleep(500);
}
	 catch(Exception e) {
			System.out.println(e);
		}
	}
public void selectCountry(String s) {
	try {
	clickonCountry.click();
		
	SelectCountry.sendKeys(s);
	Thread.sleep(500);
	Genricaction.Enterkey(1);
	
}
catch(Exception e) {
	System.out.println(e);
}
	
}
public void email(String s) {
	try {	emailfeild.sendKeys(s);
	Thread.sleep(500);
}
	catch(Exception e) {
		System.out.println(e);
	}
}

public void PhN_number(String s)  {
	try {	
	phonenumberfeild.sendKeys(s);
	Thread.sleep(500);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
public void Password(String s)  {
	
	try {passwordfeild.sendKeys(s);
	Thread.sleep(500);
}
	catch(Exception e) {
		System.out.println(e);
	}
	}
public void CnfrmPassword(String s) {
	try {
	passwordcnfrmfeild.sendKeys(s);
	Thread.sleep(500);
}
	catch(Exception e) {
	System.out.println(e);
}
}
	
public void ClickonTerms() {
	termBTn.click();
}
public void RegisterBtn() {
	Register.click();
}
public void send(String gender1,String name1,String type,String country,
		String phnumber,String email,String pwd,String pwd1){
	this.selectGender(gender1);
	this.name_user(name1);
	this.SelectAccountType(type);
	this.selectCountry(country);
	this.PhN_number(phnumber);
	this.email(email);
	this.Password(pwd);
	this.CnfrmPassword(pwd1);
	this.ClickonTerms();
	this.RegisterBtn();
}
}

