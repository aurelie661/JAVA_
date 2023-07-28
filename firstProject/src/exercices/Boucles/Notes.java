package exercices.Boucles;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        /*1. Créer une variable stockant le nombre de notes à saisir
        * 2. Afficher la note la plus haute
        * 3. Afficher la note la plus basse
        * 4. Afficher la moyenne des notes
        * 5. !! La note doit être comprise entre 0 et 20*/

        int nbNote;
        double min = 0;
        double max = 0;
        double somme = 0;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre de notes : ");
        nbNote = scanner.nextInt();

        // Verification du nombre de notes (toujours positif)
        while (nbNote < 1) {
            System.out.println("Saisie incorrecte : ");
            nbNote = scanner.nextInt();
        }

        for (int cptNote = 1; cptNote < nbNote + 1; cptNote++) {

            System.out.printf("\rnote %d : ", cptNote);
            double note = scanner.nextDouble();

            // Vérification de la note entre 0 et 20
            while (note < 0 || note > 20) {
                System.out.println("Saisie incorrecte : ");
                note = scanner.nextDouble();
            }

            // Si une seule note, alors à la fois max, min et moyenne
            if (cptNote == 1) {
                min = note;
                max = note;
            }

            if (note > max) {
                max = note;
            }


            if (note < min) {
                min = note;
            }

            somme += note;

        }

        System.out.println("La note max est : " + max);
        System.out.println("La note min est : " + min);
        System.out.println("La moyenne est de : " + (somme / nbNote));
    }
}
