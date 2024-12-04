package org.example;

import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        configurationManager.loadConfiguration(Map.of(
                "db.host", "localhost",
                "db.port", "5432",
                "app.name", "MyAplication"
        ));


        System.out.println(configurationManager.getConfiguration("app.name"));

        configurationManager.loadConfiguration(Map.of(
                "toto","tata"
        ));
    }

}