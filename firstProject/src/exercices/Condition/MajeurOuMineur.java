package exercices.Condition;
import java.util.Scanner;

public class MajeurOuMineur {
    public static void main(String[] args) {
    /*1. Créer une variable age
    2. Affecter une valeur à la variable age
    3. Créer une condition qui permet d'afficher si la personne estmajeure ou mineure*/

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
