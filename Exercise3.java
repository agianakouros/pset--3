import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Height:");
        double height = in.nextDouble();

        System.out.println("Width:");
        double width = in.nextDouble();

        double answer = width * height;
        double finished = answer * (25.4 * 25.4);

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println(commaFormat.format(finished) + " square millimeters.");

        in.close();
    }
}