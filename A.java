import java.util.Scanner;

public class A {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        float x0 = Float.parseFloat(first[0]);
        float y0 = Float.parseFloat(first[1]);
        int r0 = Integer.parseInt(first[2]);

        float x1 = Float.parseFloat(second[0]);
        float y1 = Float.parseFloat(second[1]);
        int r1 = Integer.parseInt(second[2]);

        int radiusSum = r1 + r0;
        double distance = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));

        System.out.println(radiusSum > distance? "SI" : "NO");

    }

}
