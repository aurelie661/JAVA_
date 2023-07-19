package exercices;

import java.util.Scanner;

public class MiseEnFormeString {
    public static void main(String[] args) {

        /*1. Saisir une chaine et la stocker dans une variable2.
        Effectuer les traitements suivants :
        1. Afficher la chaîne en minuscule
        2. Afficher la chaîne en majuscule
        3. Bonus1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
        2. Afficher la première lettre de chaque mot en majuscule*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir une chaine :");
        String chaine = scanner.nextLine();
        System.out.println(chaine);
//------------------------------------------------------------------------
        String minus = chaine.toLowerCase();
        System.out.println("En minuscule : "+minus);
//------------------------------------------------------------------------
        String majus = chaine.toUpperCase();
        System.out.println("En majuscule : "+majus);
//------------------------------------------------------------------------
        char[] arr = new char[minus.length()];
        for (int i = 0; i < minus.length(); i++) {
            arr[i] = minus.charAt(i);
        }
        System.out.print("En tableau : ");
        for ( char x : arr) {
            System.out.print(x+",");
        }
        System.out.println();
//------------------------------------------------------------------------
        String ch1 = Character.toString(minus.charAt(0)).toUpperCase();

        System.out.println(minus.replaceFirst(ch1, String.valueOf(minus.indexOf(minus))));
        /*String[] arrMinus = new String[minus.length()];
        for (int i = 0; i < minus.length(); i++) {
            if(arrMinus[i] == arrMinus[0]){
                arrMinus[i] = ch1;
            }
            arrMinus[i] = arrMinus[i];
        }*/
        System.out.print("Premiere lettre en majuscule : ");
        System.out.println();
    }
}
