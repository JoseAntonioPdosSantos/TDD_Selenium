package navegacao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalizacaoCSSAvancado {

	@Test
	public void testLocalizacaoSeletorCSSAvancado() {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/css_xpath/");
		
		driver.findElement(By.cssSelector("input[id^='name']"));
		driver.findElement(By.cssSelector("input[id$='password']"));
		driver.findElement(By.cssSelector("input[id*='-password-']"));
		driver.findElement(By.cssSelector("#send"));
		driver.findElement(By.cssSelector("a[href$='.html']"));
		
		driver.quit();
	}

}
