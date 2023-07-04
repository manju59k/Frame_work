package GenericALL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionandSelectclass {
    public enum slct{index,
    	value,
    	visibletxt,
    	}
    public enum action{
    	rclick,
    	dclick,
    	lclick,	
    }
	private static Actions init(WebDriver driver) {
		Actions a=new Actions(driver);
		return a;
	}
	
	private static void rightClick(WebElement ele, WebDriver driver) {
		Actions a=init(driver);
		a.contextClick(ele).perform();
	}
	private static void leftClick(WebElement ele, WebDriver driver) {
		Actions a=init(driver);
		a.click(ele).perform();
		}
	private static void  doubleClick(WebElement ele, WebDriver driver) {
		Actions a=init(driver);
		a.doubleClick(ele).perform();
	}
	public static void DragDrop(WebElement src,WebElement dst, WebDriver driver) {
		Actions a=init(driver);
		a.dragAndDrop(src,dst).perform();
	}
	
	public static void mouseAction(WebElement ele, WebDriver driver,action type ) {
		switch  (type){
		case rclick:rightClick(ele,driver);
		break;
		case lclick:leftClick(ele,driver);
		break;
		case dclick:doubleClick(ele,driver);
		break;
		default:System.out.println("please send correct mouse action");
			break;
		}
	}
	
	private static Select SelectInit(WebElement ele) {
		Select s=new Select(ele);
		return s;
	}
	
	public static void SelectDropdown(WebElement ele,slct type, String value) {
		switch  (type){
		case index:slctByIndex(ele,Integer.parseInt(value));
			break;
		case value:slctByValue(ele,value);
		break;	
		case visibletxt:slctByVisibletxt( ele,value);
		break;
		default:System.out.println("please pass the correct drop down criteria");
			break;
		}
	}
	public static void deSelectDropdown(WebElement ele,slct type, String value) {
		switch  (type){
		case index:deslctByIndex(ele,Integer.parseInt(value));
			break;
		case value:deslctByValue(ele,value);
		break;	
		case visibletxt:deslctByVisibletxt(ele,value);
		break;
		default:System.out.println("please pass the correct drop down criteria");
			break;
		}
	}
	
	private static void slctByValue(WebElement ele,String value) {
		Select s=SelectInit(ele);
		s.selectByValue(value);
	}

	private static void slctByVisibletxt(WebElement ele,String value) {
		Select s=SelectInit(ele);
		s.selectByVisibleText(value);
}

	private static void deslctByIndex(WebElement ele,int value) {
		Select s=SelectInit(ele);
		s.selectByIndex(value);
}
	
	private static void slctByIndex(WebElement ele,int value) {
		Select s=SelectInit(ele);
		if(s.isMultiple())
		s.deselectByIndex(value);
		else System.out.println(" drop down is not multi select dropdown");
		
}
	private static void deslctByValue(WebElement ele,String value) {
		Select s=SelectInit(ele);
		if(s.isMultiple())
		s.selectByValue(value);
		else System.out.println(" drop down is not multi select dropdown");
		
		
	}

	private static void deslctByVisibletxt(WebElement ele,String value) {
		Select s=SelectInit(ele);
		if(s.isMultiple())
		s.deselectByVisibleText(value);
}
	}