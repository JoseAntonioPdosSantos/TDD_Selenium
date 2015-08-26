package navegacao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalizacaoXPathBasico {

	@Test
	public void testLocalizacaoXPathBasico() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/find_elements/");
		
		driver.findElement(By.xpath("//div[@class='divpai border']"));
		driver.findElement(By.xpath("//div[@class='divfilho border']"));
		driver.findElement(By.xpath("//div[@class='divneto border'][1]"));
		driver.findElement(By.xpath("//div[@class='divneto border'][2]"));
		driver.findElement(By.xpath("//input[@id='dataInicio']"));
		
		
		
		driver.quit();
	}

}
