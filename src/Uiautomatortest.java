import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;

public class Uiautomatortest extends base {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver = Capabilities();
		
		
		//items are found using AndroidUIAutomator. Size and Click are demostrated here
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//find how many clickable properties available. Note there was a problem here where the correct number wasnt given. Section 5:lesson28
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
	
		
	}

}
