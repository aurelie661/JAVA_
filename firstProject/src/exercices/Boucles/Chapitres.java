package exercices.Boucles;

import java.util.Scanner;

public class Chapitres {
    public static void main(String[] args) {
        /*1. Créer un programme qui permet d'afficher un nombre de chapitres et de sous-parties
        * 2. Le programme demandera le nombre de chapitres ainsi que le nombre de sous-parties à afficher*/

        int chapitre,sousChapitre;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre de chapitre :");
        chapitre = scanner.nextInt();
        System.out.println("Saisir un nombre de sous-chapitre :");
        sousChapitre = scanner.nextInt();

        for (int i = 1; i < chapitre +1; i++) {
            System.out.printf("Chapitre %d \n",i);
            for (int j = 1; j < sousChapitre + 1; j++) {
                System.out.printf("\tSous-chapitre %d.%d\n",i,j);
            }
        }
    }
}
