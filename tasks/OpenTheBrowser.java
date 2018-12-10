package practica.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import practica.userinterfaces.AbrirPaginaFalabella;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

	
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(new AbrirPaginaFalabella()));
		
	}

	public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
	}
	
	
}
