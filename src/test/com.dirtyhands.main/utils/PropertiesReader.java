package utils;


import java.io.*;
import java.util.Properties;

public class PropertiesReader {

    Properties prop = new Properties();

    public PropertiesReader() {
        try {
            InputStream inputStream = new FileInputStream(new File("resources/application.properties"));
            prop.load(inputStream);
        }catch (IOException e) {
//            throw new IOException("Unable to find application.properties file in resources package");
        }

    }

    public String getUrl() {
        return prop.getProperty("url");
    }






}
