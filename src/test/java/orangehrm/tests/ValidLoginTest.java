package orangehrm.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import orangehrm.helpers.Utils;
import orangehrm.global.pages.LoginPage;

public class ValidLoginTest {
	private WebDriver driver;
	private LoginPage loginPage;
	private String baseUrl;
	
	@BeforeSuite
	public void setUpSelenium() {
		driver = new ChromeDriver();
		baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void setUpPages() {
		loginPage = new LoginPage (driver);
	}
	//Test below isn't important for the valid login test
	@Test(priority=1, description="checking if the title is correct")
	public void titleTest() {
		String expTitle = "OrangeHRM";
		assertEquals(driver.getTitle(), expTitle);
	}
	@Test(priority = 2, description="Testing login with valid credentials")
	public void validLoginTest() throws Exception{
		Utils.takeScreenShot(driver, "Login Page");
		assertTrue(loginPage.getUsername().isDisplayed());
		assertTrue(loginPage.getUsername().isEnabled());
		assertTrue(loginPage.getPassword().isDisplayed());
		assertTrue(loginPage.getPassword().isEnabled());
		assertTrue(loginPage.getLoginBtn().isDisplayed());
		assertTrue(loginPage.getLoginBtn().isEnabled());
		loginPage.logIn("Admin", "admin123");
	}
	@Test(dependsOnMethods="validLoginTest", description="checking url after successful login")
	public void assertHomePage() throws Exception {
		Utils.takeScreenShot(driver, "Home Page");
		String expUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		assertEquals(driver.getCurrentUrl(), expUrl);
	}
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}
