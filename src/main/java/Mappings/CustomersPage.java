package Mappings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Controller.BaseDriver;

public class CustomersPage extends BaseDriver {
	public WebElement getAddCustomerButton(){ 
		return driver.findElement(By.xpath("//*[@id=\'gcrud-search-form\']/div[1]/div[1]/a"));
		}
	public WebElement getSwitchVersionMenu() {
		return driver.findElement(By.id("switch-version-select"));
	}
	
	public WebElement searchNameInput() {
		return driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/input"));
	}
	
	public WebElement selectAllCheckbox() {
		return driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]/div/input"));
	}
	
	public WebElement deleteSelectedButton() {
		return driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a"));
	}
	
	public WebElement confirmationMessage() {
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]"));
	}
	
	public WebElement confirmationDeleteButton() {
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]"));
	}
	
	public WebElement confirmationResultMessage() {
		return driver.findElement(By.xpath("/html/body/div[3]/span[3]/p"));
	}
}
