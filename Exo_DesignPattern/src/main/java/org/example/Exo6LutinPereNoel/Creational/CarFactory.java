package org.example.Exo6LutinPereNoel.Creational;

import org.example.Exo6LutinPereNoel.IObjet;

public class CarFactory extends ObjectFactory{
    @Override
    public IObjet createObjet() {
        return new Car();
    }
}
