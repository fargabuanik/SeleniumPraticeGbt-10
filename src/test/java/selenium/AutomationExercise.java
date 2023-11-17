package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExercise {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.partialLinkText("Signup / Login")).click();
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Fargab Anik");
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("fargabAnik@gmail.com");
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();

	}

}
