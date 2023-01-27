package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UltimoPasoPage extends PageObject  {

    public static final Target BTN_FINAL = Target.the("Click en finalizar").located(By.id("finish"));

    public static final Target RESULTADO = Target.the("esre es el resultado esperado").located(By.xpath("//h2[@class='complete-header']"));

}
