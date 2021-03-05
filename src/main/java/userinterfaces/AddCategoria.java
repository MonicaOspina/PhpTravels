package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCategoria {

    public static final Target CATEGORY_NAME = Target.the("Category_Name").located(By.name("name"));
    public static final Target HABILITAR = Target.the("Status").located(By.name("status"));
    public static final Target VIETNAMESE = Target.the("Vietnamese").located(By.name("translated[vi][name]"));
    public static final Target RUSSIAN = Target.the("Russian").located(By.name("translated[ru][name]"));
    public static final Target ARABIC = Target.the("Arabic").located(By.name("translated[ar][name]"));
    public static final Target FARSI = Target.the("Farsi").located(By.name("translated[fa][name]"));
    public static final Target TURKISH = Target.the("Turkish").located(By.name("translated[tr][name]"));
    public static final Target FRENCH = Target.the("French").located(By.name("translated[fr][name]"));
    public static final Target SPANISH = Target.the("Spanish").located(By.name("translated[es][name]"));
    public static final Target GERMAN = Target.the("German").located(By.name("translated[de][name]"));
    public static final Target ADD_CATEGORY = Target.the("add category").locatedBy("//body/div[3]/div[1]/div[3]/div[2]/div[1]/form[1]/div[3]/button[2]");
    public static final Target CATEGORIA = Target.the("category").locatedBy("//body/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/select[1]");
}
