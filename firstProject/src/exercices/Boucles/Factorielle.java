package exercices.Boucles;

import java.util.Scanner;

public class Factorielle {
    /*1. La factorielle d'un nombre positif est le quotient cumulatif des
nombres allant de 1 à ce nombre
2. Exemple : la factorielle de 3 est 1 x 2 x 3 = 6
3. Réaliser un programme qui affiche la factorielle d'un nombre*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder decomposition = new StringBuilder();

        System.out.print("\nVeuillez entrer un nombre positif : ");
        int nombre = scanner.nextInt();
        int result = 1;
        decomposition.append("1");

        for (int i = 2; i < nombre + 1; i++) {
            result *= i;
            decomposition.append(" x " + i);
        }

        System.out.printf("%d! = %s = %d", nombre, decomposition, result);
    }
}
