package models;

import Interface.NouEmpleat;

public class Treballador implements NouEmpleat {
    private String nom;
    private String cognom;
    private String adreça;

    public Treballador(String nom, String cognom, String adreça) {
        this.nom = nom;
        this.cognom = cognom;
        this.adreça = adreça;
    }

    public Treballador() {

    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getAdreça() {
        return adreça;
    }

    public String display() {
        return "\nNom: " + nom + "\nCognom: " + cognom + "\nAdreça: " + adreça;
    }

    public String generadorIdentificador(String nom, String posicioTreball) {
        int i = 4+1;
        char ch0 = nom.charAt(0);
        char ch1 = nom.charAt(1);
        char ch2 = nom.charAt(2);

        char ch3 = posicioTreball.charAt(0);
        char ch4 = posicioTreball.charAt(1);
        char ch5 = posicioTreball.charAt(2);

        String s0 = String.valueOf(ch0);
        String s1 = String.valueOf(ch1);
        String s2 = String.valueOf(ch2);

        String s3 = String.valueOf(ch3);
        String s4 = String.valueOf(ch4);
        String s5 = String.valueOf(ch5);


        System.out.println((i++) + s3 + s4 + s5 + s0 + s1 + s2);
        return (i++) + s3 + s4 + s5 + s0 + s1 + s2;
    }

    @Override
    public void creacioEmpleat(String nom, String cognom, String adreca, int numeroSS, String posicioTreball) {
        System.out.println("Nom: " + nom + "\nCognom: " + cognom + "\nAdreça: " + adreca +
                "\nNumero Seguretat Social: " + numeroSS + "\nIdentificador Intern: "+ generadorIdentificador(nom, "ADMINISTRADOR"));
        System.out.println();
    }
}

