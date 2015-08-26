package manipulacao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.SeleniumUtils;

public class ManipulandoDontpad {

	@Test
	public void test() {
		WebDriver driver = SeleniumUtils.getDriver(SeleniumUtils.getPropriedades("browser"));
		driver.get("http://dontpad.com/kaenna");

		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		String hora = sdf.format(data);
		String enter = "\n";
		String cabecalho = "José Antonio - às "+hora+" - Disse:"+enter;
		boolean continuar = true;
		String espaco = "\t";
		
		while (continuar) {

			String mensagem = JOptionPane.showInputDialog(null,"Digite uma mensagem\n\n\n\\n\n\n\n");

			if(mensagem.equals("sair"))
				continuar = false;
			else
				driver.findElement(By.id("text")).sendKeys(cabecalho+espaco+mensagem + enter);

		}
		driver.quit();
	}

}
