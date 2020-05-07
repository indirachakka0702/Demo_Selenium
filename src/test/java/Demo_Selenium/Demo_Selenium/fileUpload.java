package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class fileUpload extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		
		// This is latest version example
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")));
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).sendKeys(Keys.ENTER);
		waitForPageElementToVisible(driver.findElement(By.id("logo")));
		Thread.sleep(2000);
		driver.findElement(By.id("logo")).sendKeys("C:\\Users\\chapa004\\Pictures");
		Thread.sleep(2000);
		//wait for upload bar to 
		driver.findElement(By.xpath("//button[@class='bootbutton']")).click();
		Thread.sleep(3000);
		
		
		//In previous developers concept. They have (chooseButton) [along path of the file to be their in another place holder]
		// noe he is letting to know only file name
		
		// this is example of previous one -->now it is not using no need
		/*driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		 waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='upfile']")));
		 driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("C:\\Users\\chapa004\\Pictures");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name='note']")).click();
         Thread.sleep(2000);*/
	}

}
