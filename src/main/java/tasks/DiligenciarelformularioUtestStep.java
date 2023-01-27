package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FormularioPage;

public class DiligenciarelformularioUtestStep implements Task {

    private String usuario, contrasena;

    public DiligenciarelformularioUtestStep(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static DiligenciarelformularioUtestStep diligenciarelformularioUtestStep(String usuario, String contrasena) {
        return Tasks.instrumented(DiligenciarelformularioUtestStep.class, usuario,contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
            Enter.theValue(usuario).into(FormularioPage.TXT_USUARIO),
            Enter.theValue(contrasena).into(FormularioPage.TXT_CONTRASENA),
            Click.on(FormularioPage.TXT_LOGIN)
        );
    }

}
