package navegacao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalizacaoElements {

	@Test
	public void testLocalizacaoElement() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/elementos/");
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("email")));
		System.out.println(driver.findElement(By.id("password")));
		System.out.println(driver.findElement(By.id("submit")));
		System.out.println(driver.findElement(By.id("lembrar")));
		System.out.println(driver.findElement(By.id("limpar")));
		System.out.println(driver.findElement(By.tagName("h1")));
		
		driver.quit();
	}

}
