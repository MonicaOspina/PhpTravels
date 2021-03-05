package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapeoVerificacion {

    public static final Target NAME= Target.the("name").located(By.xpath("//tbody/tr[1]/td[3]"));
    public static final Target SLUG = Target.the("slug").located(By.xpath("//tbody/tr[1]/td[4]"));
}
