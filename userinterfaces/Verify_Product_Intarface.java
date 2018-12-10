package practica.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class Verify_Product_Intarface {

	public static final Target VERIFY_PRODUCT = Target.the("Verify_Product").located(By.xpath("//p[@class='fb-product__stock__message fb-product__stock__message--in-stock']"));
	
}
