package co.com.choucair.formacion.reto6.stepdefinitions;

import co.com.choucair.formacion.reto6.tasks.Comprar;
import co.com.choucair.formacion.reto6.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ExitoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que quiero comprar un televisor para ver el mundial de futbol$")
    public void queQuieroComprarUnTelevisorParaVerElMundialDeFutbol() {
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thePage(),(Comprar.onThePage()));

    }

    @Cuando("^ingreso a la página virtual del éxito y selecciono el que más me gusta$")
    public void ingresoALaPáginaVirtualDelÉxitoYSeleccionoElQueMásMeGusta()  {

    }

    @Entonces("^realizo la compra para que sea enviado a mi casa$")
    public void realizoLaCompraParaQueSeaEnviadoAMiCasa()  {
    }

}
