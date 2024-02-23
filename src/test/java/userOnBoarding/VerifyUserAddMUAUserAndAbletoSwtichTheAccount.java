package userOnBoarding;
import org.testng.annotations.Test;

import pageActions.UserOnBoarding;
import utility.BaseClass;

public class VerifyUserAddMUAUserAndAbletoSwtichTheAccount extends BaseClass {
	@Test
	public void verifyNewMUSshouldGetTandCpoPupForTheFirstTimeOnlyPostSwitchingActivatingAndShouldBeAbleToAcceptAndProceedFurther() throws Exception {
		String userRole = UserOnBoarding.SelectUserRole("Head Teacher & Official");
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle(userRole);
		UserOnBoarding.login("AddUserCredNew");
		UserOnBoarding.validateDuringAddUserAndSwitchMUAuserUnableToGoFurtherWithoutSelectingCheckBox();
		
	}
}


