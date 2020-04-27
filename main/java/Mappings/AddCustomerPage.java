package Mappings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Controller.BaseDriver;

public class AddCustomerPage extends BaseDriver{
	public WebElement name() {
		return driver.findElement(By.id("field-customerName"));
	}
	
	public WebElement lastName() {
		return driver.findElement(By.id("field-contactLastName"));
	}
	
	public WebElement contactFirstName() {
		return driver.findElement(By.id("field-contactFirstName"));
	}
	
	public WebElement phone() {
		return driver.findElement(By.id("field-phone"));
	}
	
	public WebElement addressLine1() {
		return driver.findElement(By.id("field-addressLine1"));
	}
	
	public WebElement addressLine2() {
		return driver.findElement(By.id("field-addressLine2"));
	}
	
	public WebElement city() {
		return driver.findElement(By.id("field-city"));
	}
	
	public WebElement state() {
		return driver.findElement(By.id("field-state"));
	}
	
	public WebElement postalCode() {
		return driver.findElement(By.id("field-postalCode"));
	}
	
	public WebElement country() {
		return driver.findElement(By.id("field-country"));
	}
	
	public void fromEmployeer(String item) {
		driver.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
		driver.findElement(By.xpath("//*[@id='field_salesRepEmployeeNumber_chosen']//input")).sendKeys(item);
		driver.findElement(By.xpath("//*[@id='field_salesRepEmployeeNumber_chosen']//li")).click();
	}
	
	public WebElement creditLimit() {
		return driver.findElement(By.id("field-creditLimit"));
	}
	
	public WebElement saveButton() {
		return driver.findElement(By.id("form-button-save"));
	}

	public WebElement goBackToListButton() {
		return driver.findElement(By.xpath("//*[@id='report-success']/p/a[2]"));
	}
	
	public WebElement alertMessage() {
		return driver.findElement(By.xpath("//*[@id='report-success']/p"));
	}
}
