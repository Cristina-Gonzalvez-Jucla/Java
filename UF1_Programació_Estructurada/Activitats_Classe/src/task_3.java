import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fila = 0;
        String[][] teatre = {
                {"Toni", "Pau", "Pol", "Pep"},
                {"Pere", " ", "Xin", "Josep"},
                {"Marc", "Alex", "Cris", "Maria"},
                {"Nahomy", "Jeremy", "Judith", "Roger"}
        };

        for (
                int i = 0;
                i < 4; i++) {
            for (int j = 0; j < teatre.length; j++) {
                //System.out.print(teatre[i][j] + " ");
                System.out.print(String.format(" [%7s] ", teatre[i][j]));
            }
            System.out.println();
        }
        // que el usuari se li ofereixi poder introduir quina columan o line vo mostrar
    }
}
