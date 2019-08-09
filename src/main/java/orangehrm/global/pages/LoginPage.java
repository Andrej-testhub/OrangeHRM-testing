package orangehrm.global.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ex1.utils.Utils;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
	}
	public WebElement getUsername() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@id='txtUsername']"), 10);
	}
	public void setUsername(String username) {
		WebElement usernameInput =  getUsername();
		usernameInput.clear();
		usernameInput.sendKeys(username);
	}
	public WebElement  getPassword() {
		return Utils.waitForElementPresence(driver,By.xpath("//input[@id='txtPassword']"), 10);
	}
	public void setPassword(String password) {
		WebElement passwordInput = getPassword();
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	public WebElement  getLoginBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@id='btnLogin']"), 10);
	}
	public void logIn(String username, String password) {
		setUsername(username);
		setPassword(password);
		getLoginBtn().click();
	}
	public WebElement getLogoutBtn() {
		return Utils.waitForElementPresence(driver,By.xpath("//a[contains(text(),'Logout')]"), 10);
	}
	public WebElement errorMsg() {
		 return Utils.waitForElementPresence(driver, By.xpath("//span[@id='spanMessage']"), 10);
	}
	public WebElement forgotPass() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Forgot your password?')]"), 10);
	}
	public WebElement alternativeLink() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@id='openIdLogin']"), 10);
	}
	public WebElement orangeHRMLink() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"), 10);
	}
	public WebElement linkedInLink() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[1]"), 10);
	}
	public WebElement facebookLink() {
		return Utils.waitForElementPresence(driver, By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/a[2]"), 10);
	}
	public WebElement twitterLink() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[3]"), 10);
	}
	public WebElement youtubeLink() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[4]"), 10);
	}
}

