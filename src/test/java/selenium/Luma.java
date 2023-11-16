package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Luma {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.partialLinkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("fargabAnik@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Anik123");
		driver.findElement(By.name("send")).click();
		driver.quit();

	}

}
