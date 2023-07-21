package exercices;

import java.util.Scanner;

public class JourDeLaSemaine {
    public static void main(String[] args) {
        /*1. Créer une variable jour de type entier
          2. Affecter une valeur à la variable jour
          3. Afficher le jour de la semaine en lettre en fonction du nombre passé
          4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un message d'erreur*/

        int day;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Saisir un jour de la semaine :");
            day = scanner.nextInt();
            if(day < 1 || day > 7){
                System.out.println("Attention les jours de la semaine vont de 1 à 7!");
            }else {
                switch (day){
                    case 1 :
                        System.out.println("Lundi");
                        break;
                    case 2 :
                        System.out.println("Mardi");
                        break;
                    case 3 :
                        System.out.println("Mercredi");
                        break;
                    case 4 :
                        System.out.println("Jeudi");
                        break;
                    case 5 :
                        System.out.println("Vendredi");
                        break;
                    case 6 :
                        System.out.println("Samedi");
                        break;
                    case 7 :
                        System.out.println("Dimanche");
                        break;
                    default:
                        System.out.println("pffff");

                }
            }

        }while(day < 1 || day > 7);
        System.out.println("ok c'est pafait , merci");
    }
}
