package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interactions {

	public static void main(String[] args) throws Exception {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver,30); 
		/*wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]")).click();
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"))));
		WebElement ele = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
		Thread.sleep(3000);
		Actions act = new Actions(BrowserUtility.driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
        wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]"))));
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]")).click();
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]")).click();
		Thread.sleep(2000);
		
		WebElement eleDoubleClick = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		Actions act1 = new Actions(BrowserUtility.driver);
		act1.doubleClick(eleDoubleClick).build().perform(); // =1-->3 -->5
		Thread.sleep(1000);
		act1.doubleClick(eleDoubleClick).build().perform();
		Thread.sleep(1000);
		act1.doubleClick(eleDoubleClick).build().perform();
		Thread.sleep(3000);*/
		
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")).click();
		WebDriverWait wait1 = new WebDriverWait(BrowserUtility.driver,30);
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipr']"))));
	    String tooltip = "Right";
	    WebElement tooltipRight = BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipr']"));
	    Actions action = new Actions( BrowserUtility.driver);
	    action.moveToElement(tooltipRight).build().perform();
	    String helptext = BrowserUtility.driver.findElement(By.xpath("//span[@class='tooltiptextr']")).getText();
	    System.out.println(helptext);
		if(tooltip.equals(helptext)){ 
			 System.out.println("Test case Pass...");
			 }
			 else{ 
			 System.out.println("Test case Fail..."); 
			 } 
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipl']"))));
	    String tooltip1 = "Left";
	    WebElement tooltipLeft = BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipl']"));
	    Actions action1 = new Actions( BrowserUtility.driver);
	    action1.moveToElement(tooltipLeft).build().perform();
	    String helptext1 = BrowserUtility.driver.findElement(By.xpath("//span[@class='tooltiptextl']")).getText();
	    System.out.println(helptext1);
		if(tooltip1.equals(helptext1)){ 
			 System.out.println("Test case Pass...");
			 }
			 else{ 
			 System.out.println("Test case Fail..."); 
			 } 
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipt']"))));
	    String tooltip2 = "Top";
	    WebElement tooltipTop = BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipt']"));
	    Actions action2 = new Actions( BrowserUtility.driver);
	    action2.moveToElement(tooltipTop).build().perform();
	    String helptext2 = BrowserUtility.driver.findElement(By.xpath("//span[@class='tooltiptextt']")).getText();
	    System.out.println(helptext2);
		if(tooltip2.equals(helptext2)){ 
			 System.out.println("Test case Pass...");
			 }
			 else{ 
			 System.out.println("Test case Fail..."); 
			 }
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipb']"))));
	    String tooltip3 = "Bottom";
	    WebElement tooltipBottom = BrowserUtility.driver.findElement(By.xpath("//div[@class='tooltipb']"));
	    Actions action3 = new Actions( BrowserUtility.driver);
	    action3.moveToElement(tooltipBottom).build().perform();
	    String helptext3 = BrowserUtility.driver.findElement(By.xpath("//span[@class='tooltiptextb']")).getText();
	    System.out.println(helptext3);
		if(tooltip3.equals(helptext3)){ 
			 System.out.println("Test case Pass...");
			 }
			 else{ 
			 System.out.println("Test case Fail..."); 
			 }
		BrowserUtility.quitBrowser();
	}

}
