/**
 * Declara dos variables numéricas (con el valor que desees),
 * muestra por consola la suma, resta, multiplicación,
 * división y módulo (resto de la división). */

public class task_01 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println(
                "El resultado de la suma de: " + numero1 + " y " + numero2 + " es de: " + suma +
                "\nEl resultado de la resta de: " + numero1 + " y " + numero2 + " es de: " + resta +
                "\nEl resultado de la multiplicación de: " + numero1 + " y " + numero2 + " es de: " + multiplicacion +
                "\nEl resultado de la división de: " + numero1 + " y " + numero2 + " es de: " + division +
                "\nEl resultado del modulo de: " + numero1 + " y " + numero2 + " es de: " + modulo
        );
    }
}
