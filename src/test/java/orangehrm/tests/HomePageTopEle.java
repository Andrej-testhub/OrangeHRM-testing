package orangehrm.tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orangehrm.global.pages.LoginPage;
import orangehrm.global.pages.MenuPage;
import orangehrm.helpers.Utils;

public class HomePageTopEle {
	private WebDriver driver;
	private  MenuPage menuPage;
	private LoginPage loginPage;
	private  String baseUrl;
	
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
		menuPage = new MenuPage(driver);
		loginPage.logIn("Admin", "admin123");
	}
	@Test(description="Testing elements in the on the top part of the Home Page")
	public void TopHomePageElements() throws Exception {
		Utils.takeScreenShot(driver, "MainPagePic");
		assertTrue(menuPage.getMarketplace().isDisplayed());
		assertTrue(menuPage.getMarketplace().isEnabled());
		menuPage.getMarketplace().click();
		Utils.takeScreenShot(driver, "MarketplacePage");
		assertTrue(driver.getCurrentUrl().contains("marketPlace/ohrmAddons"));
		assertTrue(menuPage.getWelcomeAdminBtn().isDisplayed());
		assertTrue(menuPage.getWelcomeAdminBtn().isEnabled());
		menuPage.getWelcomeAdminBtn().click();
		Utils.takeScreenShot(driver, "WelcomeAdminBtnOptions");
		assertTrue(menuPage.getAbout().isDisplayed());
		assertTrue(menuPage.getAbout().isEnabled());
		assertTrue(menuPage.getChangePassword().isDisplayed());
		assertTrue(menuPage.getChangePassword().isEnabled());
		assertTrue(menuPage.getLogoutBtn().isDisplayed());
		assertTrue(menuPage.getLogoutBtn().isEnabled());
		menuPage.getAbout().click();
		Utils.takeScreenShot(driver, "AboutModalPage");
		driver.switchTo().activeElement();
		assertTrue(driver.findElement(By.xpath("//div[@id='displayAbout']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@id='displayAbout']")).getText());
		driver.findElement(By.xpath("//div[@id='displayAbout']//a[@class='close'][contains(text(),'×')]")).click();
		driver.switchTo().activeElement();
		Utils.takeScreenShot(driver, "MainPagePicAfterModalPage");
		menuPage.getChangePassword().click();
		Utils.takeScreenShot(driver, "ChangePasswordPic");
		assertTrue(driver.getCurrentUrl().contains("admin/changeUserPassword"));
		menuPage.getWelcomeAdminBtn().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //if it doesn't have a time out Logout doesn't load fast enough
		menuPage.getLogoutBtn().click();
		Utils.takeScreenShot(driver, "LogonPage after LogoutBtn");
		assertTrue(driver.getCurrentUrl().contains(baseUrl));
		
	}
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}
