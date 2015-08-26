package manipulandoAlertDoTipoHTML;

import static org.junit.Assert.assertEquals;

import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManipulandoAlertHTML {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/alert_confirmation_js2/");
		
		
		driver.findElement(By.id("confirmacao")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bootbox-body")));
		
		assertEquals("Tem certeza?",driver.findElement(By.cssSelector(".bootbox-body")).getText());
		
		driver.findElement(By.cssSelector(".btn.btn-default")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#msg>span")));
		assertEquals("Cancelou",driver.findElement(By.cssSelector("#msg>span")).getText());
		
		Thread.sleep(3000);
		driver.quit();
	}


}
