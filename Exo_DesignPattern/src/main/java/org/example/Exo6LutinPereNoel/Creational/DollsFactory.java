package org.example.Exo6LutinPereNoel.Creational;

import org.example.Exo6LutinPereNoel.IObjet;

public class DollsFactory extends ObjectFactory{
    @Override
    public IObjet createObjet() {
        return new Dolls();
    }
}
