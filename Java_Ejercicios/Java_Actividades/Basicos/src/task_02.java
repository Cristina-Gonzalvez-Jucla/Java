/**
 * Declara 2 variables numéricas (con el valor que desees),
 * he indica cual es mayor de los dos. Si son iguales
 * indicarlo también.
 *
 * Ves cambiando los valores para comprobar que funciona.*/

public class task_02 {
    public static void main(String[] args) {
        int numero1 = 50;
        int numero2 = 80;

        if (numero1 < numero2){
            System.out.printf("El: " + numero2 + " es mayor que el " +  numero1);
        } else if (numero1 > numero2){
            System.out.printf("El: " + numero1 + " es mayor que el " +  numero2);
        } else {
            System.out.printf("Los numeros: " + numero1 + " " + numero2 + " son iguales");
        }
    }
}
