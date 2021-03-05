package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userinterfaces.MapeoVerificacion;

public class Verificar implements Question <String> {

    public static Verificar category(Target name) {
        return new Verificar();
    }

    @Override
    public String answeredBy(Actor actor) {
        return  Text.of(MapeoVerificacion.NAME).viewedBy(actor).asString();
    }
}
