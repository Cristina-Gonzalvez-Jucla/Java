package Herencia;

public class Estudiante extends Persona{
    /**Utililizando el extends, le estamos diciendo que estudiante hedera de persona,
     * todos los metodos y atributos, entonces ahora ya no tendremos que poner, nombre, etc, si no los atributos extra*/

    private int codicoEstudiante;
    private float notaFinal;

    /**Ahora crearemos el constructor, en la clase persona ya tenemos el constructor eso significa que ya hay 3
     * atributos que están inizializados entonces aqui no hace falta volver a hacerlo,  entonces solo tenemos que
     * decirle a java (utilizando super) el nombre, el apellido y la edad ya estan inizializados dentro de
     * la clase persona, pero los atributos que hemos creado exatra si que los tenemos que inizializar, el
     * codigoEstudiante y la notaFinal*/
    public Estudiante (String nombre, String apellido, int edat, int codicoEstudiante, float notaFinal){
        super(nombre, apellido, edat);
        this.codicoEstudiante = codicoEstudiante;
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        /**Los modificadores de acceso, en persona todos los atributos estan provados, encapsulados en persona eso
         * significa que estos solo pueden ser accedidos por metodos de la misma clase, entonces si intentamos llamar
         * a nombre a secas da error porque no puede acceder a persona, para poder acceder hay dos maneras,
         *
         * La Primera Manera:
         * cambiar el modificador de acceso a protected, esto lo que hace es que a parte de que el atributo sea
         * privado para la clase ahora pueden ser accedidos por los miembros de la clase y ademas por los miembros
         * de las clases hijas de esta
         *
         * La Segunda Manera
         * vamos a dejarlo to_do private como ya estaba para mantener el encapsulamiento, vamos a utilizar los getters
         * com getNombre etc*/

        System.out.println("Nombre: "+getNombre()+
                            "\nApellido "+getApellido()+
                            "\nEdad: "+getEdad()+
                            "\nCodigo Estudiante "+codicoEstudiante+
                            "\nNota Final "+notaFinal);
    }
}
