import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RealDeviceDesiredCapabilities {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "Android Device");
        desiredCapabilities.setCapability("appium:app", "/Users/THW3350/AppiumWorkshop/Apps/TheApp-v1.10.0.apk");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");

        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }
}
