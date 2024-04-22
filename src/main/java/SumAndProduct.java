import java.util.Scanner;

public class SumAndProduct {

    public void productAndSum() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Scrie 2 numere");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int suma;
        int product;
        product = firstNumber * secondNumber;
        suma = firstNumber + secondNumber;
        System.out.println("Numerele sunt:  " + firstNumber + " si " + secondNumber);
        System.out.println("Suma numerelor este: " + suma);// Output user input
        System.out.println("Produsul numerelor este: " + product);
    }
    }

