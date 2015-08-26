package esperaexplicita;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EsperaExplicita {

	
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void preCondicao(){
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/ajax_loading/");
	}
	
	@After
	public void posCondicao(){
		driver.quit();
	}
	
	@Test
	public void testLoginComSucesso() {
		driver.findElement(By.id("username")).sendKeys("demo");
		driver.findElement(By.id("password")).sendKeys("demo");
		driver.findElement(By.id("login")).click();

		// pedir para esperar
		// Verifica se o elemento esta presente
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".success")));

		assertEquals("Voce efetuou o login com sucesso!", driver.findElement(By.cssSelector(".success")).getText());

	}

	@Test
	@Ignore
	public void testEsperaExplicita() {
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/ajax_loading/");

		driver.findElement(By.id("username")).sendKeys("demo");
		driver.findElement(By.id("password")).sendKeys("666");
		driver.findElement(By.id("login")).click();

		// pedir para esperar
		// Verifica se o elemento esta presente
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".error")));

		assertEquals("Usuario ou senhas invalidos.", driver.findElement(By.cssSelector(".error")).getText());

	}
}
