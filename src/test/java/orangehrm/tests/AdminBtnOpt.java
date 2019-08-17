package orangehrm.tests;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orangehrm.global.pages.LoginPage;
import orangehrm.global.pages.MenuPage;
import orangehrm.helpers.Utils;

public class AdminBtnOpt {
	private WebDriver driver;
	private LoginPage loginPage;
	private MenuPage menuPage;
	private Actions action;
	
	@BeforeSuite
	public void setupSelenium() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@BeforeTest
	public void setupPages() {
		loginPage = new LoginPage(driver);
		menuPage = new MenuPage(driver);
		action = new Actions(driver);
		loginPage.logIn("Admin", "admin123");
	}
	@Test(priority=1, description="Testing admin button")
	public void adminBtn() throws Exception {
		assertTrue(menuPage.getAdminHome().isDisplayed());
		assertTrue(menuPage.getAdminHome().isEnabled());
		menuPage.getAdminHome().click();
		Utils.takeScreenShot(driver, "Admin btn pic");
	}
	@Test(priority=2, description="Testing User Managment Options")
	public void userManagmentBtn() throws Exception{
		assertTrue(menuPage.getUserManagment().isDisplayed());
		assertTrue(menuPage.getUserManagment().isEnabled());
		assertTrue(driver.getCurrentUrl().contains("admin/viewSystemUsers"));
		Utils.takeScreenShot(driver, "User Mangment");
		action.moveToElement(menuPage.getUserManagment()).build().perform();
		assertTrue(menuPage.getSystemUsers().isDisplayed());
		assertTrue(menuPage.getSystemUsers().isEnabled());
		System.out.println("User Managment drop down options are : " + driver.findElement(By.xpath("//li[@class='selected']//ul")).getText());
		Utils.takeScreenShot(driver, "User Managment, System users");
	}
	@Test(priority=3, description="Testing Job Options")
	public void jobBtn() throws Exception{
		assertTrue(menuPage.getJobOptAdm().isDisplayed());
		assertTrue(menuPage.getJobOptAdm().isEnabled());
		action.moveToElement(menuPage.getJobOptAdm()).build().perform();
		System.out.println("Job drop down options are : " + driver.findElement(By.xpath("//li[@class='current']//li[2]//ul[1]")).getText());
		Utils.takeScreenShot(driver, "Job drop down options");
		assertTrue(menuPage.getJobTitles().isDisplayed());
		assertTrue(menuPage.getJobTitles().isEnabled());
		assertTrue(menuPage.getPayGrades().isDisplayed());
		assertTrue(menuPage.getPayGrades().isEnabled());
		assertTrue(menuPage.getEmpStatus().isDisplayed());
		assertTrue(menuPage.getEmpStatus().isEnabled());
		assertTrue(menuPage.getJobCategory().isDisplayed());
		assertTrue(menuPage.getJobCategory().isEnabled());
		assertTrue(menuPage.getWorkShifts().isDisplayed());
		assertTrue(menuPage.getWorkShifts().isEnabled());
		menuPage.getJobTitles().click();
		assertTrue(driver.getCurrentUrl().contains("viewJobTitleList"));
		Utils.takeScreenShot(driver, "viewJobTitleList");
		action.moveToElement(menuPage.getJobOptAdm()).build().perform();
		menuPage.getPayGrades().click();
		assertTrue(driver.getCurrentUrl().contains("viewPayGrades"));
		Utils.takeScreenShot(driver, "viewPayGrades");
		action.moveToElement(menuPage.getJobOptAdm()).build().perform();
		menuPage.getEmpStatus().click();
		assertTrue(driver.getCurrentUrl().contains("employmentStatus"));
		Utils.takeScreenShot(driver, "employmentStatus");
		action.moveToElement(menuPage.getJobOptAdm()).build().perform();
		menuPage.getJobCategory().click();
		assertTrue(driver.getCurrentUrl().contains("jobCategory"));
		Utils.takeScreenShot(driver, "jobCategory");
		action.moveToElement(menuPage.getJobOptAdm()).build().perform();
		menuPage.getWorkShifts().click();
		assertTrue(driver.getCurrentUrl().contains("workShift"));
		Utils.takeScreenShot(driver, "workShift");
	}	
	@Test(priority=4, description="Testing Organization Options")
	public void orgnizationBtn() throws Exception{
		assertTrue(menuPage.getOrganizationAdm().isDisplayed());
		assertTrue(menuPage.getOrganizationAdm().isEnabled());
		action.moveToElement(menuPage.getOrganizationAdm()).build().perform();
		System.out.println("Organization drop down options are : " + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[3]/ul[1]")).getText());
		Utils.takeScreenShot(driver, "Organization drop down options");
		assertTrue(menuPage.getGeneralInfo().isDisplayed());
		assertTrue(menuPage.getGeneralInfo().isEnabled());
		assertTrue(menuPage.getLocationsView().isDisplayed());
		assertTrue(menuPage.getLocationsView().isEnabled());
		assertTrue(menuPage.getStructureView().isDisplayed());
		assertTrue(menuPage.getStructureView().isEnabled());
		menuPage.getGeneralInfo().click();
		assertTrue(driver.getCurrentUrl().contains("viewOrganizationGeneralInformation"));
		Utils.takeScreenShot(driver, "viewOrganizationGeneralInformation");
		action.moveToElement(menuPage.getOrganizationAdm()).build().perform();
		menuPage.getLocationsView().click();
		assertTrue(driver.getCurrentUrl().contains("viewLocations"));
		Utils.takeScreenShot(driver, "viewLocations");
		action.moveToElement(menuPage.getOrganizationAdm()).build().perform();
		menuPage.getStructureView().click();
		assertTrue(driver.getCurrentUrl().contains("viewCompanyStructure"));
		Utils.takeScreenShot(driver, "viewCompanyStructure");
	}
	@Test(priority=5, description="Testing Qualification Options")
	public void qualificationsOpt() throws Exception{
		assertTrue(menuPage.getQualificationsAdm().isDisplayed());
		assertTrue(menuPage.getQualificationsAdm().isEnabled());
		action.moveToElement(menuPage.getQualificationsAdm()).build().perform();
		System.out.println("Qualifications drop down options are : " + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/ul[1]")).getText());
		Utils.takeScreenShot(driver, "Qualifications drop down options");
		assertTrue(menuPage.getSkillView().isDisplayed());
		assertTrue(menuPage.getSkillView().isEnabled());
		assertTrue(menuPage.getEducationView().isDisplayed());
		assertTrue(menuPage.getEducationView().isEnabled());
		assertTrue(menuPage.getLicencesView().isDisplayed());
		assertTrue(menuPage.getLicencesView().isEnabled());
		assertTrue(menuPage.getLanguagesView().isDisplayed());
		assertTrue(menuPage.getLanguagesView().isEnabled());
		assertTrue(menuPage.getMebershipView().isDisplayed());
		assertTrue(menuPage.getMebershipView().isEnabled());
		menuPage.getSkillView().click();
		assertTrue(driver.getCurrentUrl().contains("viewSkills"));
		Utils.takeScreenShot(driver, "viewSkills");
		action.moveToElement(menuPage.getQualificationsAdm()).build().perform();
		menuPage.getEducationView().click();
		assertTrue(driver.getCurrentUrl().contains("viewEducation"));
		Utils.takeScreenShot(driver, "viewEducation");
		action.moveToElement(menuPage.getQualificationsAdm()).build().perform();
		menuPage.getLicencesView().click();
		assertTrue(driver.getCurrentUrl().contains("viewLicenses"));
		Utils.takeScreenShot(driver, "viewLicenses");
		action.moveToElement(menuPage.getQualificationsAdm()).build().perform();
		menuPage.getLanguagesView().click();
		assertTrue(driver.getCurrentUrl().contains("viewLanguages"));
		Utils.takeScreenShot(driver, "viewLanguages");
		action.moveToElement(menuPage.getQualificationsAdm()).build().perform();
		menuPage.getMebershipView().click();
		assertTrue(driver.getCurrentUrl().contains("membership"));
		Utils.takeScreenShot(driver, "membership");
	}
	@Test(priority=6, description="Testing Nationalities button")
	public void nationalitiesBtn() throws Exception{
		assertTrue(menuPage.getNationalities().isDisplayed());
		assertTrue(menuPage.getNationalities().isEnabled());
		menuPage.getNationalities().click();
		assertTrue(driver.getCurrentUrl().contains("nationality"));
		Utils.takeScreenShot(driver, "nationality");
	}
	@Test(priority=7, description="Testing Configuration Options")
	public void configurationOpt() throws Exception{
		assertTrue(menuPage.getConfigurationAdm().isDisplayed());
		assertTrue(menuPage.getConfigurationAdm().isEnabled());
		action.moveToElement(menuPage.getConfigurationAdm()).build().perform();
		System.out.println("Configuration drop down options are : " + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]/ul[1]")).getText());
		Utils.takeScreenShot(driver, "Configuraation drop down options");
		assertTrue(menuPage.getEmailCon().isDisplayed());
		assertTrue(menuPage.getEmailCon().isEnabled());
		assertTrue(menuPage.getEmailSub().isDisplayed());
		assertTrue(menuPage.getEmailSub().isEnabled());
		assertTrue(menuPage.getLocalizationCon().isDisplayed());
		assertTrue(menuPage.getLocalizationCon().isEnabled());
		assertTrue(menuPage.getModuleView().isDisplayed());
		assertTrue(menuPage.getModuleView().isEnabled());
		assertTrue(menuPage.getSocialMediaAuth().isDisplayed());
		assertTrue(menuPage.getSocialMediaAuth().isEnabled());
		assertTrue(menuPage.getRegisterOAuthC().isDisplayed());
		assertTrue(menuPage.getRegisterOAuthC().isEnabled());
		menuPage.getEmailCon().click();
		assertTrue(driver.getCurrentUrl().contains("listMailConfiguration"));
		Utils.takeScreenShot(driver, "listMailConfiguration");
		action.moveToElement(menuPage.getConfigurationAdm()).build().perform();
		menuPage.getEmailSub().click();
		assertTrue(driver.getCurrentUrl().contains("viewEmailNotification"));
		Utils.takeScreenShot(driver, "viewEmailNotification");
		action.moveToElement(menuPage.getConfigurationAdm()).build().perform();
		menuPage.getLocalizationCon().click();
		assertTrue(driver.getCurrentUrl().contains("localization"));
		Utils.takeScreenShot(driver, "localization");
		action.moveToElement(menuPage.getConfigurationAdm()).build().perform();
		menuPage.getModuleView().click();
		assertTrue(driver.getCurrentUrl().contains("viewModules"));
		Utils.takeScreenShot(driver, "viewModules");
		action.moveToElement(menuPage.getConfigurationAdm()).build().perform();
		menuPage.getSocialMediaAuth().click();
		assertTrue(driver.getCurrentUrl().contains("openIdProvider"));
		Utils.takeScreenShot(driver, "openIdProvider");
		action.moveToElement(menuPage.getConfigurationAdm()).build().perform();
		menuPage.getRegisterOAuthC().click();
		assertTrue(driver.getCurrentUrl().contains("registerOAuthClient"));
		Utils.takeScreenShot(driver, "registerOAuthClient");
	}
		
	
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}
