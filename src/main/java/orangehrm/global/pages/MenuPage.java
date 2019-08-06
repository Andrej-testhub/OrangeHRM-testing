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
	public WebElement getMarketplace() {
		return Utils.waitForElementPresence(driver, By.cssSelector("#MP_link"), 10);
	}
	public WebElement getAdminHome() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]"), 10);
	}
	public WebElement getPIM() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'PIM')]"), 10);
	}
	public WebElement getLeave() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Leave')]"), 10);
	}
	public WebElement  getTime() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Time')]"), 10);
	}
	public WebElement getRecruitment() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Recruitment')]"), 10);
	}
	public WebElement  getPerformance() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Performance')]"), 10);
	}
	public WebElement  getDashboard() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Dashboard')]"), 10);
	}
	public WebElement  getDirectory() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Directory')]"), 10);
	}
	public WebElement getMaintenace() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'Maintenance')]"), 10);
	}
	public String logedInAs() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='welcome']"), 5).getText();
	}
	//ESS users
	public WebElement  getMyInfo() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(),'My Info')]"), 10);
	}
}
