package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.WebDriver;
import questions.Verificar;
import tasks.*;
import userinterfaces.Menu;
import userinterfaces.PhpTravelsPage;
import userinterfaces.Post;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static userinterfaces.AddCategoria.*;
import static userinterfaces.MapeoVerificacion.NAME;
import static userinterfaces.MapeoVerificacion.SLUG;
import static userinterfaces.Post.*;


public class PhpTravelsStepDefinitions {

    private PhpTravelsPage phpTravelsPage;

    @Managed(driver = "chrome")

    private WebDriver herBrowser;
    private Actor Moni = Actor.named("Monica");
    private Object LoginPage;


    @Before
    public void setUp(){
        Moni.can(BrowseTheWeb.with(herBrowser));
    }


    @Given("^que Moni desea loguear en la pagina php travels$")
    public void queMoniDeseaLoguearEnLaPaginaPhpTravels()  {
        Moni.wasAbleTo(
                OpenTheBrowser.on(phpTravelsPage),
                Login.on("admin@phptravels.com","demoadmin"));

    }

    @When("^ella se loguea, agrega una categoría y comprueba que lo agregó$")
    public void ellaSeLogueaAgregaUnaCategoríaYCompruebaQueLoAgregó()  {
        Moni.attemptsTo(
                GoTo.menu(Menu.BLOGS, Menu.BLOGS_CATEGORIA, Menu.ADD),
                Adicionar.categoria("Vacantes", "Selenium", "Serenity",
                "Cucumber","Screenplay","POM","Java", "Scrum", "Pruebas"),
                SelectFromOptions.byIndex(0).from(HABILITAR),
                Click.on(ADD_CATEGORY));
        Moni.should(
                seeThat(TheTarget.textOf(NAME), CoreMatchers.is("Vacantes")),
                seeThat(TheTarget.textOf(SLUG), CoreMatchers.is("Vacantes")),
                seeThat(Verificar.category(NAME),equalTo("Vacantes"))
               );
    }


    @Then("^ella vuelve a ingresar al menú y crea un post en la categoria anteriormente creada$")
    public void ellaVuelveAIngresarAlMenúYCreaUnPostEnLaCategoriaAnteriormenteCreada()  {
        Moni.attemptsTo(
                Go.post(Menu.BLOG, Menu.BLOG_POST, Menu.ADD_POST),
                SelectFromOptions.byIndex(5).from(CATEGORIA),
                SelectFromOptions.byIndex(8).from(RELATED_POST),
                Crear.blog("Estas contratada", "Felicitaciones!!",
                        "Vacantes", "Automatización"),
                Click.on(Post.SUBMIT));
    }
}
