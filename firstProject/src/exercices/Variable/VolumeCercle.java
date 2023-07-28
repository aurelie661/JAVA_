package exercices.Variable;

import java.util.Scanner;

public class VolumeCercle {
    public static void main(String[] args) {
        /*1. Créer un programme qui permet de calculer le volume d'un cône
        2. La formule est la suivante : 1/3 × π × r² × h*/

        double  volume;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un rayon :");
        double rayon = scanner.nextDouble();
        System.out.println("Saisir une hauteur :");
        double hauteur = scanner.nextDouble();


        volume = 1.0/3.0 * Math.PI * rayon * rayon * hauteur;
        System.out.println("Le volume du cône est de "+volume);
    }
}
