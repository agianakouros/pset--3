import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Fahrenheit : ");
        double fahrenheit = in.nextDouble();

        double celsius = ((fahrenheit - 32) * (5/9));
        double kelvin = (((fahrenheit - 32) * (5/9)) + 273.15);

        String celsius2 = String.format("%.2f", celsius);
        String kelvin2 = String.format("%.2f", kelvin);

        System.out.println("Celsius : " + celsius2 );
        System.out.println("Kelvin : " + kelvin2 );

        System.out.println(fahrenheit - 32);

        in.close();
    }
}