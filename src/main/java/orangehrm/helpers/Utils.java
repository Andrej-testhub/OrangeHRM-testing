package orangehrm.helpers;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	public static WebElement waitForElementPresence(WebDriver driver, By selector, int  waitinterval) {
			WebElement element = (new WebDriverWait(driver, waitinterval).until(ExpectedConditions.presenceOfElementLocated(selector)));
					return element;
	}
	public static WebElement waitForElementToBeClickable(WebDriver driver, By selector, int  waitinterval) {
		WebElement element = (new WebDriverWait(driver,waitinterval).until(ExpectedConditions.elementToBeClickable(selector)));
					return element;
	}
	public void takeScreenShot(WebDriver driver, String picname) throws Exception {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./ScreenShots/" + picname + ".png"));
	}
	public static boolean isPresent(WebDriver webdriver, By selector) {
		try {
			webdriver.findElement(selector);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
	public static void waitForTitle(WebDriver driver, String title, int waitInterval){
		 (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.titleIs(title));
	}
}
