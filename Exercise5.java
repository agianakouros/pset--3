import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Homework 1 :");
        double homework1 = in.nextDouble();

        System.out.println("Homework 2 :");
        double homework2 = in.nextDouble();

        System.out.println("Homework 3 :");
        double homework3 = in.nextDouble();

        System.out.println("Quiz 1     :");
        double quiz1 = in.nextDouble();

        System.out.println("Quiz 2     :");
        double quiz2 = in.nextDouble();

        System.out.println("Test 1     :");
        double test1 = in.nextDouble();

        double homeworkavg = (homework1 + homework2 + homework3)/3;

        double quizavg = (quiz1 + quiz2)/2;

        double testavg = test1;

        double finalgrade = (homeworkavg * .15) + (quizavg * .35) + (testavg * .5);

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###.##");

        System.out.println(" ");
        System.out.println(commaFormat.format(finalgrade) + "%");

        in.close();
    }
}