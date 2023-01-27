package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import userinterface.FormularioPage;
import userinterface.MiDispositivoPage;

public class CambiarPaginaDispositivoStep implements Task {

    private String nombre, apellido, codigoPostal;

    public CambiarPaginaDispositivoStep(String nombre, String apellido, String codigoPostal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static CambiarPaginaDispositivoStep cambiarPaginaDispositivoStep(String nombre, String apellido, String codigopostal) {
        return Tasks.instrumented(CambiarPaginaDispositivoStep.class, nombre, apellido, codigopostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(MiDispositivoPage.TXT_NOMBRE),
                Enter.theValue(apellido).into(MiDispositivoPage.TXT_APELLIDO),
                Enter.theValue(codigoPostal).into(MiDispositivoPage.TXT_CODIGOPOSTAL),
                Click.on(MiDispositivoPage.BTN_CONTINUE));

    }
}
