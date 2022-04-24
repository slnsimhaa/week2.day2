package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateViewLeadUsingXPath {

	public static void main(String[] args) {
		// Driver Setup
				WebDriverManager.chromedriver().setup();

				// Launch Chrome Browser
				ChromeDriver driver = new ChromeDriver();

				// Launch Url
				driver.get("http://leaftaps.com/opentaps/control/main");

				// maximize the browser window
				driver.manage().window().maximize();

				// find username textbox and enter username
				WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
				eleUserName.sendKeys("DemoSalesManager");

				// find password textbox and enter password
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

				// click login button
				driver.findElement(By.xpath("//input[@value='Login']")).click();

				// click link
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

				// click Leads Tab
				driver.findElement(By.xpath("//a[text()='Leads']")).click();

				// click create lead link
				driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				
				// find Company Name Text box and enter the input
				driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Amazon");

				// find First Name text box and enter the input
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Lakshminarasimhan");

				// find Last Name text box and enter the input
				driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Sampath");
				
				//click create lead button
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				//get text of CompanyName
				String companyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
				
				//print the output
				System.out.println(companyName);
				
				//close the browser
				driver.close();

			}



}