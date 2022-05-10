package Moduls;

import java.lang.reflect.Array;
import java.util.Random;

public class Loteria {
    private int longitudRuleta;
    private int[] ruleta;

    public Loteria(int longitudRuleta) {
        this.longitudRuleta = longitudRuleta;
        this.ruleta = new int[longitudRuleta];
    }

    public void rellenarRuleta(int numeroPosicionesGanadoras) throws ArrayIndexOutOfBoundsException {
        if (longitudRuleta < numeroPosicionesGanadoras) {
            throw new ArrayIndexOutOfBoundsException("Has introducido demasiadas posiciones ganadoras");
        }
        int contador = 0;
        while (contador != numeroPosicionesGanadoras) {
            int i = (int) (Math.random() * longitudRuleta);
            if (ruleta[i] != 1) {
                ruleta[i] = 1;
                contador++;
            }
        }
    }

    public void imprimir() {

        for (int z = 0; z < longitudRuleta; z++) {
            System.out.println(ruleta[z]);
        }
    }

    public void lanzarLoteria() {
        int i = (int) (Math.random() * longitudRuleta);
        System.out.println("\n" + i);
        if (ruleta[i] == 1) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido");
        }
    }
}

