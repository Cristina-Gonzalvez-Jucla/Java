package main;

import obj.File;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        File file = new File("fitxers" + File.separator + "numbers.txt");
        Scanner inputFitxer = null;

        try {
            inputFitxer = new Scanner((Readable) file); // Somrient
            while (inputFitxer.hasNextInt()) {
                int value = inputFitxer.nextInt();
                System.out.println("Valor: " + value);
            }
        } catch(Exception e){
            System.out.println("ERROR!: " + e);
        }finally{
            // Tanco l'objecte Scanner vinculat al fitxer per tal de que no quedi bloquejat
            if (inputFitxer != null) {
                inputFitxer.close();
            }
        }
    }
}

