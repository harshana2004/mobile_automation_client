package tests;

import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest
	public void setup(){
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"");
		cap.setCapability(MobileCapabilityType.UDID,"");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		cap.setCapability()
		
		
		
	}
	
	
	@AfterTest
	public void tearDown(){
		
	}

}
