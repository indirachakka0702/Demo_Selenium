package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class calculator extends BrowserUtility {

	private static final WebElement Result = null;

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")).click();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//body//input[2]")));
	    driver.findElement(By.xpath("//body//input[2]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//body//input[5]")));
	    driver.findElement(By.xpath("//body//input[5]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//body//input[7]")));
	    driver.findElement(By.xpath("//body//input[7]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//body//input[9]")));
	    driver.findElement(By.xpath("//body//input[9]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//body//input[12]")));
	    driver.findElement(By.xpath("//body//input[12]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//body//input[16]")));
	    driver.findElement(By.xpath("//body//input[16]")).click();
	    Thread.sleep(2000);
	    String str ="9";
         String actualOutput = driver.findElement(By.xpath("//input[@id='display']")).getAttribute("value");
         System.out.println(actualOutput);
		if(str.equals(actualOutput)){ 
			 System.out.println("Test case Pass...");
			 }
			 else{ 
			 System.out.println("Test case Fail..."); 
			 } 
	 
		Thread.sleep(3000);
	    quitBrowser();


	}

}
