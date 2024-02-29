package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExplorePage {
	
	@FindBy(how=How.XPATH,using="//a[@data-translate='btnExploreDiksha']")
	private WebElement Explorebutton;
	
	@FindBy(how=How.XPATH,using="(//button[@aria-label='Close'])[1]")
	private WebElement Closebutton;
	
	public WebElement getClosebutton() {
		return Closebutton;
	}

	public WebElement getExplorebutton() {
		return Explorebutton;
	}
 
}
