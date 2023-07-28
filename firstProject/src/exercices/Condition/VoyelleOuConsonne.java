package exercices.Condition;

import java.util.Scanner;

public class VoyelleOuConsonne {
    public static void main(String[] args) {
        /*1. Créer une variable caractere
        2. Affecter une valeur à la variable caractere
        3. A l'aide des structures conditionnelles, déterminer si le caractère est une consonne ou une voyelle*/

        Scanner scanner = new Scanner(System.in);
        char caracter;

        System.out.println(" Saisir un caractère :");
        caracter = scanner.next().charAt(0);

        switch (caracter){
            case 'a':
                System.out.println("Le caractère saisie est une voyelle");
                break;
            case 'e':
                System.out.println("Le caractère saisie est une voyelle");
                break;
            case 'o':
                System.out.println("Le caractère saisie est une voyelle");
                break;
            case 'u':
                System.out.println("Le caractère saisie est une voyelle");
                break;
            case 'i':
                System.out.println("Le caractère saisie est une voyelle");
                break;
            case 'y':
                System.out.println("Le caractère saisie est une voyelle");
                break;
            default:
                System.out.println("Le caractère saisie est une consonne");
        }
    }
}
