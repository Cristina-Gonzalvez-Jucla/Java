package Objetos;

import java.util.ArrayList;
import java.util.Collection;

public class Historia extends Departamento {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public Historia() {
        generarLibros();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    @Override
    protected void generarLibros() {
        libros.add(new Libro(
                123,
                "Historia1",
                "\nEva García Sáenz de Urturi",
                "\nPlaneta",
                400));

        libros.add(new Libro(
                123,
                "Historia2",
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


