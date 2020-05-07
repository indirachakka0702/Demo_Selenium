package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class calender_AutomateFromOtherWebsite extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser("ch");
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")));
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(3000);
		String str ="(//p[contains(text(),'29')])[1]";
		driver.findElement(By.xpath(str)).click();
	    System.out.println(driver.findElement(By.xpath("//div[contains(@class='fsw_inputBox dates inactiveWidget activeWidget')]//label")).getText());
	    Thread.sleep(5000);
		quitBrowser();
	
	}

}
