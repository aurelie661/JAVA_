package exercices;

import java.util.Scanner;

public class EtatDeLeau {
    public static void main(String[] args) {
        /*1.Définir une variable température
        * 2.Affecter une valeur à la variable température
        * 3.Selon la température, affiche l'état de l'eau:
        *               -Solide: température inférieur à 0°C
        *               -Liquide: température en tre 0 et 100°C
        *               -Gazeux: Température supérieur à 100°C*/

        float temperature;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une température :");
        temperature= scanner.nextFloat();

        if(temperature > 100){
            System.out.println("GAZEUX");
        } else if (temperature > 0) {
            System.out.println("LIQUIDE");
        }else {
            System.out.println("SOLIDE");
        }
    }
}
