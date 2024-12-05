package org.example.Exo6LutinPereNoel.Structural;

import org.example.Exo6LutinPereNoel.IObjet;

public class ColorDecorator extends ObjetDecorateur {

    public ColorDecorator(IObjet jouet) {
        super(jouet);
    }

    @Override
    public String fabrication(){
        return super.fabrication();
    };

}
