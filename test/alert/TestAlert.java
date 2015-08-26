package alert;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAlert {

	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void preCondicao(){
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/alert_confirmation/inc.auth.php");
	}
	
	@After
	public void posCondicao(){
//		driver.quit();
	}
	
	@Test
	public void testAlert() throws InterruptedException{
		driver.findElement(By.id("user")).sendKeys("demo");
		driver.findElement(By.id("submit")).click();
		assertEquals("Preencha os dois campos!!!",driver.switchTo().alert().getText());
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	
}
