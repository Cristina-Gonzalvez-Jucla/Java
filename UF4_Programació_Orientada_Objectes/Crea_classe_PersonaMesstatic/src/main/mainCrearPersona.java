package main;

import models.Persona;

import java.time.LocalDate;
import java.util.Scanner;

public class mainCrearPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom = null, cognom1 = null, cognom2 = null;
        LocalDate dataNaixament= null;
        Persona persona = new Persona(nom, cognom1, cognom2, dataNaixament);

        System.out.print("Indica el teu nom: ");
        nom = scanner.next();

        System.out.print("Indica el teu primer cognom: ");
        cognom1 = scanner.next();

        System.out.print("Indica el teu segon cognom: ");
        cognom2 = scanner.next();

        System.out.println("Indica el nom de la vacuna que tens posada, en cas de que no estiguis vacunas indica-ho" +
                "introduit un No: ");
        String vacuna = scanner.next();

        System.out.println("Any de naixemeny: ");
        persona.mostrarEdat();

        persona.vacunar(vacuna);

        System.out.println(persona);
        
    }
}
