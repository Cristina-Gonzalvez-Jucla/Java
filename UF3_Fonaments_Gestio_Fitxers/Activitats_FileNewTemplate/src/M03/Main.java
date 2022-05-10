package M03;

import java.io.*;

public class Main {
    /**
     * Mètode inicial
     *
     * @param args
     */
    public static void main(String[] args) {
        write();
        read();
    }

    /**
     * Mètode d'escriptura d'objectes de classes complexes a fitxer binari
     */
    public static void write() {

        M03.Car[] cars = new M03.Car[3];
        cars[0] = new M03.Car("Opel", "Zafira", 5);
        cars[1] = new M03.Car("Ford", "Fiesta", 5);
        cars[2] = new M03.Car("Ford", "Focus", 5);

        FileOutputStream fileOut = null;
        ObjectOutputStream output = null;
        try {
            fileOut = new FileOutputStream("objects.data");
            output = new ObjectOutputStream(fileOut);

            for (int i = 0; i < cars.length; i++) {
                output.writeObject(cars[i]);
            }

            System.out.println("Operació d'escriptura acabada");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /**
     * Mètode de lectura d'objectes de classes complexes en binari
     */
    public static void read() {
        FileInputStream fileIn = null;
        ObjectInputStream input = null;
        try {
            fileIn = new FileInputStream("objects.data");
            input = new ObjectInputStream(fileIn);

            // Legirem objectes del fitxer binari fins que salti l'error de EOFException
            while (true) {
                // Convertim l'objecte llegir a un objecte de la classe Car. Cast to Car.
                M03.Car car = (M03.Car) input.readObject();
                // Imprimim els atributs del cotxe llegtit.
                System.out.println(car.toString());
            }

        } catch (EOFException eof) {
            System.out.println("ERROR: " + eof);
        } catch (Exception e) {
            System.out.printf("ERROR: Desconegut. " + e);
        } finally {
            // Si el buffer de lectura binari s'ha pogut inicialitzar, el tanquem.
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // Si el fitxer binari s'ha pogut obrir en mode lectura, el tanquem.
            if (fileIn != null) {
                try {
                    fileIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
