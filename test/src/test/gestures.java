package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends TestApp {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver =  Capabilities();
		//tagname[@attribute=value]
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//Tap
		TouchAction t = new TouchAction(driver);
	WebElement expandList =	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
	}
}
