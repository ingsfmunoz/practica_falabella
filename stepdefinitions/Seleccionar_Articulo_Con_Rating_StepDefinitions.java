package com.bancolombia.soporte.finacle.screenplay.practica.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import practica.exception.LaRespuestaNoEsCorrecta;
import practica.questions.LaRespuesta;
import practica.tasks.OpenTheBrowser;
import practica.tasks.SelectFileWithRating;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Seleccionar_Articulo_Con_Rating_StepDefinitions {

	@Managed(driver="ie")
	private WebDriver hisBrowser;
	
	private Actor usuario = Actor.named("Usuario");
	
	@Before
	public void setUP()
		{
			usuario.can(BrowseTheWeb.with(hisBrowser));
		}
	
	
	@Given("^usuario ingreso a falabella$")
	public void usuarioIngresoAFalabella() throws Exception {
		usuario.wasAbleTo(OpenTheBrowser.on());
		
	}
	
	@When("^selecciona un articulo con rating$")
	public void seleccionaUnArticuloConrating() throws Exception {
		usuario.wasAbleTo(SelectFileWithRating.select());
	}

	@Then("^verifica el articulo en mis ordenes$")
	public void verificaElArticuloEnMisOrdenes() throws Exception {
	    usuario.should(seeThat(LaRespuesta.es(),equalTo("DISPONIBLE")).orComplainWith(LaRespuestaNoEsCorrecta.class,"Se esperabana mensaje de DISPONIBLE"));
	}
		
	
}
