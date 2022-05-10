package main;

import models.GonzalvezCristina_Character;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class GonzalvezCristina_Main {
    private static final int NA = 0;

    public static <CSVReader> void main(String[] args) throws FileNotFoundException {

        ArrayList<GonzalvezCristina_Character> personatges = new ArrayList<>();

        File fichero = new File("characters_wh_semicolon.csv");

        try {
            Scanner scanner = new Scanner(fichero);
            
            String linea1 = scanner.nextLine();

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();

                String[] guaradarDatsos = linea.split(";");

                GonzalvezCristina_Character personaje = new GonzalvezCristina_Character(
                        guaradarDatsos[0],
                        Integer.parseInt(guaradarDatsos[1]),
                        Integer.parseInt(guaradarDatsos[2]),
                        guaradarDatsos[3],
                        guaradarDatsos[4],
                        guaradarDatsos[5],
                        guaradarDatsos[6],
                        guaradarDatsos[7],
                        guaradarDatsos[8],
                        guaradarDatsos[9]);

                System.out.print("\nCREADO PERSONAJE: ");

                System.out.println(personaje.toString());
                personatges.add(personaje);
            }
        } catch (FileNotFoundException ex) {
            System.out.print("ERROR: No se encuentra el archivo");
        }
    }
}
