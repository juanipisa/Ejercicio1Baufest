package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetail extends BasePage {
	
	
	
	public void validateProductInfo() {
		this.findElement(By.xpath("//h2[(@class='name') and (contains(text(),'Sony vaio i5'))]"));
	}
	
	public void addToCart() {
		By botonAddToCart = By.xpath("//a[(@class='btn btn-success btn-lg') and (contains(text(), 'Add to cart'))]");
		this.findElement(botonAddToCart).click();
		
	}

	public void productAddedAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
    }

	public void goToCart() {
		By goToCartBotton = By.xpath("//a[(@class='nav-link') and (contains(text(),'Cart'))]");
		this.findElement(goToCartBotton).click();
		
	}

	public void validateProductInCart() {
		this.findElement(By.xpath("//td[(contains(text(),'Sony vaio i5'))]"));
		this.findElement(By.xpath("//td[(contains(text(),'790'))]"));
		
	}
		
}
	
	


