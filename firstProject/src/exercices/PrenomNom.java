package exercices;

import java.util.Scanner;

public class PrenomNom {
    public static void main(String[] args) {
        /*1. Créer une variable nom et une variable prenom
        2. Afficher la phrase suivante "Bonjour {prenom} {NOM}."
        3. Remplacer les valeurs entre chevrons par les variables crééesprécédemment*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un prénom :");
        String firstName = scanner.nextLine();
        System.out.println("Saisir un nom :");
        String lastName = scanner.nextLine().toUpperCase();

        System.out.println("Bonjour "+firstName+" "+lastName);




    }
}
