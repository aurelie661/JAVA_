package exercices;

import java.util.Scanner;

public class PérimètreAndAire {
    public static void main(String[] args) {
        /*
        *1. Saisir la longueur du côté du carré et la stocker dans une variable
        * 2. Calculer l'aire et le périmètre du carré
        * */
        double  longueur, resultatPerimetre, resultatAire;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir la longueur d'un coté :");
        longueur = scanner.nextDouble();

        resultatPerimetre = 4 * longueur;
        resultatAire = longueur * longueur;
        System.out.println("Le périmètre du carré est de : " + resultatPerimetre);
        System.out.println("L'aire du carré est de : " + resultatAire);
    }
}
