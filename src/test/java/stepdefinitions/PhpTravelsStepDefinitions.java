package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;
import userinterfaces.AddCategoria;
import userinterfaces.Menu;
import userinterfaces.PhpTravelsPage;
import userinterfaces.Post;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static userinterfaces.AddCategoria.*;
import static userinterfaces.MapeoVerificacion.NAME;
import static userinterfaces.Post.*;


public class PhpTravelsStepDefinitions {

    private PhpTravelsPage phpTravelsPage;

    @Managed(driver = "chrome")

    private WebDriver herBrowser;
    private Actor Monica = Actor.named("Monica");
    private Object LoginPage;


    @Before
    public void setUp(){
        Monica.can(BrowseTheWeb.with(herBrowser));
    }


    @Given("^que Moni desea loguear en la pagina php travels$")
    public void queMoniDeseaLoguearEnLaPaginaPhpTravels()  {
        Monica.wasAbleTo(OpenTheBrowser.on(phpTravelsPage));
        Monica.wasAbleTo(Login.on("admin@phptravels.com","demoadmin"));
    }

    @When("^ella se loguea, agrega una categoría y comprueba que lo agregó$")
    public void ellaSeLogueaAgregaUnaCategoríaYCompruebaQueLoAgregó()  {
        Monica.attemptsTo(GoTo.menu(Menu.BLOGS, Menu.BLOGS_CATEGORIA, Menu.ADD));
        Monica.attemptsTo(Adicionar.categoria("Deporte", "B", "C",
                "D","E","F","G", "H", "I"));
        Monica.attemptsTo(SelectFromOptions.byIndex(0).from(HABILITAR));
        Monica.attemptsTo(Click.on(ADD_CATEGORY));
        //Monica.should(seeThat(TheTarget.textOf(NAME),is("Deporte")));
        //Monica.attemptsTo(Switch.toFrame(BODY));

    }



    @Then("^ella vuelve a ingresar al menú y crea un post en la categoria anteriormente creada$")
    public void ellaVuelveAIngresarAlMenúYCreaUnPostEnLaCategoriaAnteriormenteCreada()  {
        Monica.attemptsTo(Go.post(Menu.BLOG, Menu.BLOG_POST, Menu.ADD_POST));
        Monica.attemptsTo(SelectFromOptions.byIndex(5).from(CATEGORIA));
        Monica.attemptsTo(SelectFromOptions.byIndex(8).from(RELATED_POST));
        Monica.attemptsTo(Crear.blog("Estas contratada", "Felicitaciones!!", "s", "y"));
        Monica.attemptsTo(Click.on(Post.SUBMIT));




    }

}
