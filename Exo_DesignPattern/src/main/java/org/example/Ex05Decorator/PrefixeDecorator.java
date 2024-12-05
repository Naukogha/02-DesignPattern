package org.example.Ex05Decorator;

public class PrefixeDecorator extends TextDecorator{
    public PrefixeDecorator(Text text){
        super(text);
    }

    @Override
    public String transform(){
        return text.transform().toUpperCase();
    }
}
