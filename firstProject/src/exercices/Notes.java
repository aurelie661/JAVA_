package exercices;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        /*1. Créer une variable stockant le nombre de notes à saisir
        * 2. Afficher la note la plus haute
        * 3. Afficher la note la plus basse
        * 4. Afficher la moyenne des notes
        * 5. !! La note doit être comprise entre 0 et 20*/

        int nbNote;
        int noteMin,noteMax;
        float moyenne;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de notes souhaitez-vous saisir :");
        nbNote = scanner.nextInt();


        for (int i = 0; i < nbNote; i++) {
            System.out.println("note "+i+1);


        }
    }
}
//todo A finir
