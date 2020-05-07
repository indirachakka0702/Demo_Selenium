package Demo_Selenium.Demo_Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchTo_Window extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
	/*	loginToBrowser();
		WebDriver driver =BrowserUtility.driver;
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		waitForPageElementToVisible(ele);
		ele.click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Windows')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Tab')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).click();
		ArrayList <String>windowTabs = new ArrayList(driver.getWindowHandles());
		System.out.println(windowTabs.size());
		driver.switchTo().window(windowTabs.get(1));
		driver.get("https://www.yahoo.com");
		driver.close();
		driver.switchTo().window(windowTabs.get(0));
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='bootbutton'])[2]")).click();
		ArrayList <String>windowTabs = new ArrayList(driver.getWindowHandles());
		System.out.println(windowTabs.size());
		driver.switchTo().window(windowTabs.get(1));
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		driver.close();
		*/
		/*driver.findElement(By.xpath("(//button[@class='bootbutton'])[2]")).click();
		windowTabs = new ArrayList(driver.getWindowHandles());
	    System.out.println(windowTabs.size());
	    driver.switchTo().window(windowTabs.get(2));
		
		Thread.sleep(2000);*/
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("")));
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//body/p")).getText());
		
	}

}
