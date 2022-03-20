package models;

public class Administratiu extends Treballador{

    public Administratiu(String nom, String cognom, String adreça) {
        super(nom, cognom, adreça);
    }

    @Override
    public String display() {
        return "\nNom: " + getNom() + "\nCognom: " + getCognom() + "\nAdreça: " + getAdreça();
    }


}
