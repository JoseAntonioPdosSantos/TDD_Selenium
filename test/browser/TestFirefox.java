package browser;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {

	@Test
	public void testAbrirFirefox(){
		
		WebDriver web = new FirefoxDriver();
		web.get("http://www.google.com.br");
		System.out.println(web.manage());
	}
	
}
