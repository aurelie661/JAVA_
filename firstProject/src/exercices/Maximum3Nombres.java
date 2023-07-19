package exercices;

import java.util.Scanner;

public class Maximum3Nombres {
    public static void main(String[] args) {
        /*1. Créer 3 variables : nombre1, nombre2, nombre3
          2. Affecter des valeurs aux variables
          3. Créer des structures conditionnelles permettant d'afficher lemaximum parmis
             les 3 nombres créésprécédemment*/

        Scanner scanner = new Scanner(System.in);
        int nb1,nb2,nb3,nbMax;

        System.out.println(" Saisir le nombre 1:");
        nb1 = scanner.nextInt();

        System.out.println(" Saisir le nombre 2:");
        nb2 = scanner.nextInt();

        System.out.println(" Saisir le nombre 3:");
        nb3 = scanner.nextInt();

        if(nb1 > nb2 && nb1 > nb3){
            nbMax = nb1;
        }else if(nb2 > nb1 && nb2 > nb3){
            nbMax = nb2;
        }else{
            nbMax = nb3;
        }

        System.out.println("La valeur maximale est : "+ nbMax);
    }
}
