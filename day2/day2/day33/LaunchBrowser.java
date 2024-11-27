package week2.day33;

	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class LaunchBrowser {

		public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();
			//driver.get("https://www.facebook.com");
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			
}
	}
