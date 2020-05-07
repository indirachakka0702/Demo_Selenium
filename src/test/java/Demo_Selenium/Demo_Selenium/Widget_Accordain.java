package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Widget_Accordain extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver =BrowserUtility.driver;
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		waitForPageElementToVisible(ele);
		//driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		ele.click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Section 1')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Section 1')]")).click();
		Thread.sleep(2000);
		String display = BrowserUtility.driver.findElement(By.xpath("//div[1]//p[1]")).getText();
		System.out.println(display);
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Section 1')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Section 1')]")).click();
		
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Section 2')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Section 2')]")).click();
		Thread.sleep(2000);
		String display1 = BrowserUtility.driver.findElement(By.xpath("//div[2]//p[1]")).getText();
		System.out.println(display1);
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Section 2')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Section 2')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Section 3')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Section 3')]")).click();
		Thread.sleep(2000);
		String display2 = BrowserUtility.driver.findElement(By.xpath("//div[3]//p[1]")).getText();
		System.out.println(display2);
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Section 3')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Section 3')]")).click();
		
	}

}
