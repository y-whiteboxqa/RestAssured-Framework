package com.restAssured.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

public Properties prop;
    
    public TestBase() {
        
        try {
            
            prop = new Properties();
           FileInputStream ip = new FileInputStream("/Users/yamuna/eclipse-workspace/RestAssuredBDDFramework/src/main/java/com/restAssured/config/env.properties"); 
            prop.load(ip);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
