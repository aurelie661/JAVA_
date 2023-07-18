package exercices;

import java.util.Scanner;

public class SommeDesCarres {
    public static void main(String[] args) {
        int carre1;
        int carre2;
        int sommeCarre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir a :");
        int a = scanner.nextInt();
        System.out.println("Saisir b :");
        int b = scanner.nextInt();

        carre1 = a * a;
        carre2 = b * b;
        sommeCarre = carre1 +carre2;

        System.out.println("La somme des carrés de a et b est : "+sommeCarre);
    }
}
