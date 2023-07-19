package exercices;

import java.util.Scanner;

public class PermuterVariable {
    public static void main(String[] args) {
        /*1. Écrire un programme qui permet de permuter les valeurs entredeux variables*/

        int temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir a :");
        int a = scanner.nextInt();
        System.out.println("Saisir b :");
        int b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a+" et b = "+b);
    }
}
