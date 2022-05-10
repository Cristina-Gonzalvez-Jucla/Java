public class task_01 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;

        try {
            System.out.println(num1 / num2);
        }catch (ArithmeticException e){
            System.out.println("ERROR: No se puede dividir ningun numero entre 0");
        }finally {
            System.out.println("Eres un pringado");
        }

    }
}
