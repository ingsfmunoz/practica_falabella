package practica.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static practica.userinterfaces.Select_Article_WithRating_Interface.AGREGAR;
import static practica.userinterfaces.Select_Article_WithRating_Interface.BUSCAR_ARTICULO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import practica.userinterfaces.Select_Article_WithRating_Interface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SelectFileWithRating implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(BUSCAR_ARTICULO));
		actor.attemptsTo(Enter.theValue("Carro")
				.into(BUSCAR_ARTICULO)
				.thenHit(Keys.ENTER));
		
		int i=4;
		
		while(i<=5){
			
			String path = "//p[@class='fb-rating-stars__count' and contains(text(),"+i+")]//preceding::div[@class='content__image'][1]";
			WebElement element = BrowseTheWeb.as(actor).getDriver().findElement(By.xpath(path));
			
			if(element.isDisplayed()){
				element.click();
				Select_Article_WithRating_Interface.AGREGAR.resolveFor(actor).waitUntilVisible();
				actor.attemptsTo(Click.on(AGREGAR));
				Select_Article_WithRating_Interface.SELECCIONAR.resolveFor(actor).waitUntilVisible();
				actor.attemptsTo(Click.on(Select_Article_WithRating_Interface.SELECCIONAR));
				Select_Article_WithRating_Interface.BOLSA.resolveFor(actor).waitUntilVisible();
				actor.attemptsTo(Click.on(Select_Article_WithRating_Interface.BOLSA));
				break;
			}
			else
			{
				i=1+1;
			}
		}
		
		}

	public static SelectFileWithRating select() {
		return instrumented(SelectFileWithRating.class);
	}	
}