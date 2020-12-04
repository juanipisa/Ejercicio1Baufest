package newpackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^el usuario se encuentra en el inicio$")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
    }

    @When("^ingresa al formulario de registro$")
    public void aUserNavigatesToSignUp() {
    	this.homePage.goToSignInSection();
    }

    @And("^completa el formulario de registro con datos validos$")
    public void aUserCompleteTheSignUpRequest() {
        this.homePage.completeSignInRequest();
    }
    
    @Then("^el usuario se crea correctamente$")
    public void aUserClickOnSignIn() {
        this.homePage.signInClick();
    }   
    
    @When("^ingresa al formulario de login$")
    public void aUserNavigatesToLogIn() {
    	this.homePage.goToLoginSection();
    }
    
    @And("^completa el formulario de login con datos validos$")
    public void aUserCompleteTheLogInRequest() {
        this.homePage.completeLogInRequest();
    }
    
    @Then("^el usuario se loguea correctamente$")
    public void aUserClickOnLogIn() {
        this.homePage.logInClick();
    } 
    
    @Given("^el usuario se encuentra en el inicio logueado$")
    public void aUserHasNotASesionActive() {
        this.homePage.validateSessionActive();
    }
    
    @When("^el usuario cierra sesion$")
    public void aUserClickOnLogOut() {
        this.homePage.logOutClick();
    } 
    
    @Then("^el usuario es redirigido al inicio sin estar logueado$")
    public void aUserValidateLogOut() {
        this.homePage.validateLogOut();
    } 
    
    @When("^selecciona un producto laptop del catalogo$")
    public void aUserClickOnALaptop() {
        this.homePage.goToProductDetail();
    }

}