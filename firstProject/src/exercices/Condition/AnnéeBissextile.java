package exercices.Condition;

import java.util.Scanner;

public class AnnéeBissextile {
    static Boolean bissextile(int annee) {
        if(annee%4 == 0 && annee%100 != 0) {
            return true;
        }
        else if(annee%400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int annee;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une année :");
        annee = scanner.nextInt();
        if(bissextile(annee)){
            System.out.println(bissextile(annee));
            System.out.println(annee +" est une année bissextile");
        }else{
            System.out.println(bissextile(annee));
            System.out.println(annee +" n'est pas une année bissextile");
        }
    }
}
