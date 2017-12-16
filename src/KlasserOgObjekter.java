import java.util.Scanner;

public class KlasserOgObjekter {

    public static void main(String[] args) {

        // Laver et objekt af klassen Scanner
        Scanner input = new Scanner(System.in);

        // Gemmer brugerens input i en int variabel
        System.out.print("Skriv et tal: ");
        int gemtInput = input.nextInt();

        // Udskriver brugerens input
        System.out.println(gemtInput);

    }

}
