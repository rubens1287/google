package br.com.etec.google;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class GoogleTest {
	
	@Test
	public void validarPesquisa() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com.br/");
		driver.findElement(By.name("q")).sendKeys("QA Wolf");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
		driver.close();
	}
	

}
