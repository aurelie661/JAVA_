package exercices;

import java.util.Scanner;

public class MajeurOuMineurVersion1 {
    public static void main(String[] args) {
        /*1. Créer une variable age et lui affecter une valeur
        2. Vérifier si la personne est mineure ou majeure à l'aide desopérateurs logiques
        3. Afficher le résultat4.
         /!\ Ne pas utiliser de structure conditionnelle*/

        int age = 46;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir votre age :");
        age = scanner.nextInt();

        System.out.println(age > 18);
    }
}
