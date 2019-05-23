import java.util.Scanner;

class GettingInputMethods {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String name;

        name = readName();
        printName(name);
        System.out.println(name);

    }

    public static String readName() {
        String x;
        System.out.println("Enter text; ");
        x = scan.nextLine();

        return x;
    }


    public static void printName(String name) {
        System.out.println("You've entered: " + name);
    }


}

