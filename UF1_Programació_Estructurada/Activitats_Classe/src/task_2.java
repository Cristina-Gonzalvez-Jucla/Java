public class task_2 {
    public static void main(String[] args) {
        String[][] teatre = {
                {"Toni", "Pau", "Pol", "Pep"},
                {"Pere", " ", "Xin", "Josep"},
                {"Marc", "Alex", "Cris", "Maria"},
                {"Nahomy", "Jeremy", "Judith", "Roger"}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < teatre.length; j++) {
                //System.out.print(teatre[i][j] + " ");
                System.out.print(String.format(" [%7s] ", teatre[i][j]));
            }
            System.out.println();
        }
    }
}
