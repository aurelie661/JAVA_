package exercices.Condition;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettreNombreCaractereSpecial {
    public static void main(String[] args) {
        /*1. Créer une variable caractere
        * 2. Affecter une valeur à la variable caractere
        * 3. Afficher un message en fonction du type du caractere (lettre,nombre ou caractere special*/

        char character;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un caractere");
        character = scanner.next().charAt(0);


        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)){
            System.out.println(character+ " : est une lettre de l'alphabet");
        }else if (character >= 48 && character <= 57) {
            System.out.println(character+ " : est un caractère numérique");
        }else {
            System.out.println(character+ " : est un caractère spécial ");
        }
    }
}
