package co.com.choucair.formacion.reto6.tasks;


import co.com.choucair.formacion.reto6.userinterface.ComprarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Comprar implements Task {
    public static Comprar onThePage() {
        return Tasks.instrumented(Comprar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(ComprarPage.Televisor),
            Click.on(ComprarPage.Marca),
            Click.on(ComprarPage.Pulgadas),
            Click.on(ComprarPage.Resolucion),
            Click.on(ComprarPage.Comprar)
    );
    }
}
