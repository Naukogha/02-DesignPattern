package org.example.Exo07Maison;

public class House {
    private int largueur;
    private int longueur;
    private int hauteur;

    public int getLargueur() {
        return largueur;
    }

    public void setLargueur(int largueur) {
        this.largueur = largueur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return " Maison { " +
                "largueur " + largueur+ '\'' +
                ", longueur='" + longueur + '\'' +
                ", hauteur=" + hauteur +
                '}';
    }
}
