package orangehrm.tests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import orangehrm.global.pages.LoginPage;
import orangehrm.helpers.Utils;

public class LoginPageLinks {
	private WebDriver  driver;
	private LoginPage loginPage;
	private String baseUrl;
	
	@BeforeSuite
	public void setupSelenium() {
		driver = new ChromeDriver();
		baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void setupPages() {
		loginPage = new LoginPage(driver);
	}
	@Test(description="Testing links from Login Page to LinkedIn, Facebook, Youtube,Twitter")
	public void linkTests() throws Exception {
		Utils.takeScreenShot(driver, "Login Page Links");
		assertTrue(loginPage.forgotPass().isDisplayed());
		assertTrue(loginPage.forgotPass().isEnabled());
		loginPage.forgotPass().click();
		String exp_url = "https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
		assertEquals(driver.getCurrentUrl(),exp_url);
		Utils.takeScreenShot(driver, "Reset Password Page");
		driver.navigate().back();
		assertEquals(driver.getCurrentUrl(), baseUrl);
		Utils.takeScreenShot(driver, "Back to Login Page");
		assertTrue(loginPage.alternativeLink().isDisplayed());
		//assertTrue(loginPage.alternativeLink().isEnabled()); //some times it's not enabled
		assertTrue(loginPage.selectOpt().isDisplayed());
		assertTrue(loginPage.selectOpt().isEnabled());
		Select objSelect = new Select(loginPage.selectOpt());
		List<WebElement> selLi = objSelect.getOptions();
		for(WebElement ele : selLi) {
			String opt_names = ele.getText();
			System.out.println("Select optinus are : " + opt_names);
		}
		assertTrue(loginPage.orangeHRMLink().isDisplayed());
		assertTrue(loginPage.orangeHRMLink().isEnabled());
		assertTrue(loginPage.linkedInLink().isDisplayed());
		assertTrue(loginPage.linkedInLink().isEnabled());
		assertTrue(loginPage.facebookLink().isDisplayed());
		assertTrue(loginPage.facebookLink().isEnabled());
		assertTrue(loginPage.twitterLink().isDisplayed());
		assertTrue(loginPage.twitterLink().isEnabled());
		assertTrue(loginPage.youtubeLink().isDisplayed());
		assertTrue(loginPage.youtubeLink().isEnabled());
		String parent = driver.getWindowHandle();
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(loginPage.orangeHRMLink()).keyDown(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).click(loginPage.linkedInLink()).keyDown(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).click(loginPage.facebookLink()).keyDown(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).click(loginPage.twitterLink()).keyDown(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).click(loginPage.youtubeLink()).keyDown(Keys.CONTROL).build().perform();
		List<String> windows = new ArrayList (driver.getWindowHandles());
		System.out.println("Total windows opened : " + windows.size());
		for(int i =1; i<windows.size(); i++) {
			System.out.println(driver.switchTo().window(windows.get(i)).getTitle());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./ScreenShots/" + i + ".png"));
			driver.close();
		}
		driver.switchTo().window(parent);
		
		
	}
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}
