package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticePages {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Fargab");
		driver.findElement(By.xpath(" //input[@id='surname']")).sendKeys("Anik");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("50");
		driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("HTTP");
		driver.quit();
	}

}
