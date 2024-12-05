package org.example.Exo6LutinPereNoel.Structural;

import org.example.Exo6LutinPereNoel.IObjet;

public abstract class ObjetDecorateur implements IObjet {

    protected IObjet jouet;

    public ObjetDecorateur (IObjet jouet) {
        this.jouet = jouet;
    }

    @Override
    public String fabrication() {
        return jouet.fabrication();
    }


}
