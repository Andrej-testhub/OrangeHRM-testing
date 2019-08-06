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
	public static void takeScreenShot(WebDriver driver, String screenShotName) throws Exception {
		TakesScreenshot srcShot =((TakesScreenshot)driver);
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./ScreenShots/" + screenShotName+".png");
		FileUtils.copyFile(SrcFile, DestFile);
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