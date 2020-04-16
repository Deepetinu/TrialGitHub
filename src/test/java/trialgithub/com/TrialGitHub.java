package trialgithub.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialGitHub {
	public WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		System.out.println("This is the google test.");
	}

	public static void main(String[] args) {

		TrialGitHub TGH = new TrialGitHub();
		TGH.setUp();
	}

}
