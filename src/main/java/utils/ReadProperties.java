package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

       public static Properties readPropertiesFile() throws IOException {
        String path = System.getProperty("user.dir");
        Properties property = new Properties();
        FileInputStream fileInputStream = new FileInputStream(path + "src\\main\\resources\\Config.properties");
        property.load(fileInputStream);
           return property;
       }
}
