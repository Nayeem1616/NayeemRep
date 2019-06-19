package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AutoIt {
	WebDriver driver;
	@Test
	public void FileDownload() throws Exception{
	/*	
		System.setProperty("webdriver.ie.driver", "E:\\Selenium_software\\Update\\IEDriverServer_64.exe");
		driver=new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_software\\Update\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","E:\\Selenium_software\\Update\\IEDriverServer_64.exe"); 
        WebDriver driver = new EdgeDriver();*/
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_software\\Update\\chromedriver_75.exe");
		// driver=new ChromeDriver();
		DesiredCapabilities desiredCapability = DesiredCapabilities.chrome();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("disable-infobars");
	WebDriver driver=new ChromeDriver(options);
		
	//driver=new HtmlUnitDriver();
		//WebDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME_75);
		/*HtmlUnitDriver driver = new HtmlUnitDriver();
		setJavascriptEnabled(true);*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/?gws_rd=ssl");Thread.sleep(1000);
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		 String Title = driver.getTitle();
		 System.out.println("I am at " +Title);
		/*//Download Text File
		driver.findElement(By.xpath("//*[@id='post-body-5864649494765988891']/div[1]/form/div[1]/a[1]")).click();
		//To call the AutoIt script
		Runtime.getRuntime().exec("E:\\Testing\\selenium programes\\DownloadFile.exe");
		//'close' method is used to close the browser window
		//driver.close();
*/		}
	
	private void setJavascriptEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	//@Test
	public void FileUpload() throws Exception{
		 driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		 //Locating 'browse' button
		 WebElement browse =driver.findElement(By.id("uploadfile"));
		 //pass the path of the file to be uploaded using Sendkeys method
		 browse.sendKeys("D:\\SoftwareTestingMaterial\\UploadFile.txt");
		 //'close' method is used to close the browser window
		 driver.close();
	}
}
