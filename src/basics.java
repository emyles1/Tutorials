
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;


public class basics extends base{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//File f = new File("src");
	    //File fs = new File(f, "ApiDemos-debug.apk");
	   
	    //DesiredCapabilities cap = new DesiredCapabilities();
	    //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "VS835Y5FEQ8HEPZHYHU");
	    //cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    //AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		AndroidDriver driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("(//android.widget.TextView)[4]").click();
	    driver.findElementById("android:id/checkbox").click();
	    driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	    driver.findElementByClassName("android.widget.EditText").sendKeys("Password");
	    ((WebElement) driver.findElementsByClassName("android.widget.Button").get(1)).click();
	    
	    
	}

}
