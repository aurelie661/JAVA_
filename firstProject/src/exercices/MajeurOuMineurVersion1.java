package exercices;

import java.util.Scanner;

public class MajeurOuMineurVersion1 {
    public static void main(String[] args) {
        int age = 46;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir votre age :");
        age = scanner.nextInt();

        System.out.println(age > 18);
    }
}
