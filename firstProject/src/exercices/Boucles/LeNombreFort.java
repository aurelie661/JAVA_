package exercices.Boucles;

import java.util.Scanner;

public class LeNombreFort {
    /*1. Un nombre fort est un nombre dont la somme de la factorielle des
chiffres qui le constitue est égale àce nombre
2. Par exemple : 145 = 1! + 4! + 5! soit 145 = 1 + 24 + 120
3. Écrire un programme qui permet de savoir si un nombre est fort*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir un nombre : ");

        int nbEntre  = scanner.nextInt();
        int saveNb = nbEntre;

        int sum = 0;

        while (nbEntre > 0) {

            int dernierchiffre = nbEntre % 10;

            int resFacto = 1;
            for (int i = dernierchiffre; i > 1; i--) {
                resFacto *= i;
            }

            sum += resFacto;

            nbEntre /= 10;
        }

        if (sum == saveNb) {
            System.out.printf("%d est un chiffre fort !", saveNb);
        } else {
            System.out.printf("%d n'est pas un chiffre fort...", saveNb);
        }
    }
}
