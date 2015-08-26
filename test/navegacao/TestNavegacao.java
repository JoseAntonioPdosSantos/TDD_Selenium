package navegacao;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNavegacao {

	@Test
	public void testNavegacao() throws Exception{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/navegacao/");
		driver.navigate().to("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/elementos/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.println(driver.getPageSource());//Codigo fonte HTML
		
		driver.quit();//fecha tudo e driver.close() fecha apenas a atual
		

	}
}
