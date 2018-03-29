import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	//public static void main(String[] args) throws MalformedURLException {
	@SuppressWarnings("rawtypes")
	public static AndroidDriver Capabilities() throws MalformedURLException {
		
		
		
		// TODO Auto-generated method stub
	 File f = new File("src");
     File fs = new File(f, "ApiDemos-debug.apk");
     
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Devices");
    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    return driver;
    
    
    //XPath syntax //tagname(@attribute='value')     


	}
	
}
	

