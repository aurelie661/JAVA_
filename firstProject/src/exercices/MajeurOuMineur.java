package exercices;
import java.util.Scanner;

public class MajeurOuMineur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre age :");
        int age = scanner.nextInt();

        if (age <= 18){
            System.out.println("Vous êtes mineur, vous ne pouvez pas rentrer dans le club");
        }else{
            System.out.println("Vous êtes majeur, vous pouvez rentrer dans le club");
        }
    }
}
