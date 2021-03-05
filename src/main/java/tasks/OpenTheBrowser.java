package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class OpenTheBrowser implements Task {

    private PageObject page;

    //constructor
    public OpenTheBrowser(PageObject page){
        this.page = page;
    }

    //metodo
    public static OpenTheBrowser on(PageObject page) {
        return Tasks.instrumented(OpenTheBrowser.class, page);
    }

    @Override
    @Step("{0} abre el navegador")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }
}