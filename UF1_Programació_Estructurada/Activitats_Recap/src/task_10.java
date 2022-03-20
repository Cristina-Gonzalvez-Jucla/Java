/*10.Donat el següent codi sobre loops, contesta:
int[] vector = new int[5];
        for (int i = vector.length - 1; i > 2; i--) {
            vector[i] = i;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
 a) Què fa el codi? És correcte? Es pot millorar? Fes-ho.*/

public class task_10 {
    public static void main(String[] args) {
        // Creacio de la variable array vector amb una llargada de 5
        int[] vector = new int[5];

        // Iteracio de la variable i amb un valor inicial de la llargada del array menys -1, (inici array posicio final)
        // fins que el seu valor sigui 2
        for (int i = vector.length - 1; i >= 0; i--) {
            // valor final de la variable vector = posicio 3 valor 3, posicio 4 valor 4
            vector[i] = (vector.length - 1) - i;
        }

        // Iteracio de la variable i amb un valor inicial de 0 fins que no sigui superior a la llargada del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
    }
}
