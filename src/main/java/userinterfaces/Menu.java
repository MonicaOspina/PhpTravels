package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Menu {

    public static final Target BLOGS = Target.the("blogs").located(By.xpath("//body/div[3]/nav[1]/div[2]/ul[1]/li[14]/a[1]"));
    public static final Target BLOGS_CATEGORIA = Target.the("blogs_categoria").locatedBy("//a[contains(text(),'Blog Categories')]");
    public static final Target ADD = Target.the("add_buttom").locatedBy("//body/div[3]/div[1]/div[2]/div[2]/div[1]/button[1]");
    public static final Target BLOG = Target.the("blog").located(By.xpath("//body/div[3]/nav[1]/div[2]/ul[1]/li[14]/a[1]"));
    public static final Target BLOG_POST = Target.the("blogs Post").locatedBy("//a[contains(text(),'Posts')]");
    public static final Target ADD_POST = Target.the("add post").locatedBy("//body/div[3]/div[1]/div[2]/form[1]/button[1]");

}
