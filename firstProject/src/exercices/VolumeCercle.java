package exercices;

import java.util.Scanner;

public class VolumeCercle {
    public static void main(String[] args) {
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
