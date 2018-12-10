package practica.questions;

import practica.userinterfaces.Verify_Product_Intarface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

	
	public static LaRespuesta es() {
		
		return new LaRespuesta();
	}
	
	@Override
	public String answeredBy(Actor actor) {
		
		Verify_Product_Intarface.VERIFY_PRODUCT.resolveFor(actor).waitUntilVisible();
		System.out.println(Text.of(Verify_Product_Intarface.VERIFY_PRODUCT).viewedBy(actor).asString());
		return Text.of(Verify_Product_Intarface.VERIFY_PRODUCT).viewedBy(actor).asString();
	}

}
