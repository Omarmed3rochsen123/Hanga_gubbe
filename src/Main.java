import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner emil = new Scanner(System.in);

        int försök = 5;
        String ord = "hamood";
        char[] ordString = {'_', '_', '_', '_', '_', '_'};

        System.out.println("Hänga gubbe mannen, skriv endast en bokstav");
        System.out.println("Du har 5 försök");

        while (försök != 0) {

            System.out.println(ordString);
            System.out.print(": ");
            String guess = emil.nextLine();

            if (!checkGuess(guess)) {
                System.out.println("Fel input, skriv endast en bokstav");
                continue;
            }

            if (ord.contains(guess)) {
                System.out.println("Emil");

            } else {

                försök -= 1;
                System.out.println("Innehåller ej: " + guess);
                System.out.println("Försök kvar: " + försök);

            }

        }

    }

    static boolean checkGuess(String guess) {
        if (guess.length() > 1 || guess.matches("[0-9]+")) {
            return false;
        }
        return true;
    }
}