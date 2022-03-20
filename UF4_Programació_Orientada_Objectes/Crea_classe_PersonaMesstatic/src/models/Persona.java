package models;

import java.time.LocalDate;

import static java.time.temporal.ChronoField.YEAR_OF_ERA;

public class Persona {
    String nom;
    String cognom1;
    String cognom2;
    LocalDate dataNaixament;
    String dni;
    String genere;
    float alsada;
    boolean vacunatCovid;
    boolean majorEdat;
    boolean carnetConduir;
    int codiPostal;

    public Persona(String nom, String cognom1, String cognom2, LocalDate dataNaixament) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.dataNaixament = dataNaixament;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom1='" + cognom1 + '\'' +
                ", cognom2='" + cognom2 + '\'' +
                ", dataNaixament=" + dataNaixament +
                ", dni='" + dni + '\'' +
                ", genere='" + genere + '\'' +
                ", alsada=" + alsada +
                ", vacunatCovid=" + vacunatCovid +
                ", majorEdat=" + majorEdat +
                ", carnetConduir=" + carnetConduir +
                ", codiPostal=" + codiPostal +
                '}';
    }

    public void vacunar(String vacuna) {
        if (vacuna.equals("AstraZeneca") || vacuna.equals("Phaser") || vacuna.equals("Moderna")) {
            vacunatCovid = true;
        } else {
            vacunatCovid = false;
        }
    }

    public void dormir(){
        System.out.println("zzzzzzzzzz");
    }

    public void parlar(){
        System.out.println("bla bla bla...");
    }

    public void dirNom(){
        System.out.println(this.nom + this.cognom1 + this.cognom2);
    }

    public void mostrarEdat(){
        LocalDate dataActual = LocalDate.now();
        dataActual.get(YEAR_OF_ERA);
        int i = 2;
    }
}
