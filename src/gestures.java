import java.net.MalformedURLException;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class gestures extends base{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver driver = Capabilities();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		TouchAction t = new TouchAction(driver);
		//Had to add implicitlyWait for the next click
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		//Long Press
		t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction().release().perform();
		//Found using resource id
		System.out.println(driver.findElementById("android:id/alertTitle").getText());
			
	}

}
