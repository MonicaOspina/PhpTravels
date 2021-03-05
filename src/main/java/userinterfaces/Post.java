package userinterfaces;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Post {

  public static final Target RELATED_POST = Target.the("related post").located(By.name("relatedposts[]"));
  public static final Target POST_TITLE = Target.the("post title").locatedBy("//body/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
  public static final Target KEYWORDS = Target.the("keywords").located(By.name("keywords"));
  public static final Target DESCRIPTION = Target.the("Description").located(By.name("metadesc"));
  public static final Target SUBMIT = Target.the("submit").locatedBy("//button[contains(text(),'Submit')]");
  public static final Target TEXTO = Target.the("texto").locatedBy("//p");
}
