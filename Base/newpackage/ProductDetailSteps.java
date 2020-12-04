package newpackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailSteps {
	
	private ProductDetail productDetail;

	public ProductDetailSteps() {
		this.productDetail = new ProductDetail();
	}
	
    @And("^el usuario visualiza la informacion del producto$")
    public void aUserValidateProductInfo() {
    	this.productDetail.validateProductInfo();
    }
    @And("^selecciona el texto agregar al carro$")
    public void aUserAddToCart() {
    	this.productDetail.addToCart();
    }
    
    @Then("^aparece alerta para informar que se agrego el producto$")
    public void addedToCartAlert() {
    	this.productDetail.productAddedAlert();
    }
    
   @When("^ingresa al carrito$")
   public void aUserNavigetsToCart() {
   		this.productDetail.goToCart();
   }
   
   @Then("^aparece el producto seleccionado en el carrito$")
   public void aUserValidateProductInCart() {
  		this.productDetail.validateProductInCart();
  }
}
