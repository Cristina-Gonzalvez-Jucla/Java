public class task_02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        try{
            for (int i = 0; i < 8; i++) {
                numeros[i] = i;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: l'array ocupa mes espais del que te");
        }
    }
}
