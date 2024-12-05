package org.example.Ex05Decorator;

public abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

//    @Override
//    public String transform(){
//        return textaDeco.transform();
//    }

}
