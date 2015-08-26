package browser;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thoughtworks.selenium.webdriven.SeleniumMutator;

import utils.SeleniumUtils;

public class TestChrome {

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		DesiredCapabilities capacidade = DesiredCapabilities.chrome();
		capacidade.setJavascriptEnabled(true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrador\\Documents\\exe\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver(capacidade);
		WebDriver driver = SeleniumUtils.getDriver(SeleniumUtils.getPropriedades("browser"));
		
		driver.get("https://code.google.com/p/selenium/wiki/ChromeDriver");
	}

}
