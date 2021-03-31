package base;

import common.CommonConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ReadProperties;

import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties properties;

    static {
        try {
            properties = ReadProperties.readPropertiesFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TestBase() throws IOException {
        ReadProperties.readPropertiesFile();
    }

    public static void initialize() throws IOException {
        String browserName = properties.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", CommonConstants.projectHome + "\\src\\main\\resources\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
}
