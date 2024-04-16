package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private static final Properties props = new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//config.properties");
            props.load(file);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }
}