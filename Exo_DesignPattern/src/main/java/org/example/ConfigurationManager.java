package org.example;

import java.util.Map;

public class ConfigurationManager {

    private static ConfigurationManager instance;
    private Map<String, String> configuration;

    private ConfigurationManager (){}

    public static synchronized ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void loadConfiguration(Map<String, String> config){
        if(configuration == null){
            configuration = config;
        }else {
            System.out.println("Configuration déjà chargées !!");
        }
    }

    public String getConfiguration(String key){
        return configuration.getOrDefault(key, "key do not exist");
    }
}
