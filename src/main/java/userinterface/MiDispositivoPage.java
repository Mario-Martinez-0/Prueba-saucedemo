package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MiDispositivoPage extends PageObject {

    public static final Target TXT_NOMBRE = Target.the("Click para ingresar el nombre").located(By.id("first-name"));

    public static final Target TXT_APELLIDO = Target.the("Click para ingresar el apellido").located(By.id("last-name"));

    public static final Target TXT_CODIGOPOSTAL = Target.the("Click para ingresar el codigo postal").located(By.id("postal-code"));

    public static final Target BTN_CONTINUE = Target.the("Click para continuar").located(By.id("continue"));

}
