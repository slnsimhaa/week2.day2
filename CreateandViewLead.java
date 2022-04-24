package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateandViewLead {

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
				WebElement eleUserName = driver.findElement(By.id("username"));
				eleUserName.sendKeys("DemoSalesManager");

				// find password textbox and enter password
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

				// click login button
				driver.findElement(By.className("decorativeSubmit")).click();

				// click link
				driver.findElement(By.linkText("CRM/SFA")).click();

				// click Leads Tab
				driver.findElement(By.linkText("Leads")).click();

				// click create lead link
				driver.findElement(By.linkText("Create Lead")).click();
				
				// find Company Name Text box and enter the input
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");

				// find First Name text box and enter the input
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshminarasimhan");

				// find Last Name text box and enter the input
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sampath");
				
				//click create lead button
				driver.findElement(By.className("smallSubmit")).click();
				
				//get text of CompanyName
				String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				
				//print the output
				System.out.println(companyName);
				
				//Close the Browser
				driver.close();
		}
}