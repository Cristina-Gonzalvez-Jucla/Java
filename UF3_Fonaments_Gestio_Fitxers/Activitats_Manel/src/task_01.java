import Moduls.Loteria;

/**Crea un programa preparado para lanzar excepciones:
        - Crea una clase llamada "Loteria" con los siguientes metodos y atributos:
        - Atributo "longitudRuleta" -> integro con la longitud de nuestra ruleta
        - Atributo "ruleta" -> array de integros
        - Metodo "rellenarRuleta" -> Recibe un numero de posiciones ganadoras y rellena el atributo "ruleta"
            con 1 en posiciones aleatorias (1 será el numero ganador)
        - Metodo "lanzarLoteria" -> Genera un numero aleatorio que será la posición de la ruleta y en caso
            de que en la posicion del numero aleatorio en la ruleta sea un 1, imprimir "Has ganado la loteria".

        - En el metodo main usaremos esta nueva clase, le asignaremos la longitud de la ruleta y rellenaremos
            las posiciones ganadoras.
        - Añade las excepciones que creas oportunas para comprobar que nuestro programa funciona correctamente.
        - Crea los tests oportunos para comprobar que todo funciona correctamente.*/
public class task_01 {
    public static void main(String[] args) {
        try {
            Loteria loteria = new Loteria(12);
            loteria.rellenarRuleta(3);
            loteria.imprimir();

            loteria.lanzarLoteria();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
