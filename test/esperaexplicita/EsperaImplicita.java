package esperaexplicita;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EsperaImplicita {

	@Test
	public void testLoginComSucesso() {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/ajax_loading/");

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
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

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
