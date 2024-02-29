package contentCreation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageActions.Course_Consumption;
import pageActions.Course_Creation;
import pageActions.PublishedMethods;
import pageActions.TPDMethods;
import pageActions.UpForReviewMethods;
import pageActions.UserOnBoarding;
import pageObject.ExplorePage;
import utility.BaseClass;
import utility.DikshaUtils;

public class ValidateGuestUserGettingLoginPopUp extends BaseClass {

	@Test
	public void verifyGuestUserGettingLoginPopUpWhenClickedOnJoinCourseButtonForOpenBatch() throws Exception {

		UserOnBoarding.SelectUserRole("Student");
		UserOnBoarding.bmcpopuphandle();
		UserOnBoarding.locationpopuphandle();
		UserOnBoarding.login("Creator");
		String CourseName = Course_Creation.CreateCourseUsingTextbookAndSendForReview();
		UserOnBoarding.logout("Creator");
		UserOnBoarding.login("Reviewer");
		UpForReviewMethods.eTextbookAddedInCourse_up_For_Review(CourseName);
		UserOnBoarding.logout("Reviewer");
		UserOnBoarding.login("Creator");
		TPDMethods.createBatch(CourseName);
		UserOnBoarding.logout("Creator");
		Course_Consumption.searchContentForConsumption(CourseName);

	}

}
