package exercices.Condition;

import java.util.Scanner;

public class JourDansLeMois {
    public static void main(String[] args) {
        int day;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Saisir un numéro de mois :");
            day = scanner.nextInt();
            if(day < 1 || day > 12){
                System.out.println("Attention les mois vont de 1 à 12!");
            }else {
                switch (day){
                    case 1,3,5,7,8,10,12 :
                        System.out.println("31 jours");
                        break;
                    case 4,6,9,11 :
                        System.out.println("30 jours");
                        break;
                    case 2 :
                        System.out.println("28 jours les années standards et 29 les nnées bissextiles");
                        break;
                    default:
                        System.out.println("pffff");
                }
            }

        }while(day < 1 || day > 7);
        System.out.println("ok c'est pafait , merci");
    }
}
