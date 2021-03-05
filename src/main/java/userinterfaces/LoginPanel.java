package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPanel {

    public static final Target USER = Target.the("user").located(By.name("email"));
    public static final Target PASSWORD = Target.the("password").located(By.name("password"));
    public static final Target BOTON_LOGIN = Target.the("boton_login").located(By.cssSelector("body:nth-child(2) div:nth-child(6) form.form-signin.form-horizontal.wow.fadeIn.animated.animated > button.btn.btn-primary.btn-block.ladda-button.fadeIn.animated.btn-lg:nth-child(2)"));
}
