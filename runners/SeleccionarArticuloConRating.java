package com.bancolombia.soporte.finacle.screenplay.practica.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/practica/seleccionar_archivo_con_ranking.feature",
		glue="com/bancolombia/soporte/finacle/screenplay/practica/stepdefinitions",
		snippets=SnippetType.CAMELCASE)

public class SeleccionarArticuloConRating {
	
}
