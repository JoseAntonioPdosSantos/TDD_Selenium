package logar.cadastrar.deletar.deslogar.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumUtils;

public class LogarCadastrarExcluirEDeslogarTest {

	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void preCondicao(){
		driver = SeleniumUtils.getDriver(SeleniumUtils.getPropriedades("browser"));
		wait = new WebDriverWait(driver, 30);
		driver.get("http://qualister.info/treinamentos/selenium/webdriver/exercicios/fundamentos/lista/alert_confirmation/inc.auth.php");
	}
	
	@After
	public void posCondicao() throws InterruptedException{
		Thread.sleep(3000);
		deslogar();
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void testLogarCadastrarExcluirEDeslogar() throws Exception{

		logar();
		
		entrarEmNovoRegistro();
		
		cadastrarNovoRegistro();
		
		excluir();
		
	}

	private void cadastrarNovoRegistro() {
		driver.findElement(By.cssSelector("input[name='nome']")).sendKeys("José Antonio");
		driver.findElement(By.cssSelector("input[name='sobrenome']")).sendKeys("Pinto dos Santos");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("d_jota_a@hotmail.com");
		driver.findElement(By.id("add_remove")).click();
	}

	private void entrarEmNovoRegistro() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Novo registro")));
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Novo registro")).click();
	}

	private void logar() {
		driver.findElement(By.id("user")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.findElement(By.id("submit")).click();
	}
	
	private void excluir() throws Exception{
		
		int totalDeRegistros = driver.findElements(By.xpath("//table/tbody/tr")).size();//total de item na tabela
		
		boolean encontrou = false;
		
		for(int i = 2; i < totalDeRegistros;i++){
			String email = driver.findElement(By.xpath("//tr["+i+"]/td[4]")).getText();
			
			if(email.equals("d_jota_a@hotmail.com")){
				driver.findElement(By.xpath("//tr["+i+"]/td[7]/a")).click();
				Alert alert = driver.switchTo().alert();
				assertEquals("Deseja realmente excluir?",alert.getText());
				alert.dismiss();
				
				driver.findElement(By.xpath("//tr["+i+"]/td[7]/a")).click();
				alert = driver.switchTo().alert();
				alert.accept();
				
				assertEquals("Linha removida.", driver.findElement(By.id("msg")).getText());
				
				encontrou = true;
				break;
			}
			
			if(!encontrou){
				throw new Exception("Email não encontrado");
			}
		
		}
		
		//Excluindo usando xPath: //tr/td[text()='JOÃO']/../td[last()]/a
		
	}
	
	
	private void deslogar(){
		driver.findElement(By.linkText("[Logout]")).click();
	}
	
}
