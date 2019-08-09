package orangehrm.helpers;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchWindow {
	private WebDriver driver;
	public  SwitchWindow(WebDriver driver) {
		this.driver = driver;
	}
	public boolean toTitle(String title) {
		String parent_Window = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String winID : windows) {
			if(!winID.equals(parent_Window)) {
				driver.switchTo().window(winID);
				if(driver.getTitle().equals(title)) {
					return true;
				}
				driver.switchTo().window(parent_Window);
			}
		}
		return false;	
	}
	public boolean toURL(String url) {
		String parent_Window = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String winID : windows) {
			if(!winID.equals(parent_Window)) {
				driver.switchTo().window(winID);
				if(driver.getCurrentUrl().equals(url)) {
					return true;
				}
				driver.switchTo().window(parent_Window);
			}
		}
		return false;	
	}
}
