package exercices;

import java.util.Scanner;

public class PrenomNom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un prénom :");
        String firstName = scanner.nextLine();
        System.out.println("Saisir un nom :");
        String lastName = scanner.nextLine().toUpperCase();

        System.out.println("Bonjour "+firstName+" "+lastName);




    }
}
