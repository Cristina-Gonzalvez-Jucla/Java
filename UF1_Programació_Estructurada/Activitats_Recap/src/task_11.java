/*11.Donat el següent codi sobre loops, volem que s’imprimeixi el valor de totes les
posicions del vector que tinguin un valor positiu més gran que 0.

a) Què fa el codi? Aconsegueix l’objectiu?
    inicialitza un vector aisignan-li 10 posicions, itera la longitud del vector i imprimeix el valor de cada posicio
    i en cas de que un valor del vector sigui major a 0 finalitza.

    No, ja que el programa ens demana imprimiri els valors del vector major de 0 i ara imprimeix el valor de cada
    posicio sense tenir en compte el seu valor.

b) Què passa quan trobem el primer valor igual o menor a 0? L’imprimirem?
    Si, ja que el programa imprimeix tots els valors sense tenir en compte el valor.

c) Tenint en compte el nostre objectiu, estem usant l’estructura iterativa més
adeqüada?
    No

*/
public class task_11 {
    public static void main(String[] args) {
        int[] vector = new int[]{1, 0, 3, 4, -4, 6, 7, 8, 0, 0};
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0) {
                System.out.print(vector[i]);
            }
        }
    }
}
