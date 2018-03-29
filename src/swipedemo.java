import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class swipedemo extends base {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		
		
		AndroidDriver driver = Capabilities();
		
		TouchAction t = new TouchAction(driver);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		/*note the tagname has been replaced from usual class with *. This is because no class is available. 
		*will take in all tagnames and search via attribute and value
		*/
		driver.findElementByXPath("//*[@content-desc='9']").click();
		t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction().moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
	}

}
