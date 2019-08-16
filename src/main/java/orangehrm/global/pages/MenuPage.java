package orangehrm.global.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import orangehrm.helpers.Utils;


public class MenuPage {
private WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	public  WebElement getWelcomeAdminBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Welcome Admin')]"), 10);
	}
	public WebElement getAbout() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='aboutDisplayLink']"), 10);
	}
	public WebElement getChangePassword() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Change Password')]"), 10);
	}
	public WebElement getLogoutBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Logout')]"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getMarketplace() {
		return Utils.waitForElementPresence(driver, By.cssSelector("#MP_link"), 10);
	}
///////////////////ADMIN Options/////////////////////////
	public WebElement getAdminHome() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]"), 10);
	}
	public WebElement getUserManagment() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_UserManagement']"), 10);
	}
	public WebElement getSystemUsers() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewSystemUsers']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getJobOptAdm() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_Job']"), 10);
	}
	public WebElement getJobTitles() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewJobTitleList']"), 10);
	}
	public WebElement getPayGrades() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewPayGrades']"), 10);
	}
	public WebElement getEmpStatus() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_employmentStatus']"), 10);
	}
	public WebElement getJobCategory() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_jobCategory']"), 10);
	}
	public WebElement getWorkShifts() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_workShift']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getOrganizationAdm() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_Organization']"), 10);
	}
	public WebElement getGeneralInfo() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewOrganizationGeneralInformation']"), 10);
	}
	public WebElement getLocationsView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewLocations']"), 10);
	}
	public WebElement getStructureView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewCompanyStructure']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getQualificationsAdm() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_Qualifications']"), 10);
	}
	public WebElement getSkillView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewSkills']"), 10);
	}
	public WebElement getEducationView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewEducation']"), 10);
	}
	public WebElement getLicencesView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewLicenses']"), 10);
	}
	public WebElement getLanguagesView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewLanguages']"), 10);
	}
	public WebElement getMebershipView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_membership']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getNationalities() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_nationality']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getConfigurationAdm() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_Configuration']"), 10);
	}
	public WebElement getEmailCon() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_listMailConfiguration']"), 10);
	}
	public WebElement getEmailSub() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewEmailNotification']"), 10);
	}
	public WebElement getLocalizationCon() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_localization']"), 10);
	}
	public WebElement getModuleView() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_viewModules']"), 10);
	}
	public WebElement getSocialMediaAuth() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_openIdProvider']"), 10);
	}
	public WebElement getRegisterOAuthC() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_registerOAuthClient']"), 10);
	}
///////////////////PIM Options/////////////////////////
	public WebElement getPIM() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'PIM')]"), 10);
	}
	public WebElement getConfigurationPIM() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_pim_Configuration']"), 10);
	}
	public WebElement getOptinalFields() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_pim_configurePim']"), 10);
	}
	public WebElement getCostumFields() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_pim_listCustomFields']"), 10);
	}
	public WebElement getDataImport() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_admin_pimCsvImport']"), 10);
	}
	public WebElement getReportingMethods() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_pim_viewReportingMethods']"), 10);
	}
	public WebElement getTerminationReasons() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_pim_viewTerminationReasons']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getEmployeeListPIM() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_pim_viewEmployeeList']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getAddEmployeePIM() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_pim_addEmployee']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getReportsPIM() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_core_viewDefinedPredefinedReports']"), 10);
	}
///////////////////Leave Options/////////////////////////
	public WebElement getLeave() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Leave')]"), 10);
	}
	public WebElement getEntitlementsLeave() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_Entitlements']"), 10);
	}
	public WebElement getAddLeaveEntitlments() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_addLeaveEntitlement']"), 10);
	}
	public WebElement getEmpEntitlements() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_viewLeaveEntitlements']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getReportsLeave() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_Reports']"), 10);
	}
	public WebElement getEntitlAndReport() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_viewLeaveBalanceReport']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getConfigurateLeave() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_Configure']"), 10);
	}
	public WebElement getLeavePeriod() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_defineLeavePeriod']"), 10);
	}
	public WebElement getLeaveTypeList() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_leaveTypeList']"), 10);
	}
	public WebElement getWorkWeek() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_defineWorkWeek']"), 10);
	}
	public WebElement getHolidayList() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_viewHolidayList']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getLeaveList() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_viewLeaveList']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getAssignLeave() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_leave_assignLeave']"), 10);
	}
///////////////////Time Options/////////////////////////
	public WebElement  getTime() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Time')]"), 10);
	}
///////////////////Recruitment Options/////////////////////////
	public WebElement getRecruitment() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Recruitment')]"), 10);
	}
	public WebElement getRecCandidates() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_recruitment_viewCandidates']"), 10);
	}
	public WebElement getRecVacancies() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_recruitment_viewJobVacancy']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getManageReviewPer() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_performance_ManageReviews']"), 10);
	}
	public WebElement getSearchManageRev() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_performance_searchPerformancReview']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getEmployeeTrarckers() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_performance_viewEmployeePerformanceTrackerList']"), 10);
	}
///////////////////Performance Options/////////////////////////
	public WebElement  getPerformance() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Performance')]"), 10);
	}
	public WebElement  getPerConfigurate() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_performance_Configure']"), 10);
	}
	public WebElement  getKPI() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_performance_searchKpi']"), 10);
	}
	public WebElement  getPerTrackers() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_performance_addPerformanceTracker']"), 10);
	}
///////////////////Dashboard Options/////////////////////////
	public WebElement  getDashboard() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Dashboard')]"), 10);
	}
	public WebElement  getAssignLeaveDash() {
		return Utils.waitForElementPresence(driver, By.xpath("//td[1]//div[1]//a[1]"), 10);
	}
	public WebElement  getLeaveListDash() {
		return Utils.waitForElementPresence(driver, By.xpath("//td[2]//div[1]//a[1]"), 10);
	}
	public WebElement  getTimeSheetDash() {
		return Utils.waitForElementPresence(driver, By.xpath("//td[3]//div[1]//a[1]"), 10);
	}
///////////////////Directory Options/////////////////////////
	public WebElement  getDirectory() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Directory')]"), 10);
	}
///////////////////Maintenace Options/////////////////////////
	public WebElement getMaintenace() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Maintenance')]"), 10);
	}
	public WebElement getPurgeRecordsMain() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_maintenance_PurgeRecords']"), 10);
	}
	public WebElement getEmpRecordsMain() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Employee Records')]"), 10);
	}
	public WebElement getCandidateRecordsMain() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_maintenance_purgeCandidateData']"), 10);
	}
////////////////////////////////////////////////////////
	public WebElement getAccessRecordsMain() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='menu_maintenance_accessEmployeeData']"), 10);
	}
////////////////////////////////////////////////////////
	public String logedInAs() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='welcome']"), 5).getText();
	}
	//ESS users
	public WebElement  getMyInfo() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'My Info')]"), 10);
	}
}
