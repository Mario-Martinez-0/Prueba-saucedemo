package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtestPage;

public class AbrirAppUtest implements Task {

    private UtestPage utestPage;

    public static AbrirAppUtest abrirApp() {
        return Tasks.instrumented(AbrirAppUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
