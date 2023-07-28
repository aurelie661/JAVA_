package exercices.Condition;

import java.util.Scanner;

public class Candidature {
    public static void main(String[] args) {
        /*1. Ecrire un programme qui permet de verifier si un profil est valable pour une candidature
        * 2. Le profil contient trois critères:
        *       -age : supérieur à 30ans
        *       -salaire demandé : maximum 40 000€
        *       -années d'expérince : minimun 5 ans
        * 3. Afficher un message pour chaque condition non respectée*/

        int age,annee;
        double salaire;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un âge :");
        age = scanner.nextInt();
        System.out.println("Saisir le salaire souhaité :");
        salaire = scanner.nextDouble();
        System.out.println("Saisir le nombre d'années d'expériences :");
        annee = scanner.nextInt();

        if(age > 29){
            if(salaire < 41000){
                if(annee > 4){
                    System.out.println("Vous êtes le candidat parfait!");
                }
            }else if(annee > 4){
                System.out.println("Vous demandez un salaire trop élevé!");
            }else{
                System.out.println("Vous demandez un salaire trop élevé!");
                System.out.println("Vous manquez d'expérience!");
            }
        }else if(salaire < 41000){
            if(annee > 4){
                System.out.println("Vous êtes trop jeune!");
            }else{
                System.out.println("Vous manquez d'expérience!");
            }
        }else {
            System.out.println("Vous êtes trop jeune!");
            System.out.println("Vous demandez un salaire trop élevé!");
            System.out.println("Vous manquez d'expérience!");
        }
    }
}
