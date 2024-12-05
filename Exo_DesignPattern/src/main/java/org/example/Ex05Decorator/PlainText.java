package org.example.Ex05Decorator;

public class PlainText implements Text {
    @Override
    public String transform(){
        return "Je suis un texte";
    }
}
