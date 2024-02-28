import java.math.BigInteger;
import java.util.Scanner;

public class D {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scan.nextInt();

        int numDigits = Integer.toString(number).length();

        String square = String.valueOf((long) Math.pow(number, 2));

        System.out.println(number == Integer.parseInt(square.substring(square.length() - numDigits))? "SI" : "NO");

        scan.close();

    }

}
