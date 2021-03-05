package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import userinterfaces.LoginPanel;

public class Login implements Task {

    private final String password;
    private final String user;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Login on(String user, String password) {
        return Tasks.instrumented(Login.class, user, password);
    }


    @Override
    @Step("{0} se loguea en la pagina ocn usuario y contraseña")
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(user).into(LoginPanel.USER),
        Enter.theValue(password).into(LoginPanel.PASSWORD),
        Click.on(LoginPanel.BOTON_LOGIN));
    }
}
