package exercices;

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
        int note;
        int noteMax = 0;
        int noteMin = 0;
        float moyenne;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de notes souhaitez-vous saisir :");
        nbNote = scanner.nextInt();
        int[] tabNote = new int[nbNote];

        for (int i = 0; i < nbNote ; i++) {
            System.out.print("note "+(i+1) +":");
            note = scanner.nextInt();
            tabNote[i] = note;

        }
        for (int j = 1; j < tabNote.length+1; j++) {
            /*if(tabNote[j] > tabNote[i]){
                noteMax = tabNote[j];
            }else{
                noteMin = tabNote[j];
            }*/ //todo finir l'exo
        }

        System.out.println(noteMin);
        System.out.println(noteMax);
        System.out.println(Arrays.toString(tabNote));
    }
}
