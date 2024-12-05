package org.example.Exo6LutinPereNoel.Creational;

import org.example.Exo6LutinPereNoel.IObjet;

public class Car implements IObjet {
    @Override
    public String fabrication(){
        System.out.println("Voiture en cours de fabrication");
    }
}
