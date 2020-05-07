package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchTo_Alert extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver =BrowserUtility.driver;
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
		waitForPageElementToVisible(ele);
		//driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		ele.click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]")));
		driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]")).click();
		Thread.sleep(2000);//--> Browser allows only one button  --> OK, cancel
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]")).click();
		Thread.sleep(2000);
		Alert al1 = driver.switchTo().alert();
		al1.sendKeys("Priya");
	
		Thread.sleep(2000);
		al1.dismiss();
		
		//waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Window Alert')])[1]")));
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		
		
		driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]")).click();
		Thread.sleep(2000);
		Alert a2 = driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
		Thread.sleep(10000);
		quitBrowser();
	}

}
