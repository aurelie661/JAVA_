package exercices;

import java.util.Scanner;

public class MiseEnFormeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une chaine :");
        String chaine = scanner.nextLine();
        System.out.println(chaine);

        String minus = chaine.toLowerCase();
        System.out.println("En minuscule : "+minus);

        String majus = chaine.toUpperCase();
        System.out.println("En majuscule : "+majus);

        char[] arr = new char[minus.length()];
        for (int i = 0; i < minus.length(); i++) {
            arr[i] = minus.charAt(i);
        }
        System.out.print("En tableau : ");
        for ( char x : arr) {
            System.out.print(x+",");
        }
        System.out.println();

        System.out.print("Premiere lettre en majuscule : ");
        String maj1 = minus;
        System.out.println(maj1);
    }
}
