package Objetos;

import java.util.ArrayList;

public class Ciencia extends Departamento {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public Ciencia() {
        generarLibros();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    @Override
    protected void generarLibros() {
        libros.add(new Libro(
                123,
                "Ciencias1",
                "\nEva García Sáenz de Urturi",
                "\nPlaneta",
                400));

        libros.add(new Libro(
                123,
                "Ciencias2",
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


