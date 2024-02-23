package Groups;

import org.testng.annotations.Test;

import pageActions.CreateGroups;
import pageActions.UserOnBoarding;
import utility.BaseClass;

public class VerifyGroupAdminIsAbleToEditAndDelete extends BaseClass {
	@Test
	public void verifyGroupAdminIsAbleToEditAndDelete() throws Exception {
		UserOnBoarding.SelectUserRole("Student");
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("GroupAdmin");
		CreateGroups.ValidateCreateGroupsPopup();
		CreateGroups.enableTheDiscussionForum();
		CreateGroups.createDiscussionForExistingGroup();
		CreateGroups.DisableDiscussionForum();
		CreateGroups.AdminAbleToDeleteTheGroup();
	}
}