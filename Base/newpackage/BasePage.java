package newpackage;

import com.EjercicioSelenium.driver.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class BasePage {

	    protected WebDriver driver;
	    protected WebDriverWait wait;


	    public BasePage() {
	        this.driver = Setup.driver;
	        this.wait = new WebDriverWait(this.driver, 10000);
	    }
	    
	    public WebElement findElement(final By locator) {
	    	return wait.until(ExpectedConditions.elementToBeClickable(locator));

	    }
	 
}
