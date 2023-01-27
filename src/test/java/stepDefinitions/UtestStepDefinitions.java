package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarRegistroStep;
import tasks.*;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public  void setStage(){ OnStage.setTheStage((new OnlineCast()));
    }

    @Dado("^que el usuario ya esta registrado$")
    public void queElUsuarioYaEstaRegistrado() throws Exception {
        OnStage.theActorCalled("Mario").wasAbleTo(AbrirAppUtest.abrirApp());
    }


    @Cuando("^ingresemos el usuario y la contrasena le damos click al boton Login, elegimos un producto prosedemos a realizar la compra del mismo$")
    public void ingresemosElUsuarioYLaContrasenaLeDamosClickAlBotonLoginElegimosUnProductoProsedemosARealizarLaCompraDelMismo(List<String> datos) {
        OnStage.theActorCalled("Mario").attemptsTo(DiligenciarelformularioUtestStep.diligenciarelformularioUtestStep(datos.get(0), datos.get(1)));
        OnStage.theActorCalled("Mario").attemptsTo(CambiarPaginaDireccionStep.cambiarPaginaDireccionStep());
        OnStage.theActorCalled("Mario").attemptsTo(CambiarPaginaDispositivoStep.cambiarPaginaDispositivoStep(datos.get(2), datos.get(3), datos.get(4)));
        OnStage.theActorCalled("Mario").wasAbleTo(FinalizarRegistroStep.finalizarRegistroSteps());
    }


    @Entonces("^El usuario debera ver en la pantallan THANK YOU FOR YOUR$")
    public void elUsuarioDeberaVerEnLaPantallanTHANKYOUFORYOUR(List<String> datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarRegistroStep.confirmarResultado(datos.get(0))));
}



}
