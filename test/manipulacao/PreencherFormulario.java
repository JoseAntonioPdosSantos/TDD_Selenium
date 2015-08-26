package manipulacao;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PreencherFormulario {

	@Test
	public void testPreencherFormulario() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/elementos_html/");
		
		driver.findElement(By.cssSelector("#name1")).sendKeys("José Antonio");;
		driver.findElement(By.cssSelector("#name2")).sendKeys("Pinto dos Santos");
		driver.findElement(By.cssSelector("input[value='Homem']")).click();
		driver.findElement(By.cssSelector("#value2")).click();
		driver.findElement(By.cssSelector("#txtarea")).sendKeys("Gosto de comer fango no café da manha, frango no almoço, frango no lanche da tarde e frango na janta");;
		new Select(driver.findElement(By.cssSelector("select[name='education']"))).selectByIndex(3);
		new Select(driver.findElement(By.cssSelector("#dia"))).selectByIndex(2);
		new Select(driver.findElement(By.cssSelector("#dia"))).selectByIndex(1);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		assertEquals("Olá, Hugo Valle", driver.findElement(By.id("nome")).getText());
	}

}
