

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	
	@Test
	public void test()
	{
      
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://magento.com");
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		Login l=new Login(driver);
		l.typeEmail();
		l.typePass();
		l.ClickOnLogin();
		Home h=new Home(driver);
		h.ClickOnLogou();
		driver.quit();
		
		
	}

}
