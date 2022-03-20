package Objetos;

import java.util.ArrayList;

public class Infantil extends Departamento{
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public Infantil() {
        generarLibros();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    @Override
    protected void generarLibros() {
        libros.add(new Libro(
                123,
                "Infantil1",
                "\nEva García Sáenz de Urturi",
                "\nPlaneta",
                400));

        libros.add(new Libro(
                123,
                "Infantil2",
                "\nGarcía Sáenz",
                "\nPlaneta",
                55));
    }

    @Override
    public void listarLibros() {
        for (int i = 0; i < libros.size(); i++) {

            System.out.println(i + "- " + libros.get(i).nombre);
        }
    }
}
