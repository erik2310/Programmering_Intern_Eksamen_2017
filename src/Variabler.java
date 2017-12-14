import java.util.Scanner;

public class Variabler {

    // Erklæring og initialisering af en instans variabel
    int instanceVariable = 0;

    public static void main(String[] args) {

        // Erklæring og initialisering af en lokal variabel
        int localVariable = 0;

        // Et double tal værdi
        double doubleTal = 22.5;

        // Bliver typecastet til int og gemt i intTal
        int intTal = (int)doubleTal;

        // Udskriver intTal værdien
        System.out.println(intTal);

        // Laver et objekt af klassen Scanner
        Scanner input = new Scanner(System.in);

        // Gemmer brugerens input i en int variabel
        int gemtInput = input.nextInt();

        // Udskriver brugerens input
        System.out.println(gemtInput);
    }
}
