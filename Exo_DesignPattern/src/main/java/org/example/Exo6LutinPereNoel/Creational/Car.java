package org.example.Exo6LutinPereNoel.Creational;

import org.example.Exo6LutinPereNoel.IObjet;

public class Car implements IObjet {
    @Override
    public String fabrication(){
        return ("Voiture en cours de fabrication");
    }
}
