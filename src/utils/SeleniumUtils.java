package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumUtils {

	public static WebDriver getDriver(String browser){
		WebDriver driver = null;
		
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equals("googlechrome")){
			DesiredCapabilities capacidade = DesiredCapabilities.chrome();
			capacidade.setJavascriptEnabled(true);
			System.setProperty("webdriver.chrome.driver","G:\\curso de test\\exe\\chromedriver.exe");
			
			driver = new ChromeDriver(capacidade);
		}
		return driver;
	}
	
	public static String getPropriedades(String propriedade){
		Properties prop = new Properties();
		String valor = null;
		try{
			prop.load(new FileInputStream("config/configuracao.properties"));
			valor = prop.getProperty(propriedade);
		}catch(IOException e){
			e.printStackTrace();
		}
		return valor;
		
	}
}
