/*8. Donat el següent codi sobre loops, contesta:
 a) Què fa el codi? És correcte? Es pot millorar? Fes-ho.
        int[] vector = new int[5];
        for(int i=0;i<=5;i++){
            vector[i]=i;
         }
El codi no es correcte deugut a que el bucle el fem repetir 6 vegades (0 - 5) i l'array es d'allargada 5 (0 - 4)*/
public class task_8 {
    public static void main(String[] args) {
        // Creacio de la variable array vector amb una llargada de 5
        int[] vector = new int[5];
        // Iteracio de la variable i fins que el seu valor sigui menor o igual a 5
        for (int i = 0; i <= vector[vector.length - 1]; i++) {
            System.out.print(vector[i]);
        }
    }
}




