package orangehrm.tests;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import orangehrm.helpers.Utils;
import orangehrm.global.pages.LoginPage;

public class Invalidlogin {
	private WebDriver driver;
	private LoginPage loginPage;
	private String baseUrl;
	
	@BeforeSuite
	public void setupSelenium() {
		driver = new ChromeDriver();
		baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void setupPages() {
		loginPage = new LoginPage(driver);
	}
	@Test(priority = 1, description="login with invalid credentials")
	public void loginAppInvCre() throws Exception {
		loginPage.logIn("", "");
		Utils.takeScreenShot(driver, "no user and no pass");
		WebElement spanMsg = loginPage.errorMsg();
		assertTrue(spanMsg.isDisplayed());
		String inv_log = spanMsg.getText();
		assertTrue(inv_log.contains("Username cannot be empty"));
		System.out.println(spanMsg.getText());
		loginPage.logIn("Admin", "");
		Utils.takeScreenShot(driver, " valid User no pass");
		assertTrue(spanMsg.isDisplayed());
		assertTrue(inv_log.contains("Username cannot be empty"));
		System.out.println(spanMsg.getText());
		loginPage.logIn("", "admin123");
		Utils.takeScreenShot(driver, "no User, valid pass");
		assertTrue(spanMsg.isDisplayed());
		assertTrue(inv_log.contains("Username cannot be empty"));
		System.out.println(spanMsg.getText());
		//driver.navigate().refresh(); WebElement becomes stale
		loginPage.logIn("lngkb", "kubseg");
		Utils.takeScreenShot(driver, "Invalid user and pass");
		WebElement invalid_msg = loginPage.errorMsg();
		String invalid_log = invalid_msg.getText();
		System.out.println(invalid_msg.getText());
		assertTrue(invalid_msg.isDisplayed());
		assertTrue(invalid_log.contains("Invalid credentials"));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); //checking if you can log on with just switching URL to home page URL
			
	}
		
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}
