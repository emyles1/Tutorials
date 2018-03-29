import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class miscelleanous extends base {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
		
		AndroidDriver driver = Capabilities();
		
		System.out.println(driver.currentActivity());
		//views - Native, hybrid (app and web view), webview (browser)
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		//driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    //((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK,AndroidKeyMetastate.META_NUM_LOCK_ON);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
	    

		
	}

}
