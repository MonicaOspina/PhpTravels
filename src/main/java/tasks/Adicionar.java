package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import userinterfaces.AddCategoria;


public class Adicionar  implements Task {


    private final String Category_name, Vietnamese, Russian, Arabic, Farsi, Turkish, French, Spanish, German;


    public Adicionar(String Category_name, String Vietnamese, String Russian, String Arabic, String Farsi, String Turkish, String French, String Spanish, String German) {
        this.Category_name = Category_name;
        this.Vietnamese = Vietnamese;
        this.Russian = Russian;
        this.Arabic = Arabic;
        this.Farsi = Farsi;
        this.Turkish = Turkish;
        this.French = French;
        this.Spanish = Spanish;
        this.German = German;
    }



    public static Adicionar categoria (String Category_name, String Vietnamese, String Russian, String Arabic, String Farsi, String Turkish, String French, String Spanish, String German) {
        return Tasks.instrumented(Adicionar.class, Category_name,  Vietnamese, Russian, Arabic, Farsi, Turkish,French,Spanish, German );
    }


    @Override
    @Step("{0} añade categoria")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Category_name).into(AddCategoria.CATEGORY_NAME).thenHit(Keys.TAB),
                //Enter.theValue(Status).into(AddCategoria.ENABLE).thenHit(Keys.TAB),
                Enter.theValue(Vietnamese).into(AddCategoria.VIETNAMESE).thenHit(Keys.TAB),
                Enter.theValue(Russian).into(AddCategoria.RUSSIAN).thenHit(Keys.TAB),
                Enter.theValue(Arabic).into(AddCategoria.ARABIC).thenHit(Keys.TAB),
                Enter.theValue(Farsi).into(AddCategoria.FARSI).thenHit(Keys.TAB),
                Enter.theValue(Turkish).into(AddCategoria.TURKISH).thenHit(Keys.TAB),
                Enter.theValue(French).into(AddCategoria.FRENCH).thenHit(Keys.TAB),
                Enter.theValue(Spanish).into(AddCategoria.SPANISH).thenHit(Keys.TAB),
                Enter.theValue(German).into(AddCategoria.GERMAN).thenHit(Keys.TAB)
        );
    }
}
