package ventana;

import javax.swing.*;
import java.awt.*;

/**
 * JFran es una clase donde podemos crear ventanas y poner objetos en ellas
 */

public class Ventana extends JFrame {

    /**
     * Constructor de Ventana
     */

    public Ventana() { /*Constructor*/
        /*Establecer tamaño ventana*/
        this.setSize(500, 500);//Establecer tamaño ventana, el primero es el ancho y el segudo es el largo
        setTitle("Calculadora"); //Establecer tituto String

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE); // Metodo que terminara el proceso al
        // cerrar la ventana des de la cruz, de esta manera no sera necesario parar el
        // programa despues de cerrar la ventana.

        //La ventana al ejecutar el programa por defecto estara posocionada en la parte superior izquiera
        //de nuestra pantalla (cordenadas por defecto 0,0(x, y)) para poder posicionarla donde queramos vamos
        // a utilizar el setLocation()

        //Definicion de setLocation; mueve la ventana segun la cordenada que le demos para eso sera necesario
        // pasarle dos argumentos (x, y)
        /**setLocation(100,200); //Establecemos la posicion inicial de la ventana*/

        //Con setBound podremos juntar las caracteristicas dek setSize y setLocation
        //Los dos parametros van a ser la posicion de la ventana (x, y) y los segundos dos el tamaño de
        //la ventana (with, height)
        /**setBounds(100, 200,500,500);*/ //En caso de querer posiocionar la ventana centrada para todas las
        //pantallas sera necesario utilizar el setSize

        //si le damos el valor null la ventana se posicionara en el centro de la pantalla
        setLocationRelativeTo(null);
    }

    /**
     * Metodo
     */

    private void iniciarComponentes() {
        JPanel panel = new JPanel(); //Crreacion de un panel

        panel.setBackground(Color.green); //Estrablecemos el color del panel
        //Poner el panel sobre la ventana (con el dia nos referimos directamente a la ventana)
        this.getContentPane().add(panel); // agregamos panel a la ventana
    }
}
