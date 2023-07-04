package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericALL.ActionandSelectclass;
import GenericALL.ActionandSelectclass.action;
import GenericALL.ActionandSelectclass.slct;
import GenericALL.initialisepom;

public class Pompractice extends initialisepom{
  @FindBy(id="firstname")
  private WebElement firstname;
  @FindBy(id="surname")
  private WebElement lastname;
  @FindBy(id="age")
  private WebElement age;
  @FindBy(id="country")
  private WebElement country;
  @FindBy(id="notes")
  private WebElement notes;
  @FindBy(xpath="//input[@type='submit']")
  private WebElement submit;

  public Pompractice(WebDriver driver) {
	  super(driver);
  }
  
public void fname(String name) {
	firstname.sendKeys(name);
}

public void lname(String name) {
	lastname.sendKeys(name);
}
public void age(String age1)
{ 
	age.sendKeys(age1);
	
}
public void Countrys(String name) {
	country.click();
	ActionandSelectclass.SelectDropdown(country, slct.visibletxt, name);
}
public void Notes1(String s) {
	notes.sendKeys(s);
}
public void Submit(WebDriver driver) 
{
	ActionandSelectclass.mouseAction(submit, driver, action.lclick);
	}
public void filldata(String fname,String lname,String age,String country,String notes,WebDriver driver) {
	this.fname(fname);
	this.lname(lname);
	this.age(age);
	this.Countrys(country);
	this.Notes1(notes);
	this.Submit(driver);
	
}
}