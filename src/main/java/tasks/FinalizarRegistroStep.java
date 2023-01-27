package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FormularioPage;
import userinterface.UltimoPasoPage;

public class FinalizarRegistroStep implements Task {

    public static FinalizarRegistroStep finalizarRegistroSteps() {
        return Tasks.instrumented(FinalizarRegistroStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UltimoPasoPage.BTN_FINAL)
        );
    }

}
