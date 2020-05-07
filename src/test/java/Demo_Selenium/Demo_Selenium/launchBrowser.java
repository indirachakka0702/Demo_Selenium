package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {

	public static void main(String[] args) throws Throwable
	{
		// 1. we have to launch browser
		// a. Downloading the driver exe file for the desired browser --> chrome browser
		// b. <artifactId>selenium-server</artifactId> <version>3.141.5</version> --> added to maven file
		
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();// --> This should launch my chrome browser. Make sure chrome browser should be there in yopur machine
		// 2. you have to navigate to some url --> www.google.com
		driver.get("https://www.google.com");
		// 3. maximize your window
		driver.manage().window().maximize();
		// Tekarch portal, google, gmail application, www.gmail.com, qa02-gmail.com, qa01-gmail.com
		driver.get("https://qa-tekarch.firebaseapp.com/"); // learn more of our selenium concepts
		//how to take elements and then adding it to locators
		// chropath
		// chromdev tool --> you guys get to know how to select an element using chromedev tool
		// from there you know how to insepect also
		// seeing the implementation of the page
		// id is unique and preferable -->
		
		// send values to the box
		Thread.sleep(5000);
		//driver.findElement(By.id("email_field")).sendKeys("rithik");
		//driver.findElement(By.id("password_field")).sendKeys("RithiK");
		
		// you have to write xpath --> proper locators are not available. order-->
		// use that direction to reach you
		// xpath should match only one element
		/*driver.findElement(By.xpath("//input[@placeholder=\"Email...\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Email...\"]")).sendKeys("rithik");
		driver.findElement(By.xpath("//input[@placeholder=\"Password...\"]")).sendKeys("RithiK");
		System.out.println(driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText());
		*/
		WebElement Email = driver.findElement(By.id("email_field"));
		Email.sendKeys("Indu");  // action 1
		Thread.sleep(3000);
	/*	Email.clear();           // action 2
		Thread.sleep(3000);
		Email.sendKeys("Priya");  // action 3
*/		
		WebElement password = driver.findElement(By.xpath("//input[@id='password_field']"));
		password.sendKeys("12345");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
	     loginButton.click();
	     Thread.sleep(3000);
	     
	     
		//how to write an xpath on your own
		// --> root element
		// <tagName>
		// <tagName>[]
		// <tagName>[@<AttributeName>='<Attributevalue>']

		//driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		Thread.sleep(10000);
		
		// 4.close the browser
		//driver.close();  // --> it will close the current window
		driver.quit();  // -->quit the browser also instance of the browser
		

	}

}
