package com.company;

import models.Administratiu;
import models.Directiu;
import models.Treballador;
import models.Comercial;

import java.util.ArrayList;
import java.util.Scanner;

public class TestExamen {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int opcioMenu;
        do {
            System.out.println();
            System.out.println("Indica el numero de l'opcio escollida");
            System.out.println("1. Llistar tots els treballadors");
            System.out.println("2. Donar d'alta treballador nou");
            System.out.println("3. Generar identificador intern");
            System.out.println("4. Donar de vaixa un treballador ");
            System.out.println("5. Sortir");
            opcioMenu = scanner.nextInt();

            Treballador treballador2 = new Treballador();
            ArrayList<Treballador> treballadors = new ArrayList<Treballador>();
            treballadors.add(new Administratiu("Gerard Depardieu", "Barcelona", "081441180822"));
            treballadors.add(new Directiu("John Travolta", "Brazil", "081041715804", false, false));
            treballadors.add(new Comercial("Julia Roberts", "Andorra", "081121111844", "Zona Barcelona", true, true));


            switch (opcioMenu) {
                case 1:
                    for (Treballador treballador : treballadors) {
                        System.out.println(treballador.display());
                    }
                    break;
                case 2:
                    System.out.println("Indica el numero de lloc de treball al que pertanys: ");
                    System.out.println("1. Administratiu");
                    System.out.println("2. Directiu");
                    System.out.println("3. Comercial");
                    int opcioPosicioTreball = scanner.nextInt();

                    switch (opcioPosicioTreball) {
                        case 1:
                            System.out.println("Escriu el teu nom:");
                            String nom = scanner.next();
                            System.out.println("Escriu el teu cognom:");
                            String cognom = scanner.next();
                            System.out.println("Escriu la teva adreça:");
                            String adreca = scanner.next();
                            System.out.println("Escriu el teu numero de la seguretat:");
                            int numeroSS = scanner.nextInt();
                            treballador2.creacioEmpleat(nom, cognom, adreca, numeroSS, "Administratiu");
                            break;
                        case 2:

                            break;
                        case 3:
                            break;
                    }

                    break;
                case 3:
                    int i = 4;
                    System.out.println("Escriu el teu nom: ");
                    String nom = scanner.next();
                    System.out.println("Escriu el teu departament de treball(Administratiu, Directiu, Comercial):");
                    String posicioTreball = scanner.next();

                    //treballador2.generadorIdentificador(nom, posicioTreball);
                    i++;
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (opcioMenu != 5);
    }
}
