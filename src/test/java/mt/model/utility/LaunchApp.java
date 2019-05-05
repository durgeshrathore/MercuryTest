package mt.model.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LaunchApp 
{
  Properties p=new Properties();
  
   public void openBrowser(String browsernm) throws IOException
   {
	   FileInputStream fis=new FileInputStream("D:\\Selenium NewBatchProgram\\MercuryTest\\src\\test\\resources\\config.properties");
	   p.load(fis);
	   p.getProperty("browser").equalsIgnoreCase(browsernm);
	   System.setProperty("webdriver.chrome.driver",p.getProperty("chromeexepath"));
	   
	   
   }
}
