package com.sam;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by root on 5/8/17.
 */
public class ConfigUtil {

    private static final Properties properties = new Properties();
    private String filePath ;

    ConfigUtil(String filePath){
        this.filePath = filePath;
    }

    public void readProperties(){
        try {
            String stage=System.getProperty("stage");
            InputStream systemConfigInputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("/"+stage + "-" + filePath);
            // load a properties file
            properties.load(systemConfigInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
