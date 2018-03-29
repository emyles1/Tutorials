import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

public class scrollingDemo extends base {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		
		AndroidDriver driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Appium is not supporting any method for scrolling
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Search View\"));");

	}

}
