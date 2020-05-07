package Demo_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTabsAccess {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		// implicit wait will be applicable for all the DRIVER OBJECTS. We are used global wait conditions
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait 30 seconds, 300 mille seconds pulling time
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,30); // Explicit wait example
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		WebElement email = driver.findElement(By.xpath("//input[@id='email_field']"));
		email.click();
		email.sendKeys("admin123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password_field']"));
		//password.click();
		password.sendKeys("admin123");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("//button[contains(text(),'Login to Account')]"))));
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		loginButton.click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.click();
		Thread.sleep(1000);
		name.sendKeys("Priya");
		WebElement  fatherName= driver.findElement(By.xpath("//input[@id='lname']"));
	    fatherName.sendKeys("Gopi");
	    Thread.sleep(1000);
		WebElement  postalAddress= driver.findElement(By.xpath("//input[@id='postaladdress']"));
	    postalAddress.sendKeys("king Road, Hi Nagar,po:123456");
	    Thread.sleep(1000);
		WebElement personalAddress= driver.findElement(By.xpath("//input[@id='personaladdress']"));
		//personalAddress.click();
	    personalAddress.sendKeys("king Road, Hi Nagar,po:123456");
	    Thread.sleep(1000);
	    WebElement Sex_Male= driver.findElement(By.xpath("//span[1]//input[1]"));
	    System.out.println("Male = "+Sex_Male.isSelected());
	    WebElement Sex_Female= driver.findElement(By.xpath("//span[2]//input[1]"));
	    Thread.sleep(3000);
	    Sex_Female.click();
	    WebElement City= driver.findElement(By.xpath("//select[@id='city']"));
	    Select dropDown1 = new Select(City);
	    dropDown1.selectByIndex(3);
	    Thread.sleep(1000);
	    WebElement Course= driver.findElement(By.xpath("//select[@id='course']"));
	    Select dropDown2 = new Select(Course);
	    dropDown2 .selectByValue("mba");
	    Thread.sleep(1000);
	    WebElement District= driver.findElement(By.xpath("//select[@id='district']"));
	    Select dropDown3 = new Select(District);
	    dropDown3.selectByValue("mumbai");
	    Thread.sleep(1000);
	    WebElement State= driver.findElement(By.xpath("//select[@id='state']"));
	    Select dropDown4 = new Select(State);
	    dropDown4.selectByVisibleText("GOA");
	    Thread.sleep(2000);
	    WebElement PinCode= driver.findElement(By.xpath("//input[@id='pincode']"));
	    PinCode.click();
	    PinCode.sendKeys("234-56-78");
	    Thread.sleep(1000);
	    WebElement Emailid= driver.findElement(By.xpath("//input[@id='emailid']"));
	    //Emailid.click();
	    Emailid.sendKeys("admin123@gmail.com");
	    Thread.sleep(1000);
	  
	    WebElement SubmitButton= driver.findElement(By.xpath("//button[@class='bootbutton']"));
	    SubmitButton.click();
	    driver.manage().deleteAllCookies();
		

	}

}
