package Controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
	public static WebDriver driver;
	
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String site = "https://www.grocerycrud.com/demo/bootstrap_theme";
		driver.navigate().to(site);
	}
	
	public void stopDriver() {
		driver.quit();
	}
	
	public void waitForLoad() throws InterruptedException {
		Thread.sleep(3000);
	}

}
