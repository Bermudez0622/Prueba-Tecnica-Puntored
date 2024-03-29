import java.util.Scanner;

public class C {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int repetitions = Integer.parseInt(scan.nextLine().trim());

        String[] inputs = new String[repetitions];

        for (int i = 0; i < repetitions; i++) {
            inputs[i] = scan.nextLine().trim();
        }

        for(String input : inputs) {
            String[] values = input.split(" ");

            int amount = Integer.parseInt(values[0]);
            long cost = Long.parseLong(values[1]);
            String result = Long.toString(amount * cost);

            System.out.println(result.length() == 5? "NO" : "SI");

        }

        scan.close();

    }

}
