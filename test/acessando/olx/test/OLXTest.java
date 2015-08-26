package acessando.olx.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumUtils;

public class OLXTest {

	

	@Test
	public void testOLX() throws InterruptedException {
		WebDriver driver = SeleniumUtils.getDriver(SeleniumUtils.getPropriedades("browser"));
		driver.get("http://www.olx.com.br/");
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#label-icon-state-ms")));
		
		driver.findElement(By.linkText("MS")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Para a sua casa']")));

		driver.findElement(By.cssSelector("a[title='Campo Grande']")).click();
		driver.findElement(By.cssSelector("a[title='Para a sua casa']")).click();
		driver.findElement(By.linkText("Particular")).click();
		
		int total_registro = driver.findElements(By.className("list")).size();
		
		for(int i = 1; i < total_registro;i++){
			String produto = driver.findElement(By.xpath(".//ul/li[3]/a/div[2]/h3")).getText();
			System.out.println(produto);
			
			if(i== 10)
				break;
		}
		
		

//		int totalDeRegistros = driver.findElements(By.xpath("//table/tbody/tr")).size();
		
		Thread.sleep(2000);
//		driver.quit();
		
	}

}
