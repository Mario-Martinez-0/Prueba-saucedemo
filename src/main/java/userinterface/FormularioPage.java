package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPage extends PageObject {

    public static final Target TXT_USUARIO = Target.the("Escribimos el usuario").located(By.id("user-name"));

    public static final Target TXT_CONTRASENA = Target.the("Escribimos la contraseña").located(By.id("password"));

    public static final Target TXT_LOGIN = Target.the("Boton login del formulario").located(By.id("login-button"));


}
