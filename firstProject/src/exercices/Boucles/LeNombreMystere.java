package exercices.Boucles;

import java.util.Scanner;

public class LeNombreMystere {
    /*1. Générer un nombre aléatoire entre 1 et 100
    2. Faire saisir un nombre à l'utilisateur
    3. Si le chiffre saisi est plus grand, écrire : Le nombre est plus petit
    4. Si le chiffre saisi est plus petit, écrire : Le nombre est plus grand
    5. Si le chiffre saisi est égal au chiffre aléatoire, écrire : Vous avez gagné en X
    tentatives*/
    public static void main(String[] args) {
        int nombreMystere = (int) Math.round(Math.random() * 100) + 1;
        int nbEssais = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nVeuillez entrer un nombre : ");
            int nombreEntre = scanner.nextInt();
            nbEssais++;

            if (nombreEntre == nombreMystere) {
                break;
            } else if (nombreEntre > nombreMystere) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Trop petit !");
            }



        }

        System.out.printf("Bravo, vous avez trouvé le nombre mystère en %d essais !", nbEssais);
    }
}
