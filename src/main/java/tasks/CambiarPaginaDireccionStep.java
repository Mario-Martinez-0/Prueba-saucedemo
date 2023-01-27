package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.DireccionPage;
import userinterface.FormularioPage;
import userinterface.MiDispositivoPage;
import userinterface.UtestPage;

public class CambiarPaginaDireccionStep implements Task {


    public static CambiarPaginaDireccionStep cambiarPaginaDireccionStep() {
        return Tasks.instrumented(CambiarPaginaDireccionStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(Click.on(DireccionPage.BTN_COMPRA),
                Click.on(DireccionPage.BTN_CARRITO),
                Click.on(DireccionPage.BTN_CHECKOUT));
    }
}
