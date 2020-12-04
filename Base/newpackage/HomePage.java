package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	private static final String HOME_PAGE_URL = "https://www.demoblaze.com/index.html";
	
	private String userName = "usuarioEjercicio";
	private String userPassword = "contraseñaEjercicio";

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
    }

	void goToSignInSection() {
		By botonSignIn = By.id("signin2");
		this.findElement(botonSignIn).click();
	}
	
	void completeSignInRequest() {
		
		WebElement wSignUserName = this.findElement(By.id("sign-username"));
		wSignUserName.sendKeys(userName);
		WebElement wSignUserPassword = this.findElement(By.id("sign-password"));
		wSignUserPassword.sendKeys(userPassword);
		
	}
	
	void signInClick () {	
		this.findElement(By.xpath("//button[(@class='btn btn-primary') and (contains(text(),'Sign up'))]")).click();
	}
	
	void goToLoginSection() {
		By botonLogin = By.id("login2");
		this.findElement(botonLogin).click();
	}
	
	void completeLogInRequest() {

		WebElement wLoginUserName = this.findElement(By.id("loginusername"));
		wLoginUserName.sendKeys(userName);

		WebElement wLoginUserPassword = this.findElement(By.id("loginpassword"));
		wLoginUserPassword.sendKeys(userPassword);
		
	}
	
	void logInClick() {
		this.findElement(By.xpath("//button[(@class='btn btn-primary') and (contains(text(),'Log in'))]")).click();
		
	}
	void validateSessionActive() {
		By usuarioLogueado = By.id("nameofuser");
		this.findElement(usuarioLogueado);
		
	}
	void logOutClick() {
		By botonLogOut = By.id("logout2");
		this.findElement(botonLogOut).click();
	}
	void validateLogOut() {
		By botonLogin = By.id("login2");
		this.findElement(botonLogin).click();
	}

	public void goToProductDetail() {
		By productoLaptopi5 = By.xpath("//a[(@class='hrefch') and (contains(text(), 'Sony vaio i5'))]");
		this.findElement(productoLaptopi5).click();
		
	}
	
}
