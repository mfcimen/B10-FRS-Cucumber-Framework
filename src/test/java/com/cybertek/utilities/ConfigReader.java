package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //to use the value from the properties file

    private static Properties properties;

    static {
        String path = "configuration.properties";

        //Java cannot read files directly, therefore we need to use FileInputStream
        //class to read files.
        //FileInputStream takes the location/path of the file as a constructor.

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            //Properties is used to read specifically Properties files, files with key-value pairs.
            properties = new Properties();

            //File contents are loaded to properties from the fileInputStream
            properties.load(fileInputStream);

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String property) {

        return properties.getProperty(property);
    }


//    public static String getProperty(String key){
//        String path = "configuration.properties";
//
//        try {
//            FileInputStream stream = new FileInputStream(path);
//            properties = new Properties();
//            properties.load(stream);
//            stream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return properties.getProperty(key);
//    }


}
