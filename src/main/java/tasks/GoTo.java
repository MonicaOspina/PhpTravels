package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import userinterfaces.Menu;

public class GoTo implements Task {

    public static Performable menu;
    private Target blogs;
    private Target blogs_categoria;
    private Target add;

    public GoTo(Target blogs, Target blogs_categoria, Target add){
        this.blogs = blogs;
        this.blogs_categoria = blogs_categoria;
        this.add = add;
    }
    
    public static GoTo menu(Target blogs, Target blogs_categoria, Target add){
        return Tasks.instrumented(GoTo.class, blogs, blogs_categoria, add);
    }



    @Override 
    @Step("{0} añade categoria")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Menu.BLOGS),
                Click.on(Menu.BLOGS_CATEGORIA),
                Click.on(Menu.ADD)
        );
    }
}
