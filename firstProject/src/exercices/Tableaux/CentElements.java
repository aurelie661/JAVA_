package exercices.Tableaux;

public class CentElements {
    public static void main(String[] args) {
        /*1. Déclarer un tableau de 100 éléments et l'initialiser
        * 2. Afficher les éléments par dizaine séparés d'une virgule*/

        int[] tab = new int[100];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
            if(i % 10 == 9){
               System.out.print(tab[i] + "\n");
            }else{
                System.out.print(tab[i] + ",");
            }
        }
    }
}
