package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Webdriver is interface
		// driver is a instance
		// ChromeDriver is Class
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("fargabanik@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Anik772");
		driver.findElement(By.id("login-button")).click();
		driver.quit();
	}

}
