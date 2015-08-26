package navegacao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalizacaoCSSBase {

	@Test
	public void testLocalizacaoSeletorCSS(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/find_elements/");
		
		System.out.println(driver.findElement(By.cssSelector("div[class='divpai border']")));
		System.out.println(driver.findElement(By.cssSelector("div[class='divfilho border']")));
		System.out.println(driver.findElement(By.cssSelector("div[class='divneto border']")));
		System.out.println(driver.findElement(By.cssSelector("input[id='dataInicio']")));
		
		
		System.out.println(driver.findElement(By.cssSelector(".divpai")));
		System.out.println(driver.findElement(By.cssSelector(".divfilho")));
		System.out.println(driver.findElement(By.cssSelector(".divneto")));
		System.out.println(driver.findElement(By.cssSelector("#dataInicio")));
		
		driver.quit();
	}
}
