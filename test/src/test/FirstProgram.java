package test;
import org.junit.Before;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.CapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstProgram {

WebDriver driver;



public void setUp() throws MalformedURLException{
	 File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
capabilities.setCapability("autoGrantPermissions", "true");
driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);      
}
}