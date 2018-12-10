package practica.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Select_Article_WithRating_Interface {
	
	public static final Target BUSCAR_ARTICULO = Target.the("buscar_articulo").located(By.id("searchQuestion"));
	public static final Target AGREGAR = Target.the("agregar").located(By.xpath("//button[@type='submit' and contains(text(),'Agregar')]"));
	public static final Target SELECCIONAR = Target.the("seleccionar").located(By.xpath("//*[@id='fb-overlay']/div/div/div/div/div[1]/div/button"));
	public static final Target BOLSA = Target.the("bolsa").located(By.xpath("//i[@class='fb-masthead-basket__count']"));

}
