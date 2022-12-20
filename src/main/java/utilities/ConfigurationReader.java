package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties(); // use getter encapsulation

    // we have static block because static run first
    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            System.out.println("Fail not found in configuration reader class");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){ // call for class name
        return  properties.getProperty(keyword);
    }





}
