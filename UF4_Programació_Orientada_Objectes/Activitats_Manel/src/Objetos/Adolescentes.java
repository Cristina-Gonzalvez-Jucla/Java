package Objetos;

import java.awt.*;
import java.util.ArrayList;

public class Adolescentes extends Departamento {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public Adolescentes() {
        generarLibros();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    @Override
    protected void generarLibros() {
        libros.add(new Libro(
                123,
                "Adolescentes1",
                "\nEva García Sáenz de Urturi",
                "\nPlaneta",
                400));

        libros.add(new Libro(
                123,
                "Adolescentes2",
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
