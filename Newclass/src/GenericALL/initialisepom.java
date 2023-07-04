package GenericALL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class initialisepom {

    public WebDriver driver; 
    public initialisepom(WebDriver driver) {
	PageFactory.initElements(driver, this);
  }
  }
