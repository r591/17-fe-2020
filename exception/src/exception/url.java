package exception;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class url {

public static void main(String[] args) {
	System.setProperty("WebDriver.chrome.driver","Desktop\\Chromedriver.exe");
	Chromedriver driver=new Chromedriver();
	driver.get("youtube.com");
	driver.manage.window.maximize();

	//String actual_title="http://demo.guru99.com/test/newtours/";
//String expected_url=

}
}
