package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DireccionPage extends PageObject {


    public static final Target BTN_COMPRA = Target.the("Click en el boton Add to cart").located(By.name("add-to-cart-sauce-labs-backpack"));

    public static final Target BTN_CARRITO = Target.the("Click en el boto carrito").located(By.id("shopping_cart_container"));

    public static final Target BTN_CHECKOUT = Target.the("Click en el boton checkout").located(By.id("checkout"));
}
