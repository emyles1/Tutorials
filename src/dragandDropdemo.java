import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class dragandDropdemo extends base{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		TouchAction t = new TouchAction(driver);
		t.longPress((WebElement) driver.findElementsByClassName("android.view.View").get(0)).moveTo((WebElement) driver.findElementsByClassName("android.view.View").get(2)).release().perform(); 

	}

}
