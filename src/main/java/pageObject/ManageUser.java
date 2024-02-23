package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManageUser {
     
	
	
			
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter your name']")
	private WebElement EnterName;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Add user ']")
	private WebElement AddUserTab;
	
	@FindBy(how=How.XPATH,using="//div[@aria-label='Add User']")
	private WebElement addAnotherUser;
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Cancel')]")
		private WebElement validateCancelButton;

	public WebElement getvalidateCancelButton() {
			return validateCancelButton;
		}
	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Name')]")
	private WebElement validateLabel;
 
    public WebElement getvalidateLabel() {
		return validateLabel;
	}
   
	public WebElement getvalidateContinue() {
		return validateContinue;
	}
	
	
	public WebElement getcontinueButton() {
			return continueButton;
		}
		
		public WebElement getclickCheckBox() {
			return clickCheckBox;
		}
	
	@FindBy(how=How.XPATH,using="//input[@role='checkbox']")
		private WebElement clickCheckBox;
		
		
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Continue')]")
		private WebElement continueButton;

@FindBy(how=How.XPATH,using="//button[contains(text(),'Continue')]")
	private WebElement validateContinue;
    
    @FindBy(how=How.XPATH,using="//button[contains(text(),' Change user ')]")
    	private WebElement changeUser;
    
    public WebElement getchangeUser() {
    		return changeUser;
    	}
   
    public WebElement getselectAddedUser() {
    		return selectAddedUser;
    	}
    	@FindBy(how=How.XPATH,using="//button[contains(text(),' Add user ')]//following::span[3]")
    	private WebElement selectAddedUser;
	 
	
	
	public WebElement getaddAnotherUser() {
		return addAnotherUser;
	}

	
	
	public WebElement getEnterName() {
		return EnterName;
	}

	public void setEnterName(WebElement enterName) {
		EnterName = enterName;
	}

	public WebElement getAddUserTab() {
		return AddUserTab;
	}

	public void setAddUserTab(WebElement addUserTab) {
		AddUserTab = addUserTab;
	}
	
}
