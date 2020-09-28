package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasicPage {
	
	protected WebDriver driver;
	protected WebDriverWait waits;
	
	public BasicPage(WebDriver driver, WebDriverWait waits) {
		this.driver = driver;
		this.waits = waits;
	}
	
	
	

}
