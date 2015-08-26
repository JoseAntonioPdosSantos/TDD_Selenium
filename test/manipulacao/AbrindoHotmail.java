package manipulacao;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.SeleniumUtils;

public class AbrindoHotmail {

	@Test
	@Ignore
	public void abrindoHotmail() {
		WebDriver driver = SeleniumUtils.getDriver(SeleniumUtils.getPropriedades("browser"));
		driver.get("https://blu175.mail.live.com/?fid=flinbox");
		
		WebElement nome = driver.findElement(By.cssSelector(".ltr_override"));
		WebElement senha = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement botao = driver.findElement(By.xpath(".//*[@id='idSIButton9']"));
		
		nome.sendKeys("d_jota_a@hotmail.com");
		senha.sendKeys("334107jd");
		botao.click();
		
	}

	@Test
	public void abrindoFacebook() throws InterruptedException {
		WebDriver driver = SeleniumUtils.getDriver(SeleniumUtils.getPropriedades("browser"));
		driver.get("https://www.facebook.com/?_rdr=p");
		
		WebElement nome = driver.findElement(By.id("email"));
		WebElement senha = driver.findElement(By.id("pass"));
		WebElement botao = driver.findElement(By.cssSelector("input[type='submit']"));
		
		nome.sendKeys("d_jota_a@hotmail.com");
		senha.sendKeys("soufoda");
		botao.click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[placeholder='No que você está pensando?']")).sendKeys("@Kaenna");
		
		
		driver.findElement(By.cssSelector("button[data-ft='{\"tn\":\"+{\"}'")).click();
	}

}
