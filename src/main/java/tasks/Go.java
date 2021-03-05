package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterfaces.Menu;

public class Go implements Task {

    private final Target blogs;
    private final Target blogs_post;
    private final Target add_post;

    public Go(Target blogs, Target blogs_post, Target add_post){
        this.blogs = blogs;
        this.blogs_post = blogs_post;
        this.add_post = add_post;
    }

    public static Go post(Target blogs, Target blog_post, Target addpost) {
        return Tasks.instrumented(Go.class, blogs, blog_post, addpost);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Menu.BLOGS));
        actor.attemptsTo(Click.on(Menu.BLOG_POST));
        actor.attemptsTo(Click.on(Menu.ADD_POST));

    }
}
