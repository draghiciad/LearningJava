import java.util.Scanner;

public class CheckNumberMethod {

    public static Scanner scn = new Scanner (System.in);

    public static void main(String[] args) {
        int number;


        System.out.print ("How many elements should be in the array: ");
        number = scn.nextInt ();
        int arr[] = new int[number];

        readArray (arr);
        displayArray (arr);
        checkIfPrime (arr);

    }

    public static void readArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println ("Enter the array element: ");
            array[i] = scn.nextInt ();
        }
    }

    public static void displayArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println ("Array elements: " + array[i]);
        }
    }

    public static void checkIfPrime(int array[]) {
        boolean isPrime = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i] / 2; j++) {
                if (array[i] % j == 0) {
                    isPrime = true;
                    System.out.println (array[i] + " is not prime");
                    break;
                } else {
                    System.out.println (array[i] + "is prime");
                }
            }
        }
    }
}



