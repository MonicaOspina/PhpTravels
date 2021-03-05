package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Keys;
import userinterfaces.Post;

import java.security.Key;

public class Crear implements Task {

    public static Performable blog;
    private final String post_title, body, keywords, description;

    public Crear(String post_title, String body, String keywords, String description){
        this.post_title = post_title;
                this.body = body;
        this.keywords = keywords;
        this.description = description;

    }

    public static Crear blog(String post_title, String body, String keywords, String description ){
        return Tasks.instrumented(Crear.class, post_title, body, keywords, description);

    };



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(post_title).into(Post.POST_TITLE).thenHit(Keys.TAB),
                Switch.toFrame(0),
                Enter.theValue(body).into(Post.TEXTO).thenHit(Keys.TAB),
                Switch.toParentFrame(),
                Enter.theValue(keywords).into(Post.KEYWORDS).thenHit(Keys.TAB),
                Enter.theValue(description).into(Post.DESCRIPTION).thenHit(Keys.TAB)

        );

    }
}
