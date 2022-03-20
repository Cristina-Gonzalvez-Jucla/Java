package Main;

import Objetos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Super_Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ciencia ciencia = new Ciencia();
        Historia historia = new Historia();
        Adolescentes adolescentes = new Adolescentes();
        Infantil infantil = new Infantil();
        ArrayList<Libro> todosLosLibros = new ArrayList<Libro>();

        todosLosLibros.addAll(ciencia.getLibros());
        todosLosLibros.addAll(historia.getLibros());
        todosLosLibros.addAll(adolescentes.getLibros());
        todosLosLibros.addAll(infantil.getLibros());



        int opcionMenu;

        System.out.println("¿Eres empleado? (true/false)");
        boolean empleado = scanner.nextBoolean();

        do {
            System.out.println("Indica el numero de la opcion que deseas realizar");
            System.out.println("1. Pedir libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Salir");

            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    menuLibros(todosLosLibros);
                    if (empleado == true){

                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opcionMenu != 4);
    }

    public static void menuLibros(ArrayList<Libro> todosLosLibros) {
        for (int i = 0; i < todosLosLibros.size(); i++) {
            System.out.println(i + "- " + todosLosLibros.get(i).getNombre());
        }
    }
}
