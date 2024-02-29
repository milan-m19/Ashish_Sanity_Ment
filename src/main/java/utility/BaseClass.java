package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Network;

import pageObject.ExplorePage;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	public static WebDriverWait wait;
	public static ExtendReportGenerator reporter;

	@BeforeClass
	public void BS() throws Exception {

		config = new ConfigDataProvider();
		excel = new ExcelDataProvider();
	}

	@BeforeMethod
	public void Open() throws InterruptedException {
		
//		ChromeDevTools chromeDevTools = ((ChromeDriver) driver).getDevTools();
//		chromeDevTools.send(Network.clearBrowserCache());
//		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C://Users//Qualitrix//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-application-cache");
		driver = new ChromeDriver(options);
		//((JavascriptExecutor) driver).executeScript("window.localStorage.clear();");        
//		((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();");        
//		((JavascriptExecutor) driver).executeScript("window.location.reload(true);");
		driver.get(config.get_Env());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ExplorePage explore = PageFactory.initElements(driver, ExplorePage.class);
		Thread.sleep(3000);
	//	DikshaUtils.waitToBeVisibleAndClick(explore.getClosebutton());
		DikshaUtils.waitToBeClickableAndClick(explore.getExplorebutton());

	}

	@AfterMethod
	public void Close() {
		driver.quit();

	}

}
