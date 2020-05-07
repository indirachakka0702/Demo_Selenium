package Demo_Selenium.Demo_Selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class keysJava extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		//Selenium WebDriver 2.0
		// Selenium RC--> this was completely on focus basis, lot's of chalenges 2008-2009
		// Sele
		// you can also press keys which is there in your keyboard. Using Java
		// It is not recommanded in automation, only for edge or corner cases we have to use it
		// you can also do it with keys
		// press s button and release -->S
		//VK-->vartual keyboard
		launchBrowser("ch");
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_A); // to type a letter S
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_N);
		rb.keyRelease(KeyEvent.VK_N);
		rb.keyPress(KeyEvent.VK_1);
		rb.keyRelease(KeyEvent.VK_1);
		rb.keyPress(KeyEvent.VK_2);
		rb.keyRelease(KeyEvent.VK_2);
		rb.keyPress(KeyEvent.VK_3);
		rb.keyRelease(KeyEvent.VK_3);
		rb.keyPress(KeyEvent.VK_F2);
		rb.keyRelease(KeyEvent.VK_F2);
		rb.keyPress(KeyEvent.VK_SHIFT);
	    rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//only in File upload test cases we used to do that
		// Robot class will work on focus basis -->not recommonded that means you can't touch the key board when code running--> that's why it is not recommonded
		//No guarantee whether success or not
		// Always recommonded is we have to ask the developers to write elements/Automation supported code
		
		//Separate machines and with command lines.. 50% reliability
		//This is recoomended but can be used in browser only
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).sendKeys(Keys.ENTER);// This is recommonded
		
		//70-75% of your test cases. you can still automate it. Assuming it is all one machine only.Different machine -->Which is not possible but we made is success that is different topic
		// Download the file from browser. Download --> Selenium-->Downloads(.exe) -->run this file//tab and enter. I use to install it successfully
		// if i refresh the page . it says it is installed or not
		// .exe --> installers
		// pixel is 13 inch screen or more no need for us
		
		
	}

}
