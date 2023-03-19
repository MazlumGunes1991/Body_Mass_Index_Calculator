import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double length, weight, bodyMassIndex;

        System.out.print("Length(m): ");
        length = input.nextDouble();

        System.out.print("Weight(kg): ");
        weight = input.nextDouble();

        bodyMassIndex = (weight) / (length * length);

        System.out.print("Body Mass Index: " + bodyMassIndex);
    }
}