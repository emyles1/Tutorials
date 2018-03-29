import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

public class Raaga extends base2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {

		
		AndroidDriver driver = Capabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"World Music\"));");
		//driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
		//driver.findElementById("/com.raaga.android:id/landing_skip_to_raaga]").click();
		driver.findElementByXPath("//android.widget.TextView[@text='World Music']").click();
		driver.findElementByXPath("//android.widget.Button[@index='2']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"));");
		driver.findElementByAndroidUIAutomator("resourceId(\"com.raaga.android:id/music_home_raaga_live\")").click();
		//driver.findElementById("/com.raaga.android:id/music_home_raaga_live").click();
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Settings']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Display Languages']").click();

	}

}
