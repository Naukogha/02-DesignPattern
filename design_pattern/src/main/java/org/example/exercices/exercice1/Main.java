package org.example.exercices.exercice1;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        configurationManager.loadConfiguration(Map.of(
                "db.host","localhost",
                "db.port","5432",
                "app.name","MyApplication"
        ));


        System.out.println(configurationManager.getConfiguration("app.name"));


        configurationManager.loadConfiguration(Map.of(
                "toto","tata"
        ));
    }
}
