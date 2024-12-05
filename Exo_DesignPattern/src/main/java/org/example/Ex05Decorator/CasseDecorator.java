package org.example.Ex05Decorator;

public class CasseDecorator extends TextDecorator{
    public CasseDecorator(Text text){
        super(text);
    }

    @Override
    public String transform(){
        return text.transform().toUpperCase();
    }


}
