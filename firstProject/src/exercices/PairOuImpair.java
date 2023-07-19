package exercices;

import java.util.Scanner;

public class PairOuImpair {
    public static void main(String[] args) {
        /*1. Créer une variable nombre de type entier
        2. Affecter une valeur à la variable nombre
        3. Créer une condition qui permet d'afficher si le nombre est pair ou impair
        Utiliser l'opérateur mathématique permettant de retourner le reste d'unedivision euclidienne*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre :");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Le nombre saisie est pair");
        }else{
            System.out.println("Le nombre saisie est impair");
        }

    }
}
