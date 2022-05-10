import java.util.*;

public class task_04 {
    private static String[] users;
    private static int userLimitLength = 15;
    private static List<String> names =
            Arrays.asList("ANTONIO", "JOSE", "...");
    private static List<String> surnames =
            Arrays.asList("GARCIA", "GONZALEZ", "...");
    private static List<String> checkedUsers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wellcome to the users generador.");
        System.out.println("How many users do you need?");
        int quantity = scanner.nextInt();
        users = generate(quantity);
        System.out.println(users);
    }

    private static String[] generate(int quantity) {
        String[] usersnew = new String[quantity];
        for (int j = 0; j < usersnew.length; j++) {
            usersnew[j] = getName();
        };

        return usersnew;
    }

    private static String getName() {
        Random rand = new Random();
        return String.format("%s %s %s",
                names.get(rand.nextInt(names.size())),
                surnames.get(rand.nextInt(surnames.size())),
                surnames.get(rand.nextInt(surnames.size())));
    }

    private void excepcion (){

    }
}
