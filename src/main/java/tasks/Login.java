package tasks;

import net.serenitybdd.screenplay.Actor;
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
    @Step("{0} login in the page with user and password")
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(user).into(LoginPanel.USER).thenHit(Keys.TAB),
        Enter.theValue(password).into(LoginPanel.PASSWORD).thenHit(Keys.TAB),
        Click.on(LoginPanel.BOTON_LOGIN));
    }
}
