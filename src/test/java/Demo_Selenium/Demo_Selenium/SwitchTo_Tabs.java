package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchTo_Tabs extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		    launchBrowser("ch");
			loginToBrowser();
			WebDriver driver =BrowserUtility.driver;
		    waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")));
		    driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")).click();
			waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'London')]")));
			driver.findElement(By.xpath("//button[contains(text(),'London')]")).click();
			Thread.sleep(2000);
		    String display = BrowserUtility.driver.findElement(By.xpath("//p[contains(text(),'London ')]")).getText();
			System.out.println(display);
			Thread.sleep(2000);
			 
		    waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Paris')]")));
			driver.findElement(By.xpath("//button[contains(text(),'Paris')]")).click();
			Thread.sleep(2000);
			String display1 = BrowserUtility.driver.findElement(By.xpath("//p[contains(text(),'Paris ')]")).getText();
			System.out.println(display1);
		    Thread.sleep(2000);
		   
		    waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Tokyo')]")));
			driver.findElement(By.xpath("//button[contains(text(),'Tokyo')]")).click();
			Thread.sleep(2000);
			String display2 = BrowserUtility.driver.findElement(By.xpath("//p[contains(text(),'To')]")).getText();
			System.out.println(display2);
		    
		    Thread.sleep(4000);
	        quitBrowser();
            
	}

}
