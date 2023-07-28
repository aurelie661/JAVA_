package exercices.Boucles;

import java.util.Scanner;

public class NombrePremier {
    public static void main(String[] args) {
        /*1. Un nombre premier est un nombre divisible par 1 et par soit-même
uniquement
2. 1 n'est pas un nombre premier
3. Écrire un programme qui permet de savoir si un nombre est premi*/

        int nombre;
        boolean estPremier = true;
        Scanner scanner;

        System.out.println("Saisir un nombre (>1) : ");
        scanner = new Scanner(System.in);
        nombre = scanner.nextInt();

        for(int cpt = 2; cpt < nombre; cpt++){
            if(nombre % cpt == 0){
                estPremier = false;
                break;
            }
        }

        if(estPremier){
            System.out.println("Le nombre est un nombre premier");
        }else {
            System.out.println("Le nombre n'est pas un nombre premier");
        }
    }
}
