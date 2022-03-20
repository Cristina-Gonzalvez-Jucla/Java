package Poli;

public class Vehiculo {
    protected String matriucula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matriucula, String marca, String modelo) {
        this.matriucula = matriucula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatriucula() {
        return matriucula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos() {
        return "\nMatricula: " + matriucula + "\nMarca: " + marca + "\nModelo" + modelo;
    }
}
