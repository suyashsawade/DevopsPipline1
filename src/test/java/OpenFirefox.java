

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class OpenFirefox {
		@Test
		public void LaunchFireFox() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sawad\\OneDrive\\Desktop\\Google\\GeckoDriver\\geckodriver-v0.35.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
}
